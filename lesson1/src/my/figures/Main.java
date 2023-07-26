package my.figures;

import my.figures.model.*;

import javax.sound.midi.SysexMessage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {



        Circle circle1 = new Circle(2.5);
        Trapezoid trapezoid1 = new Trapezoid(1, 2, 3.5);
        Triangle traingle1 = new Triangle(3.5, 2.5);
        Rectangle rectangle1 = new Rectangle(5.534, 6.543);
        Circle circle2 = new Circle (2.5);


        // sprawdzenie czy dwa zmienne wskazują na dokładnie ten sam obiekt w pamięci
        if (circle1 == circle2){
            System.out.println("The same object");
        } else {
            System.out.println("Not the same objects");
        }


        // spr czy 2 obiekty mają identyczną wartość
        if (circle1.equals(null)){
            System.out.println("Equal object");
        } else {
            System.out.println("Not equal objects");
        }

        System.out.println("Circle: " + circle1.getArea());
        System.out.println("Trapezoid: " + trapezoid1.getArea());
        System.out.println("Triangle: " + traingle1.getArea());
        System.out.println("Rectangle: " + rectangle1.getArea());

        System.out.println("=======");


        List<Shape> figures = new ArrayList<>();
        figures.add(circle1);
        figures.add(trapezoid1);
        figures.add(rectangle1);
        figures.add(traingle1);

        for (Shape x : figures){
            System.out.println(x);
        }

        System.out.println("=======");

//        figures.remove(circle1);

        figures.stream().forEach(System.out::println);

        figures.stream().forEach(s -> System.out.println(s.getArea()));

        for(Shape x : figures){
            if (x.getArea() > 5)
                System.out.println(x);
        }

        figures.stream()
                .filter(s -> s.getArea() > 5)
                .forEach(System.out::println);

        double sum = figures.stream()
                .mapToDouble(Shape::getArea)
                .sum();
        System.out.println(sum);

        System.out.println(figures.stream().filter(s -> s.getArea() < 20).count());

        List<Shape> filteredShapes = figures.stream().filter(s -> s.getArea() < 20).collect(Collectors.toList());

        System.out.println("***");

        figures.stream().sorted(Comparator.comparing(Shape::getArea)).forEach(System.out::println);


        System.out.println("====FIGURE CHECKER ===");
        System.out.println(figureExist(figures, circle2));


    }


static boolean figureExist(Collection<Shape> shapes, Shape figure ){

        return shapes.contains(figure);

}


}



class ShapeComporator implements Comparator<Shape>{
    @Override
    public int compare(Shape o1, Shape o2) {
        return Double.compare(o1.getArea(), o2.getArea());
    }
};
