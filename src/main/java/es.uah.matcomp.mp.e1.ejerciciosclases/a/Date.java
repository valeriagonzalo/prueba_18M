package es.uah.matcomp.mp.e1.ejerciciosclases.a;

public class Date {

    //Variables:
    private int day;
    private int month;
    private int year;

    //Constructores:
    public Date(int d, int m, int y){
        day = d;
        month = m;
        year = y;
    }

    //Getters:

    public int getDay(){
        return day;
    }

    public int getMonth(){
        return month;
    }

    public int getYear(){
        return year;
    }

    //Setters:
    public void setDay(int newDay){
        day = newDay;
    }

    public void setMonth(int newMonth){
        month = newMonth;
    }

    public void setYear(int newYear){
        year = newYear;
    }

    public void setDate(int newDay, int newMonth, int newYear){
        day = newDay;
        month = newMonth;
        year = newYear;
    }

    //toString:
    public String toString(){
        return day + "/" + month + "/" + year;
    }
}
