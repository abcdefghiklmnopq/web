/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
        request.setAttribute("list", list);
        request.getRequestDispatcher("view/home.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String markettype = request.getParameter("markettype");
        String cex = request.getParameter("cex");
        ArrayList<ticker> list = JsonReader.getliststickerBinanceSpot();
        if (markettype != null) {
            switch (cex) {
                case "Binance":
                    if (markettype.equals("Spot")) {
                        list.removeAll(list);
                        list = JsonReader.getliststickerBinanceSpot();
                    } else if (markettype.equals("Futures")) {
                        list.removeAll(list);
                        list = JsonReader.getliststickerBinanceFutures();
                    }
                    break;
                case "kukoin":
                    if (markettype.equals("Spot")) {
                        list.removeAll(list);
                        list = JsonReader.gettickerkucoinSpot();
                    } else if (markettype.equals("Futures")) {
                        list = JsonReader.gettickerkucoinFuteres();
                    }
            }
            request.setAttribute("markettype", list);
            request.setAttribute("cex", list);
        }
        ArrayList<ticker> listlv1 = new ArrayList<>();
        String crate = request.getParameter("changerate");
        double changerate=-100;
//        if (!crate.isEmpty()) {
//            changerate = Double.parseDouble(crate);
//            request.setAttribute("changerate", changerate);
//        }
//        String volume = request.getParameter("vol");
//        double vol=0;
//        if (!volume.isEmpty()) {
//            vol = Double.parseDouble(volume);
//            request.setAttribute("vol", vol);
//        }
//        if (!crate.isEmpty() && volume.isEmpty()) {
//            for (ticker t : list) {
//                if(Double.parseDouble(t.getChangerate())>changerate){
//                    listlv1.add(t);
//                }
//            }
//        }
//        if (crate.isEmpty() && !volume.isEmpty() ) {
//            for (ticker t : list) {
//                if(Double.parseDouble(t.getVolume())>vol){
//                    listlv1.add(t);
//                }
//            }
//        }
//        if (!crate.isEmpty() && !volume.isEmpty()) {
//            for (ticker t : list) {
//                if(Double.parseDouble(t.getVolume())>vol && Double.parseDouble(t.getChangerate())>changerate ){
//                    listlv1.add(t);
//                }
//            }
//        }
        if (listlv1.isEmpty()) {
            request.setAttribute("list", list);
        } else {
            request.setAttribute("list", listlv1);
        }

        request.getRequestDispatcher("view/home.jsp").forward(request, response);

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
