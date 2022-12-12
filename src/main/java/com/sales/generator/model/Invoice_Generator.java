
package com.sales.generator.model;

import java.util.ArrayList;


public class Invoice_Generator {
    private int Num;
    private String DateOfInvoice;
    private String customer;
    private ArrayList<LineGenerator> Line ;

    public Invoice_Generator() {
        
    }

    public Invoice_Generator(int Number, String Date, String Customer) {
        this.Num = Number;
        this.DateOfInvoice = Date;
        this.customer = Customer;
    }
    
    public double getTotalOfInvoice()
    {
        double total =0.0;
        for(LineGenerator line : getLine())
        {
            total +=line.getTotalLine();
        }
        return total;
    }

    public ArrayList<LineGenerator> getLine() {
        if(Line == null)
        {
            Line=new ArrayList<>();
        }
        return Line;
    }
    

    public int getNum() {
        return Num;
    }

    public String getDateOfInvoice() {
        return DateOfInvoice;
    }

    public String getCustomer() {
        return customer;
    }

    public void setNum(int Number) {
        this.Num = Number;
    }

    public void setDateOfInvoice(String Date) {
        this.DateOfInvoice = Date;
    }

    public void setCustomer(String Customer) {
        this.customer = Customer;
    }

    @Override
    public String toString() {
        return "InvoiceClass{" + "Number=" + Num + ", Date=" + DateOfInvoice + ", Customer=" + customer + ", Line=" + Line + '}';
    }
    
    public String getCsvFile()
    {
        return Num + "," + DateOfInvoice + "," + customer;
    }
}
