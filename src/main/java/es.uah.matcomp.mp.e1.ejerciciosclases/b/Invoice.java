package es.uah.matcomp.mp.e1.ejerciciosclases.b;

public class Invoice {

    //Variables
    private int id;
    private Customer customer;
    private double amount;

    //Constructores:
    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    //Getters:
    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getAmount() {
        return amount;
    }

    public int getCustomerId() {
        return customer.getId();
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public int getCustomerDiscount() {
        return customer.getDiscount();
    }

    public double getAmountAfterDiscount() {
        amount = amount - customer.getDiscount() * amount / 100;
        return amount;
    }

    //Setters:
    public void setCustomer(Customer newCustomer) {
        this.customer = newCustomer;
    }

    public void setAmount(double newAmount) {
        this.amount = newAmount;
    }


    public String toString() {
        return "Invoice[id = " + id + ", customer = " + customer + ", amount = " + amount + "]";
    }
}