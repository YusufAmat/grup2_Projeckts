package day22;

import java.util.Random;

public class RasgeleSayilar {
    public static void main(String[] args) {
        double sayi=Math.round(100*Math.random());
        System.out.println("Sayı : "+sayi);


        Random rnd=new Random();
        int fiyat= rnd.nextInt(20000,40000);
        System.out.println(fiyat);

    }
}
