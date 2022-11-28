package day36;

public class MainApp {
    public static void main(String[] args) {
        // String metin dizeleri basit bir car dizisidir denilemez.
        // Stringler immutable yani degistirilemez.

        String str1 = "Java";
        System.out.println(str1);
        String s = str1.toUpperCase();

        System.out.println(str1);
        System.out.println(s);
    }
}
