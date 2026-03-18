package es.uah.matcomp.mp.e1.ejerciciosclases.a;

public class Account {

    //Variables:
    private String id;
    private String name;
    private int balance;

    //Constructores:
    public Account(String i, String n){
        id = i;
        name = n;
    }

    public Account(String i, String n, int b){
        id = i;
        name = n;
        balance = b;
    }

    //Getters:

    public String getID(){
        return id;
    }

    public int getBalance(){
        return balance;
    }

    public String getName(){
        return name;
    }

    //toString:
    public String toString(){
        return "Account: [id = " + id + " name = " + name + " balance = " + balance + "]";
    }

    //Otros métodos:
    public int credit (int amount){
        balance = balance + amount;
        return balance;
    }

    public int debit (int amount){
        if (amount <= balance){
            balance = balance - amount;
        }
        else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    public int transferTo(Account another, int amount){
        if (amount <= balance){
            balance = balance - amount;
            another.balance += amount;
        }
        else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
}
