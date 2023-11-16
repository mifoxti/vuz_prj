package upd_18.Ex_8;

import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        Scanner myScanner = new Scanner( System.in );
        for (int i = 0 ; i < 2; i++) {
            String key = myScanner.next();
            try {
                printDetails(key);
            } catch (Exception a) {
                if(i == 1)
                    continue;
                System.out.println("Проверка в getKey: обнаружена ошибка!");
            }
        }
    }
    public void printDetails(String key) {
        try {
            String message = getDetails(key);
        }
        catch (Exception a)
        {
            System.out.println("Ошибка в printDetails");
        }
    }
    private String getDetails(String key) throws Exception {
        if(key.equals("1")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        ThrowsDemo object = new ThrowsDemo();
        object.getKey();
    }
}