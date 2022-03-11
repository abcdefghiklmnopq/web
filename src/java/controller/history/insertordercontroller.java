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
        long id = h.getId()+1;
        String Type =request.getParameter("Type");
        String Time = request.getParameter("Time");
        String Comment = request.getParameter("Comment");
        String Symbol = request.getParameter("Symbol");
        String Amount= request.getParameter("Amount");
        String email = a.getEmail();
        hdb.insertOrder(h);
//        request.getRequestDispatcher("search").forward(request, response);
        response.sendRedirect("search");
    
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
