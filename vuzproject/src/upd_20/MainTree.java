package upd_20;

public class MainTree {
    public static void main(String[] args) {
        ThreeParameters<Integer, animal, String> threeParams = new ThreeParameters<>(42, new animal("Lion", 5), "Hello");

        Integer firstParam = threeParams.getFirstParam();
        animal secondParam = threeParams.getSecondParam();
        String thirdParam = threeParams.getThirdParam();

        System.out.println("First Parameter: " + firstParam);
        System.out.println("Second Parameter: " + secondParam);
        System.out.println("Third Parameter: " + thirdParam);

    }
}
