package ChatApplication;

public class Main {
    
    public static void main(String[] args) {
        Admin admin = new Admin();

        Observer observer1 = new User("vivek");
        Observer observer2 = new User("ram");

        admin.registerObserver(observer1);
        admin.registerObserver(observer2);

        admin.setNews("Hurry up..we're late");
        admin.setNews("Observer pattern explained.");

        admin.registerObserver(observer1);
        admin.setNews("Removed one observer");
    }
}
