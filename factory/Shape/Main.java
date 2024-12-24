package factory.Shape;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.createShape("circle");
        circle.draw();

        Shape rectangle = shapeFactory.createShape("rectangle");
        rectangle.draw();
    }    
}
