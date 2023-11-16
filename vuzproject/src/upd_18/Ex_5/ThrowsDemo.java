package upd_18.Ex_5;

public class ThrowsDemo {
    private int a;
    public ThrowsDemo(int b)
    {
        a = b;
    }
    public String getDetails(String key) {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
        return key;
    }

    public static void main(String[] args) {
        ThrowsDemo object = new ThrowsDemo(1);
        object.getDetails(null);
    }
}