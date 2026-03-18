package es.uah.matcomp.mp.e1.ejerciciosclases.c;

public class Mammal extends Animal {

    //Constructores:
    public Mammal() {
        super();
    }

    public Mammal(String n) {
        this.name = n;
    }

    //ToString
    @Override //Para asegurarnos que coincida con el de la superclase
    public String toString() {
        return "Mammal: [" + super.toString() + "]";
    }
}
