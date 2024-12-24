package factory.abstractfactory.Furniture;

public class VictorianTable implements Table{
    @Override
    public void placeItems() {
        System.out.println("Plaing items on Victorian Table.");
    }
}
