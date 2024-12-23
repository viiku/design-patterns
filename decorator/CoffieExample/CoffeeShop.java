package decorator.CoffieExample;

public class CoffeeShop {
    public static void main(String[] args) {
        
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " -> Cost: $" + coffee.getCost());

        // Add milk
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " -> Cost: $" + coffee.getCost());

        // Add sugar
        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " -> Cost: $" + coffee.getCost());
    }
}
