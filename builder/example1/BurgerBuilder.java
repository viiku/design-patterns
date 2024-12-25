package builder.example1;

// Builder class
public class BurgerBuilder {
    private String bun;
    private String patty;
    private String sauce;
    private String toppings;

    public BurgerBuilder setBun(String bun) {
        this.bun = bun;
        return this;
    }

    public BurgerBuilder setPatty(String patty) {
        this.patty = patty;
        return this;
    }

    public BurgerBuilder setSauce(String sauce) {
        this.sauce = sauce;
        return this;
    }

    public BurgerBuilder setToppings(String toppings) {
        this.toppings = toppings;
        return this;
    }

    public Burger build() {
        return Burger.createBurger(bun, patty, sauce, toppings);
    }
}
