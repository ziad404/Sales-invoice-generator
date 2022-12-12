
package com.sales.generator.model;

import java.util.ArrayList;
import javax.swing.event.EventListenerList;
import javax.swing.table.AbstractTableModel;


public class LinesTable extends AbstractTableModel{
      private ArrayList<LineGenerator>Lines ;
      private String[] columns = {"Number", "Item Name", "Item Price", "Count", "Item Total"};

    public ArrayList<LineGenerator> getLines() {
        return Lines;
    }

    public EventListenerList getListenerList() {
        return listenerList;
    }

    public LinesTable(ArrayList<LineGenerator> Lines) {
        this.Lines = Lines;
    }
      
      

    @Override
    public int getRowCount() {
       return Lines.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }
    
     public String getColumnName(int column)
   {
       return columns[column];
   }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         
         LineGenerator line = Lines.get(rowIndex);
        
        switch (columnIndex) {
            case 0: return line.getInvoice().getNum();
            case 1: return line.getItemName();
            case 2: return line.getIteMPrice();
            case 3: return line.getCountOfItem();
            case 4: return line.getTotalLine();
            default : return "";
        }
    }
    
}
