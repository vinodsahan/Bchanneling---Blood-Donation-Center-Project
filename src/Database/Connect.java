/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author msham
 */
public class Connect {
    private String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    
    //My PC
    private String url = "jdbc:sqlserver://localhost:1433;databaseName=bloodbank";
    private String uname = "sa";
    private String pword = "123";
    

    

    Connection a;
    static Connect c;
  

    public Connect() {
    }

    public static Connect getInstance() {

        if (c == null) {
            c = new Connect();
        }

        return c;
    }

    public Connection con() {

        try {

            //connect to db
            Class.forName(driver).newInstance();
            a = (Connection) DriverManager.getConnection(url, uname, pword);


        } catch (NullPointerException N) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, N);
        } catch (Exception ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Connection error. ", "Database Error", JOptionPane.ERROR_MESSAGE);
        }


        return a;
    }

    public void setQuery(String query) {
//when inserting data this is run
        a = con();
        try {
            Statement s = (Statement) a.createStatement();
            s.execute(query);

        } catch (NullPointerException N) {
            // JOptionPane.showMessageDialog(Connect, "Please Check Enter Your Details");
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (a == null) {
                try {
                    a.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }

    public ResultSet getQuery(String query) {
        ResultSet r = null;
//when retrieve data this is run
        a = con();
        try {
            Statement s = (Statement) a.createStatement();
            r = s.executeQuery(query);

        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (a == null) {
                try {
                    a.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return r;
    }

    public int returnQuery(String query) {
//auto incrementing values........ returns incremented row id
        a = con();

        ResultSet r = null;
        int i = 0;
        try {
            Statement s = (Statement) a.createStatement();
            s.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            r = s.getGeneratedKeys();
            r.next();
            i = r.getInt(1);

            System.out.println("i =" + i);


        } catch (NullPointerException N) {
            // JOptionPane.showMessageDialog(Connect, "Please Check Enter Your Details");
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (a == null) {
                try {
                    a.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return i;

    }
}
