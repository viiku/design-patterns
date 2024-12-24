package factory.abstractfactory.Furniture;

public class ModernTable implements Table {
    @Override
    public void placeItems() {
        System.out.println("Placing items on Modern Table.");
    }
}
