/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;

/**
 *
 * @author thand
 */
public class AccountDBContext extends DBContext {
    
    public  Account getAccount(String email, String password){
         Account Account = new Account();
        String sql = "SELECT [email]\n" +
                        "      ,[phone]\n" +
                        "      ,[firstname]\n" +
                        "      ,[lastname]\n" +
                        "      ,[gender]\n" +
                        "      ,[dob]\n" +
                        "      ,[password]\n" +
                        "  FROM [account] a\n" +
                        "  where a.email =? and a.password =?";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, email);
            stm.setString(2, password);
            stm.executeQuery();
             ResultSet rs = stm.executeQuery();
            if(rs.next())
            {
                Account account = new Account();
                account.setEmail(rs.getString("email"));
                account.setPhone(rs.getString("phone"));
                account.setFirstname(rs.getString("firstname"));
                account.setLastname(rs.getString("lastname"));
                account.setGender(rs.getBoolean("gender"));
                account.setDob(rs.getDate("dob"));
                account.setPassword(rs.getString("password"));
                return account;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public  boolean IsEmail(String email) {
        String sql = "SELECT [email]\n"
                + "  FROM [account] a\n"
                + "  where a.email = ?";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, email);
            stm.executeQuery();
             ResultSet rs = stm.executeQuery();
            if(rs.next())
            {
                
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public  void insertAccount(Account s) {
        String sql = "INSERT INTO [account]\n"
                + "           ([email]\n"
                + "           ,[phone]\n"
                + "           ,[firstname]\n"
                + "           ,[lastname]\n"
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
                + "           ,?)";
        PreparedStatement stm = null;

        try {
            stm = connection.prepareStatement(sql);
            stm.setString(1, s.getEmail());
            stm.setString(2, s.getPhone());
            stm.setNString(3, s.getFirstname());
            stm.setNString(4, s.getLastname());
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
