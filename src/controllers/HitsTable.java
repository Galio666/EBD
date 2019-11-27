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
public class HitsTable extends  AbstractTableModel implements TableModelListener {
    
    ArrayList<Historial> lista;
    String[] encabezados;
    
    public HitsTable()
    {
        lista  = new ArrayList<>();
        encabezados = new String[5];
        encabezados[0] = "IDTITULO";
        encabezados[1] = "VISITAS";
        encabezados[2] = "FECHA";
     
    }
    
    public HitsTable(ArrayList<Historial> lista)
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
        
        Historial tall = lista.get(rowIndex);
        
        switch(columnIndex)
        {
            case 0: return tall.id_pelicula;
            case 1: return  tall.visitas;
            case 2: return  tall.time;
            
                        
            default: return "No emplementar";
        }
        
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        if (rowIndex<0 && columnIndex< 0)
        {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
        Historial tall = lista.get(rowIndex);
        
        switch(columnIndex)
        {
            case 0:  tall.id_pelicula = (String)aValue;
                     break;
            case 1: tall.visitas= (int)aValue;
                     break;
            case 2: tall.time= (String)aValue;
                     break;
        
            
        }
        
    }

           @Override
    public void tableChanged(TableModelEvent e) {
       
    }
    
}
