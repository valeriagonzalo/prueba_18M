package es.uah.matcomp.mp.e1.ejerciciosclases.c;

public class MovablePoint extends Point {

    //Variables:
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    //Constructores:
    public MovablePoint(){
    }

    public MovablePoint(float x, float y, float xs, float ys) {
        super(x, y);
        this.xSpeed = xs;
        this.ySpeed = ys;
    }

    //Getters:
    public float getXSpeed() {
        return xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed}; //Si no creamos un nuevo array cada vez que llamemos a la función, da error.
    }

    //Setters:
    public void setXSpeed(float newXSpeed) {
        this.xSpeed = newXSpeed;
    }

    public void setYSpeed(float newYSpeed) {
        this.ySpeed = newYSpeed;
    }

    public void setSpeed(float newXSpeed, float newYSpeed) {
        this.xSpeed = newXSpeed;
        this.ySpeed = newYSpeed;
    }

    //Otros métodos:
    public MovablePoint move() {
        float xMove = super.getX();
        xMove = xMove + xSpeed;
        float yMove = super.getY();
        yMove = yMove + ySpeed;
        return this;
    }

    //ToString
    @Override //Para asegurarnos que coincida con el de la superclass
    public String toString() {
        return super.toString() + ", speed = (" + xSpeed + ", " + ySpeed + ")";
    }
}
