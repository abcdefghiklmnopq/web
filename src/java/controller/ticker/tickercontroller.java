
package controller.ticker;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.ticker;
import controller.viewServlet;

/**
 *
 * @author thand
 */
public class tickercontroller extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        ArrayList<ticker> list = viewServlet.readderjson(request, response);
        
        String crate = request.getParameter("changerate2") + "";
        String volume = request.getParameter("vol2") + "";
        if(crate!=null || !crate.trim().isEmpty()){
            request.getSession().setAttribute("crate", crate);
        }
        if(volume!=null || !volume.trim().isEmpty()){
        request.getSession().setAttribute("volume", volume);}
        crate = (String) request.getSession().getAttribute("crate")+"";
        volume = (String) request.getSession().getAttribute("volume")+"";
        list = viewServlet.fitle(request, response, list, crate, volume);
        request.setAttribute("list", list);
        request.getRequestDispatcher("view/home.jsp").forward(request, response);
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
        public ArrayList<ticker> fitlelv2(HttpServletRequest request, HttpServletResponse response,
                ArrayList<ticker> list){
        String crate = request.getParameter("changerate2") + "";
        String volume = request.getParameter("vol2") + "";
        if(crate!=null || !crate.trim().isEmpty()){
            request.getSession().setAttribute("crate", crate);
        }
        if(volume!=null || !volume.trim().isEmpty()){
        request.getSession().setAttribute("volume", volume);
        }
        crate = (String) request.getSession().getAttribute("crate");
        volume = (String) request.getSession().getAttribute("volume");
        try {
            list = viewServlet.fitle(request, response, list, crate, volume);
        } catch (IOException ex) {
        }
        return list;
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
