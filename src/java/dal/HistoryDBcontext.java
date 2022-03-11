/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.History;

/**
 *
 * @author thand
 */
public class HistoryDBcontext extends DBContext {

    public ArrayList<History> getdatalinechart(String email) {
        String sql = "SELECT [Time], sum([Amount]) as [sum] \n"
                + "  FROM [history] h\n"
                + "  where h.email =?\n"
                + "  group by [Time]\n"
                + "  ORDER BY h.Time ASC";
        ArrayList<History> historys = new ArrayList<>();
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            stm = connection.prepareStatement(sql);
            stm.setString(1, email);
            rs = stm.executeQuery();
            while (rs.next()) {
                History h = new History();
                h.setTime(rs.getDate("Time"));
                h.setAmount(rs.getFloat("sum"));
                historys.add(h);
            }
            return historys;
        } catch (SQLException ex) {
            Logger.getLogger(HistoryDBcontext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ArrayList<History> getOrder(String email) {
        String sql = "SELECT  [ID]\n"
                + "      ,[Type]\n"
                + "      ,[Time]\n"
                + "      ,[Comment]\n"
                + "      ,[Symbol]\n"
                + "      ,[Amount]\n"
                + "      ,[email]\n"
                + "  FROM [history]\n"
                + "  where email=?"
                + " order by [Time] desc";
        ArrayList<History> historys = new ArrayList<>();
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            stm = connection.prepareStatement(sql);
            stm.setString(1, email);
            rs = stm.executeQuery();
            while (rs.next()) {
                History h = new History();
                h.setId(rs.getLong("ID"));
                h.setType(rs.getString("Type"));
                h.setTime(rs.getDate("Time"));
                h.setComment(rs.getString("Comment"));
                h.setSymbol(rs.getString("Symbol"));
                h.setAmount(rs.getFloat("Amount"));
                h.setEmail(email);
                historys.add(h);
            }
            return historys;
        } catch (SQLException ex) {
            Logger.getLogger(HistoryDBcontext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public History getOrderLast() {
        String sql = "SELECT top 1 [ID]\n"
                + "      ,[Type]\n"
                + "      ,[Time]\n"
                + "      ,[Comment]\n"
                + "      ,[Symbol]\n"
                + "      ,[Amount]\n"
                + "      ,[email]\n"
                + "  FROM [history]\n"
                + "  order by [Time] desc";
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            stm = connection.prepareStatement(sql);
            rs = stm.executeQuery();
            if (rs.next()) {
                History h = new History();
                h.setId(rs.getLong("ID"));
                h.setType(rs.getString("Type"));
                h.setTime(rs.getDate("Time"));
                h.setComment(rs.getString("Comment"));
                h.setSymbol(rs.getString("Symbol"));
                h.setAmount(rs.getFloat("Amount"));
                h.setEmail(rs.getString("email"));
                return h;
            }
        } catch (SQLException ex) {
            Logger.getLogger(HistoryDBcontext.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public void insertOrder(History h) {
        String sql = "INSERT INTO [history]\n"
                + "           ([ID]\n"
                + "           ,[Type]\n"
                + "           ,[Time]\n"
                + "           ,[Comment]\n"
                + "           ,[Symbol]\n"
                + "           ,[Amount]\n"
                + "           ,[email])\n"
                + "     VALUES\n"
                + "           (?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?)";
        PreparedStatement stm = null;
        try {
            stm = connection.prepareStatement(sql);
            stm.setFloat(1, h.getId());
            stm.setString(2, h.getType());
            stm.setString(3, h.getComment());
            stm.setString(4, h.getSymbol());
            stm.setFloat(5, h.getAmount());
            stm.setString(6, h.getEmail());
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(HistoryDBcontext.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
