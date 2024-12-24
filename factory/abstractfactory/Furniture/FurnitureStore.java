package factory.abstractfactory.Furniture;

public class FurnitureStore {
    private final Chair chair;
    private final Table table;
    private final Sofa sofa;

    public FurnitureStore(FurnitureFactory factory){
        this.chair = factory.createChair();
        this.sofa = factory.createSofa();
        this.table = factory.createTable();
    }

    public void displayFurniture() {
        chair.sitOn();
        table.placeItems();
        sofa.lieOn();
    }
}
