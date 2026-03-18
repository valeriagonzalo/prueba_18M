package es.uah.matcomp.mp.e1.ejerciciosclases.c;

public class Student extends Person {

    //Variables:
    private String program;
    private int year;
    private double fee;

    //Constructores:
    public Student(String n, String a, String p, int y, double f) {
        super(n, a);
        this.program = p;
        this.year = y;
        this.fee = f;
    }

    //Getters:
    public String getProgram() {
        return program;
    }

    public int getYear() {
        return year;
    }

    public double getFee() {
        return fee;
    }

    //Setters:

    public void setProgram(String newProgram) {
        this.program = newProgram;
    }

    public void setYear(int newYear) {
        this.year = newYear;
    }

    public void setFee(double newFee) {
        this.fee = newFee;
    }

    //ToString:
    @Override //Para asegurarnos que coincida con el de la superclase.
    public String toString() {
        return "Student: [[" + super.toString() + "], program = " + program + ", year = "+ year + ", fee = " + fee + "]";
    }
}

