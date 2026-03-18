package es.uah.matcomp.mp.e1.ejerciciosclases.d.Animal;

public class Dog extends Animal{

    //Constructores:
    public Dog(String n) {
        super(n);
    }

    //Otros métodos:
    @Override // De animal
    public void greets() {
        System.out.println( "Woof" );
    }

    public void greets(Dog another) {
        System.out.println("Woooof");
    }
}
