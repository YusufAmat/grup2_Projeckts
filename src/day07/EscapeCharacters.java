package day07;

public class EscapeCharacters {
    public static void main(String[] args) {
        // Escape Characters

        String isim = "Yusuf";
        int yas = 32;

        System.out.println("Benim adim "+ isim + " ve " + yas + " yasindayim.");

        isim = "Gürhan";
        yas = 49;

        System.out.println("Benim adim "+ isim + " ve " + yas + " yasindayim.");
        System.out.println(String.format("Benim adim %d ", yas));
        System.out.println("Cocuklar hep bir agizdan \n\t\"Neden biz susmak zorundayiz?\" \ndediler.");

        String klasorAdi="c:\\Program Files\\Java";

        System.out.println(klasorAdi);

        String path="C:\\Users\\ustal\\OneDrive\\Masaüstü\\GuiderSoft\\grup2";
        String yol="C:\\Users\\ustal\\OneDrive\\Masaüstü\\GuiderSoft\\grup2";

    }
}
