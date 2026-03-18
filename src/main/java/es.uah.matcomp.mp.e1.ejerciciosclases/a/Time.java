package es.uah.matcomp.mp.e1.ejerciciosclases.a;

public class Time {

    //Variables:
    private int hour;
    private int minute;
    private int second;

    //Constructores:
    public Time(int h, int m, int s){
        hour = h;
        minute = m;
        second = s;
    }

    //Getters:

    public int getHour(){
        return hour;
    }

    public int getMinute(){
        return minute;
    }

    public int getSecond(){
        return second;
    }

    //Setters:
    public void setHour(int newHour){
        hour = newHour;
    }

    public void setMinute(int newMinute){
        minute = newMinute;
    }

    public void setSecond(int newSecond){
        second = newSecond;
    }

    public void setTime(int newHour, int newMinute, int newSecond){
        hour = newHour;
        minute = newMinute;
        second = newSecond;
    }

    //toString:
    public String toString(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    //Otros métodos:
    public Time nextSecond(){
        second++;
        if (second == 60){
            second = 0;
            minute++;
            if (minute == 60){
                minute = 0;
                hour++;
                if(hour == 24){
                    hour = 0;
                }
            }
        }
        return this;
    }

    public Time previousSecond(){
        second --;
        if (second < 0){
            second = 59;
            minute --;
            if(minute < 0){
                minute = 59;
                hour --;
                if(hour < 0){
                    hour = 23;
                }
            }
        }
        return this;
    }
}
