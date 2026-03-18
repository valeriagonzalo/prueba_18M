package es.uah.matcomp.mp.e1.ejerciciosclases.c;

public class Animal{

    //Variables:
    protected String name;

    //Constructores:
    public Animal(){
        this.name = "";
    }

    public Animal(String n) {
        this.name = n;
    }

    //ToString:
    public String toString() {
        return "Animal: [name = " + name + "]";
    }
}
