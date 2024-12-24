package factory.abstractfactory.Furniture;

public class ModernFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new ModernChair();
        // System.out.println("Creating chair..");
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
        // System.out.println("Creating sofa..");
    }

    @Override
    public Table createTable() {
        return new ModernTable();
        // System.out.println("Creating table..");
    }

}
