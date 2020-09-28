package com.sda.Point;

import java.util.Arrays;

public class Point2D {
    protected float x;
    protected float y;
    private float[] xy = {x, y};

  /*  public Point2D() {
        this.x = 0;
        this.y = 0;
    }*/

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float[] getXY() {
        return xy;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.xy[0] = this.x;
        this.xy[1] = this.y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public String toString2() {
        return "Point2D{" +
                "xy=" + Arrays.toString(xy) +
                '}';
    }
}
