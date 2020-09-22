package com.sda.ComplexNumber;

public class ComplexNumber {

    private double realPart;
    private double imaginaryPart;
    private double y;
    private double u;


   public ComplexNumber(double realPart, double imaginaryPart){
       this.realPart = realPart;
       this.imaginaryPart = imaginaryPart;
   }

    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    @Override
    public String toString(){
       return "ComplexNumber {realPart =" + realPart + ", " + imaginaryPart +
               " = imaginaryPart}";
    }

    public double getV() {
        return y;
    }

    public void setV(double v) {
        this.y = y;
    }

    public double getU() {
        return u;
    }

    public void setU(double u) {
        this.u = u;
    }


    public String sum(){
       return "Sumowanie: " + (realPart + y) + " + " + (y + imaginaryPart) + "i";
    }
}
