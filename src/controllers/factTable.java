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
public class factTable extends  AbstractTableModel implements TableModelListener {
    
      ArrayList<ContenidoFact> lista;
    String[] encabezados;
    
    public factTable()
    {
        lista  = new ArrayList<>();
        encabezados = new String[5];
        encabezados[0] = "IDTITULO";
        encabezados[1] = "PLOT";
        encabezados[2] = "POSTER";
        encabezados[3] = "TITULO";
     
    }
    
    public factTable(ArrayList<ContenidoFact> lista)
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
        
        ContenidoFact tall = lista.get(rowIndex);
        
        switch(columnIndex)
        {
            case 0: return tall.id_titulo;
            case 1: return  tall.plot;
            case 2: return  tall.poster;
            case 3: return tall.titulo;
                                    
            default: return "No emplementar";
        }
        
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        if (rowIndex<0 && columnIndex< 0)
        {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
        ContenidoFact tall = lista.get(rowIndex);
        
        switch(columnIndex)
        {
            case 0:  tall.id_titulo = (String)aValue;
                     break;
            case 1: tall.plot = (String)aValue;
                     break;
            case 2: tall.poster  = (String)aValue;
                     break;
        
            case 3: tall.titulo = (String)aValue;
                     break;
            
            
        }
        
    }

           @Override
    public void tableChanged(TableModelEvent e) {
       
    }
    
    
}
