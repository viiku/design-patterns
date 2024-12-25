package builder.example2;

public class CarBuilderPattern {
    public static void main() {
        Car classiccar = new CarBuilder()
            .setEngine("audi")
            .setWheels(4)
            .setAirBags(true)
            .setColor("green")
            .build();

        Car teslaCar = new CarBuilder()
        .setColor("shshshs")
        .setAirBags(false)
        .setEngine("maruti")
        .setWheels(4)
        .build();

        System.out.println("classiccar:- "+ classiccar);
        System.out.println("teslacar :- "+ teslaCar);
    }
    
}
