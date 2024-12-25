package builder.example2;

public class CarBuilder {
    private String engine;
    private int wheels;
    private String color;
    private boolean airbags;

    public CarBuilder setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    public CarBuilder setWheels(int wheels) {
        this.wheels = wheels;
        return this;
    }

    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder setAirBags(boolean airbags) {
        this.airbags = airbags;
        return this;
    }

    public Car build() {
        // static methods can be called directly from class, without creating any objects of it.
        return Car.produceCar(engine, wheels, color, airbags);
    }
}
