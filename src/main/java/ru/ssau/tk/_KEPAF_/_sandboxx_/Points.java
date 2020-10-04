package ru.ssau.tk._KEPAF_._sandboxx_;

public class Points {
    static Point sum(Point point1,Point point2){
        return new Point(point1.getX()+point2.getX(),point1.getY()+point2.getY(),point1.getZ()+point2.getZ());
    }
    static Point subtract(Point point1,Point point2){
        return new Point(point1.getX()-point2.getX(),point1.getY()-point2.getY(),point1.getZ()-point2.getZ());
    }
    static Point multiply(Point point1,Point point2){
        return new Point(point1.getX()*point2.getX(),point1.getY()*point2.getY(),point1.getZ()*point2.getZ());
    }
    static Point divide(Point point1,Point point2){
        return new Point(point1.getX()/point2.getX(),point1.getY()/point2.getY(),point1.getZ()/ point2.getZ());
    }

    private Points(){};
}
