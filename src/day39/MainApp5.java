package day39;

import java.util.Arrays;

public class MainApp5 {
    public static void main(String[] args) {
        //split metodu
        String str = "Ben bir garip Keloglanim.";
        String[] kelimeler = str.split(" ");

        System.out.println(Arrays.toString(kelimeler));
        System.out.println("Dizinin lengthi = " + kelimeler.length);

        for (String kelime:kelimeler) {
            System.out.println(kelime);
        }
    }
}
