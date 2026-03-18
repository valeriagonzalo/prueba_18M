package es.uah.matcomp.mp.e1.ejerciciosclases.d.Animal;

public class Cat extends Animal{

    //Constructores:
    public Cat(String n) {
        super(n);
    }

    //Otros métodos:
    @Override // De animal
    public void greets() {
        System.out.println( "Meow" );
    }
}
