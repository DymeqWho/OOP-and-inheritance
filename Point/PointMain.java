package com.sda.Point;

public class PointMain {

    public static void main(String[] args) {

        Point2D point2D1 = new Point2D(10, 50);
        System.out.println("Punkt 2D: " + point2D1.toString());
        System.out.println();
        point2D1.setX(15);
        point2D1.setY(20);
        point2D1.setXY(point2D1.getX(), point2D1.getY());
        System.out.println("Point2D tablica: " + point2D1.toString2());
        System.out.println();
        Point3D point3D1 = new Point3D(70, 80, 10);
        System.out.println("old XYZ: " + point3D1.toString());

        point3D1.setX(50);
        point3D1.setY(40);
        point3D1.setZ(5);

        System.out.println();
        System.out.println("new XYZ: " + point3D1.toString());

        point3D1.setXYZ(10,12,5);
        System.out.println("Point3D tablica: " + point3D1.toStringTablicaXYZ());

        Point2D point = new Point3D(1,2,1);


    }
}
