package builder.example2;

// product class
class Car {
    private String engine;
    private int wheels;
    private String color;
    private boolean airbags;

    private Car(String engine, int wheels, String color, boolean airbags){
        this.engine = engine;
        this.wheels = wheels;
        this.color = color;
        this.airbags = airbags;
    }

    @Override
    public String toString() {
        return "Car [engine=" + engine + ", wheels=" + wheels + ", color=" + color + ", airbags=" + airbags + "]";
    }
    
    public static Car produceCar(String engine, int wheels, String color, boolean airbags) {
        return new Car(engine, wheels, color, airbags);
    }

}
