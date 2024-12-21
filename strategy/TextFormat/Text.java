package TextFormat;

public class Text{
    private Format format;

    public Text(Format format){
        this.format = format;
    }

    public void changeFormat(Format format) {
        this.format = format;
    }
    
    public void runFormat() {
        format.execute();
    }
}