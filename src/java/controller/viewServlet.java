/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.CEX;
import model.JsonReader;
import model.ticker;

/**
 *
 * @author thand
 */
public class viewServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ArrayList<ticker> list = JsonReader.getliststickerBinanceSpot();

        CEX cexs = new CEX(1, "Binance.Spot");
        request.getSession().setAttribute("cexs", cexs);
        request.getSession().setAttribute("list", list);
        request.setAttribute("list", list);
        request.getRequestDispatcher("view/home.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String markettype = request.getParameter("markettype") + "";
        String cex = request.getParameter("cex") + "";
        ArrayList<ticker> list = (ArrayList<ticker>) request.getSession().getAttribute("list");
        if (!markettype.trim().isEmpty()) {
            switch (cex) {
                case "Binance":
                    if (markettype.equals("Spot")) {
                        list.removeAll(list);
                        list = JsonReader.getliststickerBinanceSpot();
                        request.getSession().setAttribute("list", list);
                        CEX cexs = new CEX(1, cex+"."+markettype);
                        request.getSession().setAttribute("cexs", cexs);
                    } else if (markettype.equals("Futures")) {
                        list.removeAll(list);
                        list = JsonReader.getliststickerBinanceFutures();
                        request.getSession().setAttribute("list", list);
                        CEX cexs = new CEX(1, cex+"."+markettype);
                        request.getSession().setAttribute("cexs", cexs);
                    }
                    break;
                case "kukoin":
                    if (markettype.equals("Spot")) {
                        list.removeAll(list);
                        list = JsonReader.gettickerkucoinSpot();
                        request.getSession().setAttribute("list", list);
                        CEX cexs = new CEX(1, cex+"."+markettype);
                        request.getSession().setAttribute("cexs", cexs);
                    } else if (markettype.equals("Futures")) {
                        list = JsonReader.gettickerkucoinFuteres();
                        request.getSession().setAttribute("list", list);
                        CEX cexs = new CEX(1, cex+"."+markettype);
                        request.getSession().setAttribute("cexs", cexs);
                    }
            }
        }
        
        list = fitle(request, response, list);
        request.setAttribute("list", list);
        request.getRequestDispatcher("view/home.jsp").forward(request, response);
    }

    public ArrayList<ticker> fitle(HttpServletRequest request, HttpServletResponse response,
            ArrayList<ticker> list) throws IOException {
        ArrayList<ticker> listlv1 = new ArrayList<>();

        String crate = request.getParameter("changerate") + "";
        double changerate = -100.0;
        if (!crate.isEmpty()) {
            try {
                changerate = Double.parseDouble(crate);
            } catch (Exception e) {
            }
        }
        String volume = request.getParameter("vol") + "";
        double vol = 0;
        if (!volume.isEmpty()) {
            try {
                vol = Double.parseDouble(volume.trim());
            } catch (Exception e) {
            }

        }
        if (!crate.isEmpty() && volume.isEmpty()) {
            for (ticker t : list) {
                if (Double.parseDouble(t.getChangerate()) > changerate) {
                    listlv1.add(t);
                }
            }
        }
        if (crate.isEmpty() && !volume.isEmpty()) {
            for (ticker t : list) {
                if (Double.parseDouble(t.getVolume()) > vol) {
                    listlv1.add(t);
                }
            }
        }
        if (!crate.isEmpty() && !volume.isEmpty()) {
            for (ticker t : list) {
                if (Double.parseDouble(t.getVolume()) > vol && Double.parseDouble(t.getChangerate()) > changerate) {
                    listlv1.add(t);
                }
            }
        }
        if (listlv1.isEmpty()) {
            return list;
        } else {
            return listlv1;
        }

    }
    
    

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
