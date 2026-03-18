package es.uah.matcomp.mp.e1.ejerciciosclases.c;

public class Staff extends Person {

    //Variables:
    private String school;
    private double pay;

    //Constructores:
    public Staff(String n, String a, String s, double p) {
        super(n, a);
        this.school = s;
        this.pay = p;
    }

    //Getters:
    public String getSchool() {
        return school;
    }

    public double getPay() {
        return pay;
    }

    //Setters:
    public void setSchool(String newSchool) {
        this.school = newSchool;
    }

    public void setPay(double newPay) {
        this.pay = newPay;
    }

    //ToString:
    @Override //Para asegurarnos que coincida con el de la superclase.
    public String toString() {
        return "Staff: [[" + super.toString() + "], pay = " + pay + "]";
    }
}
