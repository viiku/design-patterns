package builder.Example;

public class BuilderPatternDemo {
    public static void main(String[] args){
        // create a burger using builder
        Burger classicBurger = new Burger.BurgerBuilder()
                .setBun("Sesame Bun")
                .setPatty("Patty")
                .setSauce("Ketchup")
                .setToppings("Lettuce, Tomato, Pickles")
                .build();
    
        Burger veggieBurger = new Burger.BurgerBuilder()
                .setBun("Whole Grain Bun")
                .setPatty("Veggie Patty")
                .setSauce("Mayo")
                .setToppings("Lettuce, Tomato, Avocado")
                .build();

        System.out.println("Classic Burger: " + classicBurger);
        System.out.println("Veggie Burger: " + veggieBurger);
    }
}
