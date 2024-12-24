package factory.abstractfactory.Furniture;

public class Main {
    public static void main(String[] args) {
        // Create a modern furniture set
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        FurnitureStore modernStore = new FurnitureStore(modernFactory);
        System.out.println("Modern Furniture Set:");
        modernStore.displayFurniture();

        // Create a Victorian furniture set
        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        FurnitureStore victorianStore = new FurnitureStore(victorianFactory);
        System.out.println("\nVictorian Furniture Set:");
        victorianStore.displayFurniture();
    
        // Create a rustic furniture set
        FurnitureFactory rusticFactory = new RusticFurnitureFactory();
        FurnitureStore rusticStore = new FurnitureStore(rusticFactory);
        System.out.println("\nRustic Furniture Set:");
        rusticStore.displayFurniture();
    }
}
