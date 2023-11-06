package upd_14;

public class Regex_9 {
    public static void main(String[] args) {
        String text = "This is a sample text to build a letter frequency dictionary.";

        // Преобразовать текст в нижний регистр и удалить все, кроме букв
        text = text.toLowerCase().replaceAll("[^a-z]", "");

        int[] letterFrequency = new int[26];

        // Подсчитать частоту каждой буквы
        for (char c : text.toCharArray()) {
            letterFrequency[c - 'a']++;
        }

        // Вывести результат
        for (int i = 0; i < 26; i++) {
            char letter = (char) (i + 'a');
            System.out.println(letter + ": " + letterFrequency[i]);
        }
    }
}
