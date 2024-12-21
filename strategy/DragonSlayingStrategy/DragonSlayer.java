package DragonSlayingStrategy;

public class DragonSlayer {
    // The class has a private field strategy of type DragonSlayingStrategy (which is likely an interface)
    // This field will hold the specific strategy the DragonSlayer will use to fight dragons
    private DragonSlayingStrategy strategy;  // Strategy interface reference
 
    // Takes a strategy as a parameter during object creation
    // Allows you to set the initial fighting strategy when creating a DragonSlayer 
    public DragonSlayer(DragonSlayingStrategy strategy) {
        this.strategy = strategy;
    }

    // Allows changing the fighting strategy at runtime
    // This is a key feature of the Strategy pattern - flexibility to switch behaviors
    public void changeStrategy(DragonSlayingStrategy strategy) {
        this.strategy = strategy;
    }

    // Delegates the actual fighting behavior to whatever strategy is currently set
    // The DragonSlayer doesn't need to know how the fighting is done - it just executes the strategy
    public void goToBattle() {
        strategy.execute();
    }
}
