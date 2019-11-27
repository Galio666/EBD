/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Tomas
 */
public class HistorialDB {
    
    
    Historial hist;
    JdbConection conexion;
    
    public HistorialDB(){
    
            conexion=new JdbConection ();
    }
    
    public ArrayList<Historial> GetCuenta()
    {
        ArrayList<Historial> lista;
        lista = new ArrayList<Historial>();
        
         Statement sent = conexion.getStatement();
        if (sent == null)
            return lista;
        
        String strSQL = "SELECT id_titulo,visitas,fecha FROM ebd.historial where id_usuario = 1";
   try
        {
            ResultSet rs = sent.executeQuery(strSQL);
            
            //Si exite solo un empleado con el nombre dado
            while (rs.next())
            {
                
                String id_titulo = rs.getString("id_titulo");
                int  visitas=rs.getInt("visitas");
                String fecha =rs.getString("fecha");
               
                
               
                
           hist = new Historial(id_titulo,visitas, fecha);
                
              
                hist.id_pelicula=id_titulo;
                hist.visitas=visitas;
                hist.time= fecha;
               
                
                               
                lista.add(hist);
            }
                        
        }
        catch(SQLException e)
        {
                System.out.println("ERROR: " + e.getMessage());
        }
        
        return lista;
    }

    
}
