package day23;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        /*//Task 1: Verilen dizinin elemanlarını konsolda gösteren Java programı yazınız.
        String[] alisverislistesi={"Peynir","Zeytin","Ekmek","Yoğurt","Süt","Yumurta","Şeker","Yağ"};
        for (String malzeme:alisverislistesi) {
            System.out.println(malzeme);
        }*/

        //Task 2: Beş elemanlı arabalar dizisi oluşturunuz. Kullanıcıdan  aradığı arabanın ismini isteyiniz.
        //Bulunca mesela aradığınız araç bulundu veya Araç bulunamadı mesajı veren Java programı yazınız.

        String[] cars = {"Honda", "Toyota", "Nissan", "BMW", "Mercedes"};
        System.out.print("Aradiginiz araba : ");
        String secim = new Scanner(System.in).nextLine();
        boolean flag = true;
        for (int i = 0; i < cars.length; i++) {
            if (secim.equalsIgnoreCase(cars[i])) {
                System.out.println("Aradığınız araç bulundu");
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Aradiginiz arac bulunamadi.");
        }
    }
}

