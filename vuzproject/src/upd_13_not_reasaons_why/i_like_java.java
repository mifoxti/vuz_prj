package upd_13_not_reasaons_why;

public class i_like_java {
    public static void main(String[] args) {
        // 1. Принимаем строку
        String inputString = "I like Java!!!";

        // 2. Распечатываем последний символ строки
        char lastChar = inputString.charAt(inputString.length() - 1);
        System.out.println("Последний символ строки: " + lastChar);

        // 3. Проверяем, заканчивается ли строка на "!!!"
        boolean endsWithExclamation = inputString.endsWith("!!!");
        System.out.println("Заканчивается ли строка на '!!!': " + endsWithExclamation);

        // 4. Проверяем, начинается ли строка с "I like"
        boolean startsWithILike = inputString.startsWith("I like");
        System.out.println("Начинается ли строка с 'I like': " + startsWithILike);

        // 5. Проверяем, содержит ли строка "Java"
        boolean containsJava = inputString.contains("Java");
        System.out.println("Содержит ли строка 'Java': " + containsJava);

        // 6. Находим позицию подстроки "Java" в строке
        int javaPosition = inputString.indexOf("Java");
        System.out.println("Позиция подстроки 'Java': " + javaPosition);

        // 7. Заменяем все символы 'а' на 'о'
        String replacedString = inputString.replace('a', 'o');
        System.out.println("Строка после замены 'a' на 'o': " + replacedString);

        // 8. Преобразуем строку к верхнему регистру
        String upperCaseString = inputString.toUpperCase();
        System.out.println("Строка в верхнем регистре: " + upperCaseString);

        // 9. Преобразуем строку к нижнему регистру
        String lowerCaseString = inputString.toLowerCase();
        System.out.println("Строка в нижнем регистре: " + lowerCaseString);

        // 10. Вырезаем подстроку "Java"
        String subString = inputString.substring(inputString.indexOf("Java"), inputString.indexOf("Java") + 4);
        System.out.println("Подстрока 'Java': " + subString);
    }
}
