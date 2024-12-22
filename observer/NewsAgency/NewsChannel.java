package NewsAgency;

public class NewsChannel implements Observer{
    private String channelName;

    public NewsChannel(String channelName) {
        this.channelName = channelName;
    }

    public void update(String news) {
        System.out.println(channelName + " received news: " + news);
    }
}
