package com.sda.Point;


import java.util.Arrays;

public class Point3D extends Point2D {

    private int z;

    private final float[] xyz = {x, y, this.z};


    public Point3D(float x, float y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public float[] getXYZ(float x, float y, int z) {
        return xyz;
    }

    public void setXYZ(float x, float y, int z) {
        this.xyz[0] = x;
        this.xyz[1] = y;
        this.xyz[2] = z;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }

   /* public float[] setXYZ(float[] xyz){
        xyz[0] = x;
        xyz[1] = y;
        xyz[2] = z;
        return xyz;
    }*/

    public String toStringTablicaXYZ(){
        String tablicaXYZ = Arrays.toString(xyz);
        return tablicaXYZ;
    }
}
