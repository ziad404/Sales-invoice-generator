
package com.sales.generator.model;


public class LineGenerator {
   // private int Number;
    private String ItemName;
    private int CountOfItem;
    private double IteMPrice;
    private Invoice_Generator Invoice;


    public LineGenerator() {
    }
    public LineGenerator(int Number, String Item, int Count, double Price) {

        this.ItemName = Item;
        this.CountOfItem = Count;
        this.IteMPrice = Price;
    }
    public double getTotalLine()
    {
        return IteMPrice * CountOfItem;
    }

    public LineGenerator(String Item, int Count, double Price, Invoice_Generator Invoice) {
       // this.Number = Number;
        this.ItemName = Item;
        this.CountOfItem = Count;
        this.IteMPrice = Price;
        this.Invoice = Invoice;
    }

    public Invoice_Generator getInvoice() {
        return Invoice;
    }

   
    

   /* public int getNumber() {
        return Number;
    }*/

    public String getItemName() {
        return ItemName;
    }

    public int getCountOfItem() {
        return CountOfItem;
    }

    public double getIteMPrice() {
        return IteMPrice;
    }

   /* public void setNumber(int Number) {
        this.Number = Number;
    }*/

    public void setItemName(String Item) {
        this.ItemName = Item;
    }

    public void setCountOfItem(int Count) {
        this.CountOfItem = Count;
    }

    public void setIteMPrice(double Price) {
        this.IteMPrice = Price;
    }

    @Override
    public String toString() {
        return "LineClass{" + "Number=" + Invoice.getNum() + ", Item=" + ItemName + ", Count=" + CountOfItem + ", Price=" + IteMPrice + '}';
    }
    
    public String getCsvFile()
    {
        return Invoice.getNum() + "," + ItemName + "," + CountOfItem + "," + IteMPrice;
    }
    
}
