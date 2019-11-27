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
public class ContenidoFactBD {
    
    
    JdbConection conexion;
Cuenta cuenta;   

public ContenidoFactBD (){
    
    conexion=new JdbConection ();
    cuenta=null;
}

public ArrayList<ContenidoFact> GetPelicula(String id)
    {
        ArrayList<ContenidoFact> lista;
        lista = new ArrayList<>();
        
         Statement sent = conexion.getStatement();
        if (sent == null)
            return lista;
        
        String strSQL = "SELECT id_titulo,plot,poster,titulo FROM ebd.data_warehouse_facts where id_titulo='"+id+"';";
   try
        {
            ResultSet rs = sent.executeQuery(strSQL);
            
            //Si exite solo un empleado con el nombre dado
            while (rs.next())
            {
                
                String id_titulo = rs.getString("id_titulo");
                String  plot = rs.getString("plot");
                String poster =rs.getString("poster");
                String titulo=rs.getString("titulo");
                
               
                
                
                ContenidoFact  user = new ContenidoFact(id_titulo, plot, poster, titulo);
                
              
                user.id_titulo=id_titulo;
                user.plot=plot;
                user.poster=poster;
                user.titulo= titulo;
                
                               
                lista.add(user);
            }
                        
        }
        catch(SQLException e)
        {
                System.out.println("ERROR: " + e.getMessage());
        }
        
        return lista;
    }

//
public boolean Agregar(ContenidoFact user)
{
    Statement sent=conexion.getStatement();
    if(sent==null)
        return false;
    String sentencia1="INSERT INTO ebd.data_warehouse_facts(fact_id,id_titulo,plot,poster,titulo) VALUES('";
    
    sentencia1+=user.fact_id+"','";
    sentencia1+=user.id_titulo+"','";
    sentencia1+=user.plot+"','";
    sentencia1+=user.poster+"','";
    sentencia1+=user.titulo+"')";
    int num=0;
    try
    {
        sent.executeUpdate(sentencia1);
    }
    catch(SQLException e)
    {
    System.out.println("Error: "+e.getMessage());
    }
    
    return true;
}


/*
public boolean Eliminar(int id_cuenta)
{
   Statement sent = conexion.getStatement();
    if (sent == null)
    return false;

    String sentencia="DELETE FROM cuenta WHERE id_cuenta='"+id_cuenta+"';";
    
    int num = 0;
        try
        {
            num = sent.executeUpdate(sentencia);
        }
        catch(SQLException e)
        {
                System.out.println("ERROR: " + e.getMessage());
        }
         return num == 1;
}

public boolean Actualizar(Cuenta cuenta)
{
Statement sent = conexion.getStatement();
if(sent==null)
    return false;
String sentencia="UPDATE cuenta SET correo='"+cuenta.correo+"',";


int num=0;
        try
        {
            num = sent.executeUpdate(sentencia);
        }
        catch(SQLException e)
        {
                System.out.println("ERROR: " + e.getMessage());
        }
        
        return num == 1;
}
*/    
    
}
