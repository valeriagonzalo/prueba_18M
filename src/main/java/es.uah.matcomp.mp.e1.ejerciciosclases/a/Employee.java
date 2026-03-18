package es.uah.matcomp.mp.e1.ejerciciosclases.a;

import java.awt.*;

public class Employee {

    //Variables:
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    //Constructores:
    public Employee(int i, String fm, String lm, int s){
        id = i;
        firstName = fm;
        lastName = lm;
        salary = s;
    }

    //Getters:

    public int getId(){
        return id;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getName(){
        return firstName + " " + lastName;
    }

    public int getSalary(){
        return salary;
    }

    public int getAnnualSalary(){
        return salary*12;
    }

    //Setters:
    public void setSalary(int newSalary){
        salary = newSalary;
    }

    //toString:
    public String toString(){
        return "Employee: [id = " + id + " name = " + firstName + " " + lastName + " salary = " + salary + "]";
    }

    //Otros métodos:
    public int raiseSalary(int percent) {
        salary = salary + (salary * percent / 100);
        return salary;
    }
}
