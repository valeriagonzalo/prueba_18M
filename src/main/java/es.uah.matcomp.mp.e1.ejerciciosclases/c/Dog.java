package es.uah.matcomp.mp.e1.ejerciciosclases.c;

public class Dog extends Mammal{

    //Constructores:
    public Dog(String name) {
        this.name = name;
    }

    //Otros métodos:
    public void greets() {
        System.out.println("Woof");
    }

    public void greets(Dog another) {
        System.out.println("Woooof");
    }

    //ToString:
    @Override //Para asegurarnos que coincida con el de la superclase
    public String toString() {
        return "Dog: [" + super.toString() + "]";
    }
}
