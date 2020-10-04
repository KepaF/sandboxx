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

    public static double lenght(Point point) {
        return point.lenght();
    }
     public static Point opposite(Point point){
        return new Point(-point.x, -point.y, -point.z); //получается -0.0, убрать "-", если придётся выводить
        }
    public static Point inverse(Point point){
        return new Point(1/point.x, 1/point.y, 1/point.z); //получается -0.0, убрать "-", если придётся выводить
    }

}
