package shapeFactory;

abstract class Shape {
    private double x;
    private double y;
    private ShapeType type = null;

    public Shape(ShapeType type, double x, double y) {
        this.type = type;
        this.x = x;
        this.y = y;
    }

    abstract double getArea();

    abstract double getPerimeter();


}

enum ShapeType {
    RECTANGLE,
    CIRCLE
}

class Circle extends Shape {
    private final double radius;


    public Circle(ShapeType type, double x, double y, double radius) {
        super(type, x, y);
        this.radius = radius;
    }


    @Override
    double getArea() {
        return (Math.PI * Math.sqrt(radius));
    }

    @Override
    double getPerimeter() {
        return (2 * Math.PI * radius);
    }


}

class Rectangle extends Shape {
    private final double height;
    private final double width;

    public Rectangle(ShapeType type, double x, double y, double height, double width) {
        super(type, x, y);
        this.height = height;
        this.width = width;
    }

    @Override
    double getArea() {
        return height * width;
    }

    @Override
    double getPerimeter() {
        return height + width;
    }
}

public class ShapeFactory {
    public Shape createShape(ShapeType type, double x, double y, double h, double w) {
        switch (type) {
            case RECTANGLE:
                return new Rectangle(type, x, y, h, w);
            case CIRCLE:
                return new Circle(type, x, y, h);
            default:
                throw new IllegalArgumentException("Unknown type: " + type);
        }
    }
}

class TestFactory {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape circle = factory.createShape(ShapeType.CIRCLE, 5,5,10,0);
        Shape rectangle = factory.createShape(ShapeType.RECTANGLE, 1,1,2,5);

        System.out.println(circle.getArea() + "   " + circle.getPerimeter());
        System.out.println(rectangle.getArea() + "   " + rectangle.getPerimeter());
    }
}
