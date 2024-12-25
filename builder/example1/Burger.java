package builder.example1;

// Product class
class Burger {
    private final String bun;
    private final String patty;
    private final String sauce;
    private final String toppings;

    // Private constructor to enforce object creation via builder
    private Burger(String bun, String patty, String sauce, String toppings) {
        this.bun = bun;
        this.patty = patty;
        this.sauce = sauce;
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Burger [bun=" + bun + ", patty=" + patty + ", sauce=" + sauce + ", toppings=" + toppings + "]";
    }

    // Static factory method for Builder
    public static Burger createBurger(String bun, String patty, String sauce, String toppings) {
        return new Burger(bun, patty, sauce, toppings);
    }
}
