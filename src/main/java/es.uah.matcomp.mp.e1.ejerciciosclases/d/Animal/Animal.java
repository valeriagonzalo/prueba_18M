package es.uah.matcomp.mp.e1.ejerciciosclases.d.Animal;

public abstract class Animal{

    //Variables:
    private String name;

    //Constructores:
    public Animal(String n){
        this.name = n;
    }

    //Otros métodos:
    abstract void greets();

}
