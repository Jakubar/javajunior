package my.figures.model;

public class Trapezoid implements Shape {
    private double a;
    private double b;
    private double h;

    public Trapezoid() {

    }
    public Trapezoid(double a, double b, double h){
        this.a = a;
        this.b = b;
        this.h = h;
    }
    public double getArea(){ return (a + b) / 2 * h; }

    public void setA(double a) { this.a = a; }
    public double getA(double a){ return a; }

    public void setB(double b) { this.b = b; }
    public double getB(double b) { return b; }

    public void setH (double h) { this.h = h; }
    public double getH (double h) { return h; }

    @Override
    public String toString() {
        return "Trapezoid{" +
                "a= " + a +
                ", b= " + b +
                ", h= " + h +
                '}'  + " (" + getArea() + ")";
    }
}
