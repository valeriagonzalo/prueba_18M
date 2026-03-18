package es.uah.matcomp.mp.e1.ejerciciosclases.c;

public class Point3D extends Point2D {

    //Variables:
    private float z = 0.0f; //Escribimos la f al lado del número para que sea un float, sino sería double.

    //Constructores:
    public Point3D() {
        super();
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    //Getters:
    public float getZ() {
        return z;
    }

    public float[] getXYZ() {
        return new float[]{super.getX(), super.getY(), z};
    }

    //Setters:
    public void setZ(float newZ) {
        this.z = newZ;
    }

    public void setXYZ(float newX, float newY, float newZ) {
        super.setXY(newX, newY);
        this.z = newZ;
    }

    //ToString:
    @Override //Para asegurarnos que coincida con el de la superclase.
    public String toString() {
        return "(" + super.getX()+ "," + super.getY() + "," + z + ")";
    }
}
