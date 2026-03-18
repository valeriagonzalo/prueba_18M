package es.uah.matcomp.mp.e1.ejerciciosclases.d.Animal;

public class BigDog extends Dog{

    //COnstructores:
    public BigDog(String n) {
        super(n);
    }

    //Otros métodos:

    @Override // De animal
    public void greets() {
        System.out.println("Wooow");
    }

    @Override // De animal
    public void greets(Dog another) {
        System.out.println("Wooooooow");
    }

    public void greets(BigDog another) {
        System.out.println("Wooooooooooow");
    }
}
