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
public class CuentaDB {
JdbConection conexion;
Cuenta cuenta;   

public CuentaDB(){
    
    conexion=new JdbConection ();
    cuenta=null;
}

public ArrayList<Cuenta> GetCuenta()
    {
        ArrayList<Cuenta> lista = new ArrayList<Cuenta>();
        
         Statement sent = conexion.getStatement();
        if (sent == null)
            return lista;
        
        String strSQL = "SELECT id_usuario,id_cuenta,nickname FROM usuario";
   try
        {
            ResultSet rs = sent.executeQuery(strSQL);
            
            //Si exite solo un empleado con el nombre dado
            while (rs.next())
            {
                
                String correo = rs.getString("correo");
                String  cuentaBancaria = rs.getString("cuentabancaria");
                String pass =rs.getString("pass");
                String usuario=rs.getString("usuario");
                
               
                
                
                Cuenta  user = new Cuenta( correo, cuentaBancaria,pass,usuario);
                
              
                user.correo=correo;
                user.cuentaBancaria=cuentaBancaria;
                user.pass=pass;
                user.usuario= usuario;
                
                               
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
public boolean Agregar(Cuenta user)
{
    Statement sent=conexion.getStatement();
    if(sent==null)
        return false;
    String sentencia1="INSERT INTO ebd.cuenta(correo,cuentabancaria,contraseña,usuario) VALUES('";
    
    sentencia1+=user.correo+"','";
    sentencia1+=user.cuentaBancaria+"','";
    sentencia1+=user.pass+"','";
    sentencia1+=user.usuario+"')";
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
    
}
