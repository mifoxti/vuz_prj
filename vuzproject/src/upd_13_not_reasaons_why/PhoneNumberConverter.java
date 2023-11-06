package upd_13_not_reasaons_why;

public class PhoneNumberConverter {
    public static String convertToInternationalFormat(String phoneNumber) {
        if (phoneNumber != null && !phoneNumber.isEmpty()) {
            if (phoneNumber.startsWith("+") && phoneNumber.length() == 12) {
                // Формат +<Код страны><Номер 10 цифр>
                String countryCode = phoneNumber.substring(1, 4);
                String number = phoneNumber.substring(4);
                return String.format("+%s-%s-%s-%s", countryCode, number.substring(0, 3), number.substring(3, 6), number.substring(6));
            } else if (phoneNumber.startsWith("8") && phoneNumber.length() == 11) {
                // Формат 8<Номер 10 цифр> для России
                String number = phoneNumber.substring(1);
                return String.format("+7-%s-%s-%s", number.substring(0, 3), number.substring(3, 6), number.substring(6));
            }
        }
        return "Некорректный формат номера";
    }

    public static void main(String[] args) {
        String phoneNumber1 = "+79175655655";
        String phoneNumber2 = "+104289652211";
        String phoneNumber3 = "89175655655";

        System.out.println("Входной формат: " + phoneNumber1);
        System.out.println("Международный формат: " + convertToInternationalFormat(phoneNumber1));

        System.out.println("Входной формат: " + phoneNumber2);
        System.out.println("Международный формат: " + convertToInternationalFormat(phoneNumber2));

        System.out.println("Входной формат: " + phoneNumber3);
        System.out.println("Международный формат: " + convertToInternationalFormat(phoneNumber3));
    }
}

