/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.ArrayList;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Tomas
 */
public class PeliculasTabla extends  AbstractTableModel implements TableModelListener  {
    
     ArrayList<Pelicula> lista;
    String[] encabezados;
    
    public PeliculasTabla()
    {
        lista  = new ArrayList<>();
        encabezados = new String[5];
        encabezados[0] = "IDTITULO";
        encabezados[1] = "TIPO";
        encabezados[2] = "TITULO";
        encabezados[3] = "DURACION(MIN)";
        encabezados[4] = "GENEROS";
    }
    
    public PeliculasTabla(ArrayList<Pelicula> lista)
    {
        this();
        this.lista = lista;
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return encabezados.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex >= 0 && columnIndex < encabezados.length)
            return encabezados[columnIndex];
        
        return "Sin Nombre";
    }

    

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        Pelicula tall = lista.get(rowIndex);
        
        switch(columnIndex)
        {
            case 0: return tall.id_titulo;
            case 1: return  tall.tipo;
            case 2: return  tall.titulo;
            case 3: return tall.minDuracion;
            case 4: return tall.generos;
                        
            default: return "No emplementar";
        }
        
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        if (rowIndex<0 && columnIndex< 0)
        {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
        Pelicula tall = lista.get(rowIndex);
        
        switch(columnIndex)
        {
            case 0:  tall.id_titulo = (String)aValue;
                     break;
            case 1: tall.tipo = (String)aValue;
                     break;
            case 2: tall.titulo= (String)aValue;
                     break;
        
            case 3: tall.minDuracion = (int)aValue;
                     break;
            case 4: tall.generos=(String)aValue;
            
        }
        
    }

           @Override
    public void tableChanged(TableModelEvent e) {
       
    }
    
}
