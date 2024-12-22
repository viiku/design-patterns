package NewsAgency;

public class Main {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();

        Observer channel1 = new NewsChannel("Channel 1");
        Observer channel2 = new NewsChannel("Channel 2");

        agency.registerObserver(channel1);
        agency.registerObserver(channel2);

        agency.setNews("Breaking News: Observer Pattern Explained!");
        agency.setNews("Latest Update: Java Examples for Design Patterns.");
    }
}
