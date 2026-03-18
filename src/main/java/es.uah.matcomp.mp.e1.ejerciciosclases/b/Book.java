package es.uah.matcomp.mp.e1.ejerciciosclases.b;

public class Book {

    //Variables:
    private String isbn;
    private String name;
    private Author author;
    private double price;
    private int qty = 0;

    //Constructores:
    public Book(String isbn, String n, Author a, double p) {
        this.isbn = isbn;
        this.name = n;
        this.author = a;
        this.price = p;
    }

    public Book(String isbn, String n, Author a, double p, int qty) {
        this.isbn = isbn;
        this.name = n;
        this.author = a;
        this.price = p;
        this.qty = qty;
    }

    //Getters
    public String getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public String getAuthorName() {
        return author.getName();
    }

    //Setters:
    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public void setQty(int newQty) {
        this.qty = newQty;
    }

    //ToString:
    public String toString() {
        return "Book[isbn= "+isbn+",name= "+name+","+author+",price= "+price+",qty= "+qty+"]";
    }
}
