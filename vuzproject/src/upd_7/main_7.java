package upd_7;

public class main_7 {
    public static void main(String[] args) {
        ProcessStrings processor = new ProcessStrings();

        String inputString = "Hello, World!";

        int charCount = processor.countCharacters(inputString);
        System.out.println("Character Count: " + charCount);

        String oddPositionChars = processor.oddPositionCharacters(inputString);
        System.out.println("Characters at Odd Positions: " + oddPositionChars);

        String reversedString = processor.reverseString(inputString);
        System.out.println("Reversed String: " + reversedString);
    }
}

