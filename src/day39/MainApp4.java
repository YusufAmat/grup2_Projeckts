package day39;

import javax.swing.*;

public class MainApp4 {
    public static void main(String[] args) {
        String name = "Ahmet Dursun";
        System.out.println(hideNames(name));

        String isim = JOptionPane.showInputDialog("Bir isim giriniz");
        System.out.println(hideNames(isim));
    }

    public static String hideNames(String name) {
        String ilkHarf = "" + name.charAt(0);
        String ikinciHarf = "" + name.charAt(name.indexOf(" ") + 1);
        String hidden = "";
        for (int i = 0; i < name.length(); i++) {
            if (i == 0) {
                hidden += ilkHarf;
            } else if (i == name.indexOf(" ") + 1) {
                hidden += " " + ikinciHarf;
            } else if (i == name.indexOf(" ")) {
                hidden += " ";
            } else {
                hidden += '*';
            }
        }
        return hidden;
    }
}
