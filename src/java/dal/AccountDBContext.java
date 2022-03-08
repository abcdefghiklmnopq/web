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

    public Account getAccount(String email, String password) {
        PreparedStatement stm = null;
        ResultSet rs = null;
        String sql = "SELECT [email]\n"
                + "      ,[phone]\n"
                + "      ,[firstname]\n"
                + "      ,[lastname]\n"
                + "      ,[gender]\n"
                + "      ,[dob]\n"
                + "      ,[password]\n"
                + "      ,[Changerate]\n"
                + "      ,[Volume]\n"
                + "      ,[time]\n"
                + "      ,[sendemail]\n"
                + "  FROM [account] a"
                + "  where a.email =? and a.password =?";
        try {
            stm = connection.prepareStatement(sql);
            stm.setString(1, email);
            stm.setString(2, password);
            stm.executeQuery();
            rs = stm.executeQuery();
            if (rs.next()) {
                Account account = new Account();
                account.setEmail(rs.getString("email"));
                account.setPhone(rs.getString("phone"));
                account.setFirstname(rs.getString("firstname"));
                account.setLastname(rs.getString("lastname"));
                account.setGender(rs.getBoolean("gender"));
                account.setDob(rs.getDate("dob"));
                account.setPassword(rs.getString("password"));
                account.setChangerate(rs.getString("Changerate"));
                account.setVolume(rs.getString("Volume"));
                account.setTime(rs.getInt("time"));
                account.setSendemail(rs.getBoolean("sendemail"));
                return account;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stm != null) {
                    stm.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
            }
        }
        return null;
    }

    public boolean IsEmail(String email) {
        String sql = "SELECT [email]\n"
                + "  FROM [account] a\n"
                + "  where a.email = ?";
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            stm = connection.prepareStatement(sql);
            stm.setString(1, email);
            stm.executeQuery();
            rs = stm.executeQuery();
            if (rs.next()) {

                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stm != null) {
                    stm.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
            }
        }
        return false;
    }

    public void insertAccount(Account s) {

        String sql = "SELECT  [email]\n"
                + "      ,[phone]\n"
                + "      ,[firstname]\n"
                + "      ,[lastname]\n"
                + "      ,[gender]\n"
                + "      ,[dob]\n"
                + "      ,[password]\n"
                + "      ,[Changerate]\n"
                + "      ,[Volume]\n"
                + "      ,[time]\n"
                + "      ,[sendemail]\n"
                + "  FROM [account]";
        PreparedStatement stm = null;
        try {
                connection.prepareStatement(sql);
            stm = connection.prepareStatement(sql);
//            stm.setString(1, s.getEmail());
//            stm.setString(2, s.getPhone());
//            stm.setNString(3, s.getFirstname());
//            stm.setNString(4, s.getLastname());
//            stm.setBoolean(5, s.isGender());
//            stm.setDate(6, s.getDob());
//            stm.setString(7, s.getPassword());
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            try {
                if (stm != null) {
                    stm.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public void updatefilter(String Changerate, String Volume, int time, boolean sendemail, String email) {
        String sql = "UPDATE [account]\n"
                + "   SET \n"
                + "      [Changerate] = ?\n"
                + "      ,[Volume] = ?\n"
                + "      ,[time] = ?\n"
                + "      ,[sendemail] = ?\n"
                + " WHERE email=?";
        PreparedStatement stm = null;
        try {
            stm = connection.prepareStatement(sql);
            stm.setString(1, Changerate);
            stm.setString(2, Volume);
            stm.setInt(3, time);
            stm.setBoolean(4, sendemail);
            stm.setString(5, email);
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (stm != null) {
                    stm.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
            }
        }

    }

    public int getPermission(String email, String url) {
        return 1;
    }

}
