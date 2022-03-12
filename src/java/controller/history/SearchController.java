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
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Account;
import model.History;


public class SearchController extends BaseAuthController {


    @Override
    protected void processGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Account a = (Account) request.getSession().getAttribute("account");
        HistoryDBcontext hdb = new HistoryDBcontext();
        int pagesize = 10;
        String page = request.getParameter("page");
        if(page ==null || page.trim().length() ==0)
            page= "1";
        int pageindex =Integer.parseInt(page);
        ArrayList<History> historys = hdb.getOrder("12345a@gmail.com",pageindex, pagesize);
        request.setAttribute("historys", historys);
        int count = hdb.count();
        int totalpage = (count%pagesize==0)?(count/pagesize):(count / pagesize)+1;
        request.setAttribute("totalpage", totalpage);
        request.setAttribute("pageindex", pageindex);
        request.getRequestDispatcher("view/history/searchorder.jsp").forward(request, response);
    }

    @Override
    protected void processPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
