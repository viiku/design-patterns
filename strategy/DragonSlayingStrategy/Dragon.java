package DragonSlayingStrategy;

public class Dragon {
    
    public static void main(String[] args) {
        // A new DragonSlayer object is created with a MeleeStrategy.
        // The MeleeStrategy is passed to the DragonSlayer constructor, setting its strategy field.
        // The goToBattle() method is called.
        // This calls the execute() method of the current strategy (MeleeStrategy), which outputs:
        // Copy code

        var dragonSlayer = new DragonSlayer(new MeleeStrategy());
        // Step 1: Create an Object of MeleeStrategy
        // new MeleeStrategy():
        // This creates a new object of the MeleeStrategy class.
        // The MeleeStrategy object is stored in memory (on the heap).
        // This object implements the DragonSlayingStrategy interface, so it can be passed to any method or constructor expecting a DragonSlayingStrategy.
        dragonSlayer.goToBattle();

        dragonSlayer.changeStrategy(new ProjectileStrategy());
        dragonSlayer.goToBattle();
        
        dragonSlayer.changeStrategy(new SpellStrategy());
        dragonSlayer.goToBattle();
    }
}
