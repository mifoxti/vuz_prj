package upd_14;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_4 {
    public static void main(String[] args) {
        String inputText = "29/02/2000, 30/04/2003, 01/01/2003";
        Pattern pattern = Pattern.compile("(0[1-9]|[12]\\d|3[01])\\/(0[1-9]|1[0-2])\\/(19\\d\\d|20\\d\\d)");
        Matcher matcher = pattern.matcher(inputText);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
