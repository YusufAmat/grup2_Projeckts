package day34.polymorfism;

import org.jetbrains.annotations.NotNull;

public class MainApp1 {
    public static void main(String[] args) {
        Kare kare = new Kare(15);
        sekilInfo(kare);

        Dikdortgen dik = new Dikdortgen(7,17);
        sekilInfo(dik);

        Daire daire = new Daire(11);
        sekilInfo(daire);

        //sekilInfo(null);
    }

    public static void sekilInfo(@NotNull Sekil sekil){

        System.out.println("-".repeat(40));
        System.out.printf("Alan = %5.2f - Cevre = %5.2f\n", sekil.alanHesapla(), sekil.cevreHesapla());
        System.out.println("-".repeat(40));
    }
}
