package day39;

import javax.swing.*;

public class MainApp3 {
    public static void main(String[] args) {
        /*
            1. Verilen ismin (ad soyad) sadece basharflerini geri dönduren bir metot tasarlayiniz.
            2. Kullanicidan bir isim alip ekranda gösteriniz.

         */

        System.out.println(findInitialLetters("Ahmet Dursun"));

        String isim =JOptionPane.showInputDialog("Lütfen isminizi giriniz");
        System.out.println(findInitialLetters(isim));
    }

    public static String findInitialLetters(String name){
        return ""+name.charAt(0) + name.charAt(name.indexOf(" ")+1);
    }
}
