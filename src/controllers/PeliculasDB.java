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
public class PeliculasDB {
    
    JdbConection conexion;
Pelicula pelicula;  

public PeliculasDB(){
    conexion=new JdbConection ();   
    pelicula=null;

}
    
    public ArrayList<Pelicula> GetCuenta(String text)
    {
        ArrayList<Pelicula> lista;
        lista = new ArrayList<>();
        
         Statement sent = conexion.getStatement();
        if (sent == null)
            return lista;
        
        String strSQL = "SELECT id_titulo,tipo,titulo,minduracion,generos FROM ebd.contenido where titulo Like '%"+text+"%';";
   try
        {
            ResultSet rs = sent.executeQuery(strSQL);
            
            //Si exite solo un empleado con el nombre dado
            while (rs.next())
            {
                String id_titulo = rs.getString("id_titulo");
                String tipo = rs.getString("tipo");
                String titulo=rs.getString("titulo");
                int  minDuracion = rs.getInt("minduracion");
                String generos=rs.getString("generos");
               
                
                Pelicula pelicula=new Pelicula(id_titulo, tipo, titulo, minDuracion, generos);
                 
                pelicula.id_titulo=id_titulo;
                pelicula.tipo=tipo;
                pelicula.titulo=titulo;
                pelicula.minDuracion=minDuracion;
                pelicula.generos=generos;
                
                lista.add(pelicula);
            }
                        
        }
        catch(SQLException e)
        {
                System.out.println("ERROR: " + e.getMessage());
        }
        
        return lista;
    }
    
    
    
    public ArrayList<Pelicula> GetTipo(String text)
    {
        ArrayList<Pelicula> lista;
        lista = new ArrayList<>();
        
         Statement sent = conexion.getStatement();
        if (sent == null)
            return lista;
        
        String strSQL = "SELECT id_titulo,tipo,titulo,minduracion,generos FROM ebd.contenido where tipo Like '%"+text+"%';";
   try
        {
            ResultSet rs = sent.executeQuery(strSQL);
            
            //Si exite solo un empleado con el nombre dado
            while (rs.next())
            {
                String id_titulo = rs.getString("id_titulo");
                String tipo = rs.getString("tipo");
                String titulo=rs.getString("titulo");
                int  minDuracion = rs.getInt("minduracion");
                String generos=rs.getString("generos");
               
                
                Pelicula pelicula=new Pelicula(id_titulo, tipo, titulo, minDuracion, generos);
                 
                pelicula.id_titulo=id_titulo;
                pelicula.tipo=tipo;
                pelicula.titulo=titulo;
                pelicula.minDuracion=minDuracion;
                pelicula.generos=generos;
                
                lista.add(pelicula);
            }
                        
        }
        catch(SQLException e)
        {
                System.out.println("ERROR: " + e.getMessage());
        }
        
        return lista;
    }
    
     public ArrayList<Pelicula> GetGenero(String text)
    {
        ArrayList<Pelicula> lista;
        lista = new ArrayList<>();
        
         Statement sent = conexion.getStatement();
        if (sent == null)
            return lista;
        
        String strSQL = "SELECT id_titulo,tipo,titulo,minduracion,generos FROM ebd.contenido where generos Like '%"+text+"%';";
   try
        {
            ResultSet rs = sent.executeQuery(strSQL);
            
            //Si exite solo un empleado con el nombre dado
            while (rs.next())
            {
                String id_titulo = rs.getString("id_titulo");
                String tipo = rs.getString("tipo");
                String titulo=rs.getString("titulo");
                int  minDuracion = rs.getInt("minduracion");
                String generos=rs.getString("generos");
               
                
                Pelicula pelicula=new Pelicula(id_titulo, tipo, titulo, minDuracion, generos);
                 
                pelicula.id_titulo=id_titulo;
                pelicula.tipo=tipo;
                pelicula.titulo=titulo;
                pelicula.minDuracion=minDuracion;
                pelicula.generos=generos;
                
                lista.add(pelicula);
            }
                        
        }
        catch(SQLException e)
        {
                System.out.println("ERROR: " + e.getMessage());
        }
        
        return lista;
    }
 
    
    
}
