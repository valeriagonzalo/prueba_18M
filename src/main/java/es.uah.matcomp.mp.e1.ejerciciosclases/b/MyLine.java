package es.uah.matcomp.mp.e1.ejerciciosclases.b;

public class MyLine {
    //Variables:
    private MyPoint begin;
    private MyPoint end;

    //Constructores:
    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1,y1);
        this.end = new MyPoint(x2,y2);
    }

    public MyLine(MyPoint b, MyPoint e) {
        this.begin = b;
        this.end = e;
    }

    //Getters:
    public MyPoint getBegin() {
        return begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public int getBeginY() {
        return begin.getY();
    }

    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    public int[] getBeginXY() {
        return begin.getXY();
    }

    public int[] getEndXY() {
        return end.getXY();
    }

    public double getLenght() {
        return begin.distance(end);
    }

    public double getGradient() {
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return Math.atan2(yDiff, xDiff);
    }

    //Setters:
    public void setBegin(MyPoint newBegin) {
        this.begin = newBegin;
    }

    public void setEnd(MyPoint newEnd) {
        this.end = newEnd;
    }

    public void setBeginX(int beginX) {
        this.begin.setX(beginX);
    }

    public void setBeginY(int beginY) {
        this.begin.setY(beginY);
    }

    public void setEndX(int endX) {
        this.end.setX(endX);
    }

    public void setEndY(int endY) {
        this.end.setY(endY);
    }

    public void setBeginXY(int x, int y) {
        this.begin.setX(x);
        this.begin.setY(y);
    }

    public void setEndXY(int x, int y) {
        this.end.setX(x);
        this.end.setY(y);
    }

    //ToString:
    public String toString() {
        return "MyLine[begin = (" + begin.getX() + "," + begin.getY() + "), end = (" + end.getX() + "," + end.getY() + ")]";
    }
}
