/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.history;

import controller.BaseAuthController;
import dal.HistoryDBcontext;
import java.io.IOException;
import java.util.ArrayList;
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
public class historycontroller extends BaseAuthController {

  


    @Override
    protected void processGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Account a= (Account) request.getSession().getAttribute("account");
        HistoryDBcontext hdb = new HistoryDBcontext();
        ArrayList<History> historys = hdb.getdatalinechart("12345a@gmail.com");
        request.setAttribute("historys", historys);
        request.getRequestDispatcher("view/history/history.jsp").forward(request, response);
    }

    @Override
    protected void processPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
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
