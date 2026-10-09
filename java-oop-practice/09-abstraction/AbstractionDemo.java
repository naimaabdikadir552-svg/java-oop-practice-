abstract class Shape {
    abstract double area();
}

class Rectangle extends Shape {
    double width;
    double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        // Rectangle
        Shape shape1 = new Rectangle(5, 4);
        System.out.println("Area = " + shape1.area());
        Shape shape2 = new Circle(3);
        System.out.println("Circle Area = " + shape2.area());
    }
}