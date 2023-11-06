package upd_13_not_reasaons_why;

public class Shirt {
    private String shirtCode;
    private String description;
    private String color;
    private String size;

    public Shirt(String shirtCode, String description, String color, String size) {
        this.shirtCode = shirtCode;
        this.description = description;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Shirt Code: " + shirtCode + "\nDescription: " + description + "\nColor: " + color + "\nSize: " + size + "\n";
    }

    public static void main(String[] args) {
        String[] shirtsData = {
                "S001,Black Polo Shirt,Black,XL",
                "S002,Black Polo Shirt,Black,L",
                "S003,Blue Polo Shirt,Blue,XL",
                "S004,Blue Polo Shirt,Blue,M",
                "S005,Tan Polo Shirt,Tan,XL",
                "S006,Black T-Shirt,Black,XL",
                "S007,White T-Shirt,White,XL",
                "S008,White T-Shirt,White,L",
                "S009,Green T-Shirt,Green,S",
                "S010,Orange T-Shirt,Orange,S",
                "S011,Maroon Polo Shirt,Maroon,S"
        };

        Shirt[] shirts = new Shirt[shirtsData.length];
        for (int i = 0; i < shirtsData.length; i++) {
            String[] shirtInfo = shirtsData[i].split(",");
            shirts[i] = new Shirt(shirtInfo[0], shirtInfo[1], shirtInfo[2], shirtInfo[3]);
        }

        for (Shirt shirt : shirts) {
            System.out.println(shirt);
        }
    }
}

