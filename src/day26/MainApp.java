package day26;

import day26.mathe.DortIslem;

public class MainApp {
    public static void main(String[] args) {
        DortIslem islem1=new DortIslem(5,7);
       /* islem1.sayi1=5;
        islem1.sayi2=7;*/

        System.out.println("Toplam = " + islem1.topla());
        System.out.println("Carpim = " + islem1.carpim());
    }
}
