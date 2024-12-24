package factory.Shape;

public class ShapeFactory {
    public Shape createShape(String shapeType) {
        if(shapeType == null || shapeType.isEmpty()) {
            return null;
        }

        switch (shapeType.toLowerCase()) {
            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            case "square":
                return new Square();
            default:
                throw new IllegalArgumentException("Unkown Shape Type:- "+shapeType);
        } 
    }
}
