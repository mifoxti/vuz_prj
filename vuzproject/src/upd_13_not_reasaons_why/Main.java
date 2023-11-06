package upd_13_not_reasaons_why;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        String result = getLine(fileName);
        System.out.println(result);
    }

    public static String getLine(String fileName) throws IOException {
        List<String> words = new ArrayList<>();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = fileReader.readLine()) != null) {
            String[] lineWords = line.split(" ");
            for (String word : lineWords) {
                words.add(word);
            }
        }
        fileReader.close();

        if (words.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        result.append(words.get(0));
        words.remove(0);

        while (!words.isEmpty()) {
            boolean found = false;
            for (int i = 0; i < words.size(); i++) {
                String currentWord = words.get(i);
                if (Character.toLowerCase(result.charAt(result.length() - 1)) == Character.toLowerCase(currentWord.charAt(0))) {
                    result.append(" ").append(currentWord);
                    words.remove(i);
                    found = true;
                    break;
                }
            }
            if (!found) {
                break;
            }
        }

        return result.toString();
    }
}

