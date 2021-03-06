/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.history;

import dal.HistoryDBcontext;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.History;
import controller.BaseAuthController;
import java.sql.Date;
import model.Account;

/**
 *
 * @author thand
 */
public class insertordercontroller extends BaseAuthController {


    @Override
    protected void processGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        request.getRequestDispatcher("view/history/insertorder.jsp").forward(request, response);
    }

   
    @Override
    protected void processPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Account a = (Account) request.getSession().getAttribute("account");
        HistoryDBcontext hdb = new HistoryDBcontext();
        History h= hdb.getOrderLast();
        int id = h.getId()+1;
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
        hdb.insertOrder(x);
        response.sendRedirect("search");
    
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
