package ChatApplication;

public class User implements Observer{ 
    private String userName;

    public User(String userName) {
        this.userName = userName;
    }

    public void update(String messageString) {
        System.out.println(userName + " received news: " + messageString);
    }
}
