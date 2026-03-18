package es.uah.matcomp.mp.e1.ejerciciosclases.c;

public class Cat extends Mammal{

    //Constructores
    public Cat(String n) {
        this.name = n;
    }

    //Otros métodos:
    public void greets() {
        System.out.println( "Meow" );
    }

    //ToString
    @Override //Para asegurarnos que coincida con el de la superclase
    public String toString() {
        return "Cat: [" + super.toString() + "]";
    }
}
