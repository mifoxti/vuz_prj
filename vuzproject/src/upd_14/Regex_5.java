package upd_14;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_5 {
    public static void main(String[] args) {
        String inputText = "user@example.com, myhost@@@com.ru, @my.ru, Julia String";
        Pattern pattern = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
        Matcher matcher = pattern.matcher(inputText);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
