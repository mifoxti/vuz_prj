package upd_14;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regex_3 {
    public static void main(String[] args) {
        String inputText = "Prices: 25.98 USD, 44 RUB, 0.004 EU.";
        Pattern pattern = Pattern.compile("\\b\\d+\\.\\d+\\s+(USD|RUB|EU)\\b");
        Matcher matcher = pattern.matcher(inputText);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
