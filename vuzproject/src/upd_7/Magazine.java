package upd_7;

public class Magazine implements Printable{
    private String title;

    public Magazine(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public static void printMagazines(Printable[] printable) {
        for (Printable item : printable) {
            if (item instanceof Magazine) {
                System.out.println(item.getTitle());
            }
        }
    }
}
