package upd_14;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_7 {
    public static void main(String[] args) {
        String[] passwords = {"F032_Password", "TrySpy1", "smart_pass", "A007"};
        Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d_]{8,}$");

        for (String password : passwords) {
            Matcher matcher = pattern.matcher(password);
            if (matcher.matches()) {
                System.out.println(password + " - Надежный пароль");
            } else {
                System.out.println(password + " - Ненадежный пароль");
            }
        }
    }
}
