package DuckApp;

class MallardDuck extends Duck {
    public MallardDuck() {
        flybehavior = new FlyWithWings();
        quackbehavior = new Quack();
    }

    public void display() {
        System.out.println("Looks like Mallard");
    }
}