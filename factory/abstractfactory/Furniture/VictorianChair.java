package factory.abstractfactory.Furniture;

public class VictorianChair implements Chair{
    @Override
    public void sitOn() {
        System.out.println("Sitting on Victorian style furniture");
    }
}
