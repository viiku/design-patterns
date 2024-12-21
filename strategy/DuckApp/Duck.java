package DuckApp;

public abstract class Duck {

    FlyBehavior flybehavior;
    QuackBehavior quackbehavior;

    public Duck() {}

    public abstract void display();

    public void performFly() {
        flybehavior.fly();
    }

    public void performQuack() {
        quackbehavior.quack();
    }
    public void swim() {
        System.out.println("All duck float, even decoys");
    }

    public void setFlyBehavior(FlyBehavior fb) {
        this.flybehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        this.quackbehavior = qb;
    }
}
