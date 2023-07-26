package my.figures.model;

import java.util.Objects;

public class Circle  implements  Shape {

    private double r;

    public Circle(){

    }

    public Circle(double r) {
        this.r = r;
    }

    public void setR(double r){ //setter (mutatotor)
        this.r = r;
    }

    public double getR(){ //getter (accessor)
        return r;
    }

    public double getArea() {
        return Math.PI * r * r;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Circle)){
            return false;
        }

        return  this.r == ((Circle)obj).r; // uwaga - niebezpieczne, ponieważ nie uwzględnia błędów zaokrągleń
    }

    @Override
    public int hashCode() {
        return Objects.hash(r);
    }

    @Override
    public String toString() {
        return "Circle r = " + r + " (" + getArea() + ")";
    }
}
