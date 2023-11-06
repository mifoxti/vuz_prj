package upd_14;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_1 {
    public static void main(String[] args) {
        String inputString = "abc123def456gh789";
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(inputString);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
