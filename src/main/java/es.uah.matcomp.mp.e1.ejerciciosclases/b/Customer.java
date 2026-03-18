package es.uah.matcomp.mp.e1.ejerciciosclases.b;

public class Customer {

    //Variables:
    private int id;
    private String name;
    private int discount;

    //Constructores:
    public Customer(int i, String n, int d) {
        this.id = i;
        this.name = n;
        this.discount = d;
    }

    //Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    //Setters:
    public void setDiscount(int newDiscount) {
        this.discount = newDiscount;
    }

    //ToString
    public String toString() {
        return name + "(" + id + ")(" + discount + "%)";
    }
}
