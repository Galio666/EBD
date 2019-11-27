/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Tomas
 */
public class JdbConection {
    
     String url;
    static String user = "postgres";
    static String pass = "tomas1991";
    
    static Connection conn = null;
    
    public JdbConection()
    {
        this(user, pass);
    }
    public  JdbConection(String user, String pass)
    {
       
        url = "jdbc:postgresql://localhost:5432/postgres";
        
        if (conn == null)
        {
                try
                {
                    Class.forName("org.postgresql.Driver");
                    JdbConection.user = user;
                    JdbConection.pass = pass;
                    conn = DriverManager.getConnection(url, user, pass);
                }
                catch(SQLException | ClassNotFoundException e)
                {
                    System.out.println("ERROR: " + e.getMessage());
                }
            
        }   
        else
        {
            try
            {
            
                conn.close();
                JdbConection.user = user;
                JdbConection.pass = pass;
                conn = DriverManager.getConnection(url, user, pass);
            }
            catch(SQLException e)
            {
                System.out.println("ERROR: " + e.getMessage());
            }
            
        }
        
    }
    
    public Statement getStatement()
    {
        try 
        {
        if (!conn.isClosed())
            return conn.createStatement();
        else
            return null;
        }
        catch(SQLException e)
        {
                System.out.println("ERROR: " + e.getMessage());
        }
        return null;
    }
    static String getUser()
    {
        return user;
    }
    
    static String getURL()
    {
        return user;
    }
    
    public Connection getConexion()
    {
        return conn;
    }
    
    public void  closeConexion()
    {
        try {
            if (conn != null && !conn.isClosed())
                conn.close();
        }
        catch(SQLException e)
        {
            System.out.println("ERROR: "+e.getMessage());
        }
    }
    
    
    
    
}
