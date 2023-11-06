package upd_13_not_reasaons_why;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String apartment;

    public Address(String input) {
        // Разделитель - только запятая
        String[] parts = input.split(",");
        if (parts.length >= 7) {
            country = parts[0].trim();
            region = parts[1].trim();
            city = parts[2].trim();
            street = parts[3].trim();
            house = parts[4].trim();
            building = parts[5].trim();
            apartment = parts[6].trim();
        }

        // Разделитель - один из символов ‘,’ ‘.’ ‘;’
        String[] parts2 = input.split("[,.;]");
        if (parts2.length >= 7) {
            country = parts2[0].trim();
            region = parts2[1].trim();
            city = parts2[2].trim();
            street = parts2[3].trim();
            house = parts2[4].trim();
            building = parts2[5].trim();
            apartment = parts2[6].trim();
        }
    }

    public String getFullAddress() {
        return country + ", " + region + ", " + city + ", " + street + ", " + house + ", " + building + ", " + apartment;
    }

    public static void main(String[] args) {
        Address address1 = new Address("Russia, Moscow Region, Moscow, Lenin Street, 1, A, 12");
        System.out.println(address1.getFullAddress());

        Address address2 = new Address("USA; California; Los Angeles; Hollywood Blvd; 123; B; 456");
        System.out.println(address2.getFullAddress());
    }
}

