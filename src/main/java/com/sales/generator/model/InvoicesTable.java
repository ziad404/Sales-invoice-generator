
package com.sales.generator.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class InvoicesTable extends AbstractTableModel {
    private ArrayList<Invoice_Generator>Invoices ;
    
    private String[] columns = {"Number", "Date", "Customer", "Total"};

    public InvoicesTable(ArrayList<Invoice_Generator> Invoices) {
        this.Invoices = Invoices;
    }
    

    @Override
    public int getRowCount() {
        
        
        return Invoices.size();
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
        Invoice_Generator invoice = Invoices.get(rowIndex);
        
        switch (columnIndex) {
            case 0: return invoice.getNum();
            case 1: return invoice.getDateOfInvoice();
            case 2: return invoice.getCustomer();
            case 3: return invoice.getTotalOfInvoice();
            default : return "";
        }
    }
}
