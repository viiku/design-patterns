package builder.Example;

// Product class
class Burger {
    private final String bun;
    private final String patty;
    private final String sauce;
    private final String toppings;

    // Private constructor to enforce object creation via builder
    private Burger(BurgerBuilder builder) {
        this.bun = builder.bun;
        this.patty = builder.patty;
        this.sauce = builder.sauce;
        this.toppings = builder.toppings;
    }

    @Override
    public String toString() {
        return "Burger [bun=" + bun + ", patty=" + patty + ", sauce=" + sauce + ", toppings=" + toppings + "]";
    }

    // Builder class
    public static class BurgerBuilder {
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
            return new Burger(this);
        }
    }
}
