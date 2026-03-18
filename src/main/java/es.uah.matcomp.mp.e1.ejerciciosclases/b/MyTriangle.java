package es.uah.matcomp.mp.e1.ejerciciosclases.b;

public class MyTriangle{

    //Variables:
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    //Constructores:
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    //Otros métodos:
    public double getPerimeter() {
        double side1 = v1.distance(v2); //Distancia entre el punto 1 y 2
        double side2 = v2.distance(v3); //Distancia entre el punto 2 y 3
        double side3 = v3.distance(v1); //Distancia entre el punto 3 y 1
        return side1 + side2 + side3; //Suma de los tres lados.
    }

    public String getType() {
        double side1 = v1.distance(v2); //Distancia entre el punto 1 y 2
        double side2 = v2.distance(v3); //Distancia entre el punto 2 y 3
        double side3 = v3.distance(v1); //Distancia entre el punto 3 y 1

        String type = "";

        if (side1 == side2 && side2 == side3) {
            type = "Equilateral";
        }
        else
        if (side1 == side2 || side1 == side3 || side2 == side3) {
            type = "Isosceles";
        }
        else {
            type = "Scalene";
        }
        return type;
    }

    //ToString:
    public String toString() {
        return "MyTriangle: [v1= " + v1.toString() + ", v2 = " + v2.toString() + ", v3 = " + v3.toString() + "]";
    }
}

