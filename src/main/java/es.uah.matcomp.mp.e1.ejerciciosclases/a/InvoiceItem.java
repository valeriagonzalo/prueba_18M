package es.uah.matcomp.mp.e1.ejerciciosclases.a;

public class InvoiceItem {

    //Variables:
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    //Constructores:
    public InvoiceItem(String i, String d, int qty, double up){
        id = i;
        desc = d;
        qty = qty;
        unitPrice = up;
    }

    //Getters:

    public String getId(){
        return id;
    }

    public String getDesc(){
        return desc;
    }

    public int getQty(){
        return qty;
    }

    public double getUnitPrice(){
        return unitPrice;
    }

    public double getTotal(){
        return unitPrice * qty;
    }

    //Setters:
    public void setQty(int newQty){
        qty = newQty;
    }

    public void setUnitPrice(double newUnitPrice){
        unitPrice = newUnitPrice;
    }

    //toString:
    public String toString(){
        return "InvoiceItem: [id = " + id + " desc = " + desc + " qty = " + qty + " unitPrice = " + unitPrice + "]";
    }


}
