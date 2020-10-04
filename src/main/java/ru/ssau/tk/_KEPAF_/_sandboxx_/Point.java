package ru.ssau.tk._KEPAF_._sandboxx_;

public class Point {
    public final double x;
    public final double y;
    public final double z;
    public Point(double x, double y, double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public double lenght(){
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2));
    }

    public static void main(String[] args){
        Point firstPoint=new Point(1,1,1);
        Point secondPoint=new Point(2,0,9);
        Point thirdPoint=new Point(4,7,0);

    }
}
