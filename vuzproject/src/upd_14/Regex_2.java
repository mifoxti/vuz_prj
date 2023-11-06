package upd_14;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_2 {
    public static void main(String[] args) {
        String inputString = "abcdefghijklmnopqrstuv18340";
        Pattern pattern = Pattern.compile("^abcdefghijklmnopqrstuv18340$");
        Matcher matcher = pattern.matcher(inputString);

        if (matcher.matches()) {
            System.out.println("Правильное выражение");
        } else {
            System.out.println("Неправильное выражение");
        }
    }
}
