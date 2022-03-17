/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.history;

import dal.HistoryDBcontext;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Account;
import model.History;

/**
 *
 * @author thand
 */
public class updateHistory extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        HistoryDBcontext hdb = new HistoryDBcontext();
        History h= hdb.getOrder(id);
        request.setAttribute("h", h);
        request.getRequestDispatcher("view/history/updateorder.jsp").forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Account a = (Account) request.getSession().getAttribute("account");
        HistoryDBcontext hdb = new HistoryDBcontext();
        int id = Integer.parseInt(request.getParameter("id"));
        String Type =request.getParameter("Type");
        String Time = request.getParameter("Time");
        String Comment = request.getParameter("Comment");
        String Symbol = request.getParameter("Symbol");
        String Amount= request.getParameter("Amount");
        String email = a.getEmail();
        Date date = Date.valueOf(Time);
        History x = new History();
        x.setId(id);
        x.setType(Type);
        x.setComment(Comment);
        x.setTime(date);
        x.setSymbol(Symbol);
        x.setAmount(Float.parseFloat(Amount));
        x.setEmail(email);
        hdb.updateOrder(x);
        response.sendRedirect("search");

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
