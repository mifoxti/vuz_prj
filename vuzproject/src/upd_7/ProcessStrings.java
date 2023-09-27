package upd_7;

public class ProcessStrings implements StringManipulation {
    @Override
    public int countCharacters(String s) {
        return s.length();
    }

    @Override
    public String oddPositionCharacters(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i += 2) {
            result.append(s.charAt(i));
        }
        return result.toString();
    }

    @Override
    public String reverseString(String s) {
        StringBuilder reversed = new StringBuilder(s);
        return reversed.reverse().toString();
    }
}

