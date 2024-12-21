package TextFormat;

public class TextFormatter {
        public static void main(String[] args) {
            var textFormatter = new Text(new TitleFormatter());
            textFormatter.runFormat();

            // textFormatter = new Text(new LowerCaseFormatter());
            textFormatter.changeFormat(new LowerCaseFormatter());
            textFormatter.runFormat();

            // textFormatter = new Text(new UpperCaseFormatter());
            textFormatter.changeFormat(new UpperCaseFormatter());
            textFormatter.runFormat();
    }
}
