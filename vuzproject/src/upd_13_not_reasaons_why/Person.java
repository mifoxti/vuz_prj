package upd_13_not_reasaons_why;

public class Person {
    private String lastName;
    private String firstName;
    private String middleName;

    public Person(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    public String getFullName() {
        StringBuilder fullName = new StringBuilder(lastName);

        if (firstName != null && !firstName.isEmpty()) {
            fullName.append(" ").append(firstName.charAt(0)).append(".");
        }

        if (middleName != null && !middleName.isEmpty()) {
            fullName.append(" ").append(middleName.charAt(0)).append(".");
        }

        return fullName.toString();
    }

    public static void main(String[] args) {
        Person person1 = new Person("Ляхов", "Тимофей", "Алексеевич");
        System.out.println(person1.getFullName()); // Выводит "Иванов И.И."

        Person person2 = new Person("Абаренова", "Дарья", "Дмитриевна");
        System.out.println(person2.getFullName()); // Выводит "Петров П."

        Person person3 = new Person("Михеева", "Варвара", "Глебовна");
        System.out.println(person3.getFullName()); // Выводит "Сидоров А."

        Person person4 = new Person("Ванечкин", "", "");
        System.out.println(person4.getFullName()); // Выводит "Козлов"
    }
}
