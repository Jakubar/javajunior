package my.figures.model;

public class Rectangle implements Shape{
    private double a;
    private double b;

    public Rectangle() {

    }

    public Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double getArea(){ return a * b; }

    public void setA(double a) { this.a = a;}
    public double getA(double a) { return a; }

    public void setB (double b) { this.b = b; }
    public double getB (double b) { return b; }

    @Override
    public String toString() {
        return "Rectangle a, b = " + a + " " + b  + " (" + getArea() + ")";
    }
}
