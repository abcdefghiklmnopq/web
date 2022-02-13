/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;

/**
 *
 * @author thand
 */
public class AccountDBContext extends DBContext {

    public ArrayList<Account> getAccount(String email) {
        ArrayList<Account> Accounts = new ArrayList<>();
        String sql = "SELECT [email]\n"
                + "      ,[password]\n"
                + "  FROM [account] a\n"
                + "  where a.email = ?";
        
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }

        return Accounts;
    }

    public void insertAccount(Account s) {
        String sql = "INSERT INTO [account]\n"
                + "           ([email]\n"
                + "           ,[phone]\n"
                + "           ,[firstname]\n"
                + "           ,[lastname]\n"
                + "           ,[passportID]\n"
                + "           ,[gender]\n"
                + "           ,[dob]\n"
                + "           ,[password])\n"
                + "     VALUES\n"
                + "           (?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?)";
        PreparedStatement stm = null;

        try {
            stm = connection.prepareStatement(sql);
            stm.setString(1, s.getEmail());
            stm.setString(2, s.getFirstname());
            stm.setString(3, s.getLastname());
            stm.setString(4, s.getPassportID());
            stm.setBoolean(5, s.isGender());
            stm.setDate(6, s.getDob());
            stm.setString(7, s.getPassword());
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (stm != null) {
                try {
                    stm.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
