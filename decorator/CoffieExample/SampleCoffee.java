package decorator.CoffieExample;

public class SampleCoffee implements Coffee{
    public String getDescription() {
        return "Simple Coffee";
    }

    public double getCost() {
        return 5.0;
    }
}
