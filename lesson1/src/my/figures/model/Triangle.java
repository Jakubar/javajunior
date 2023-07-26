package my.figures.model;

public class Triangle implements  Shape {
    private double h;
    private double a;

    public Triangle() {

    }

    public Triangle(double h, double a){
        this.h = h;
        this.a = a;
    }

    public double getArea(){
        return 0.5 * h * a;
    }

    public void setH(double h){
        this.h = h;
    }

    public double getH(double h){
        return h;
    }
    public void setA(double a){
        this.a = a;
    }

    public double getA(double a){
        return a;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "h=" + h +
                ", a=" + a +
                '}' + " (" + getArea() + ")";
    }
}
