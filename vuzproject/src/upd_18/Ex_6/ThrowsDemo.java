package upd_18.Ex_6;

public class ThrowsDemo {
    private int a;
    public ThrowsDemo(int b)
    {
        a = b;
    }
    public void printMessage(String key) {
        String message = getDetails(key);
        System.out.println( message );
    }
    public void printMessage()
    {
        System.out.println("Ошибочка");
    }
    public String getDetails(String key) {
        try {
            if (key == null) {
                throw new NullPointerException("null key ingetDetails");
            }
        }
        catch (NullPointerException a)
        {
            printMessage();
        }
        return "data for" + key;
    }


    public static void main(String[] args) {
        ThrowsDemo object = new ThrowsDemo(1);
        object.getDetails(null);
    }
}