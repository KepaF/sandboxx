package ru.ssau.tk._KEPAF_._sandboxx_;

public class Points {
    private Points(){};

    static Point sum(Point point1,Point point2){
        return new Point(point1.x+point2.x,point1.y+point2.y,point1.z+point2.z);
    }
    static Point subtract(Point point1,Point point2){
        return new Point(point1.x-point2.x,point1.y-point2.y,point1.z-point2.z);
    }
    static Point multiply(Point point1,Point point2){
        return new Point(point1.x*point2.x,point1.y*point2.y,point1.z*point2.z);
    }
    static Point divide(Point point1,Point point2){
        return new Point(point1.x/point2.x,point1.y/point2.y,point1.z/ point2.z);
    }


    public static Point enlarge(Point point, double number) {
        return new Point(point.x * number, point.y * number, point.z * number);
    }

    public static double length(Point point) {
        return point.length();
    }
     public static Point opposite(Point point){
        return new Point(-point.x, -point.y, -point.z); //получается -0.0, убрать "-", если придётся выводить
        }
    public static Point inverse(Point point){
        return new Point(1/point.x, 1/point.y, 1/point.z); //получается -0.0, убрать "-", если придётся выводить
    }
   public static double scalarProduct(Point point1,Point point2){
           return point1.x * point2.x + point1.y * point2.y + point1.z * point2.z;
    }
    public static Point vectorProduct(Point point1,Point point2){
        double newX = point1.y * point2.z - point1.z * point2.y;
        double newY = point1.z * point2.x - point1.x * point2.z;
        double newZ = point1.x * point2.y - point1.y * point2.x;
        return new Point(newX, newY, newZ);}

}
