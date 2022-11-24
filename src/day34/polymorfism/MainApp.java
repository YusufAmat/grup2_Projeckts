package day34.polymorfism;

public class MainApp {
    public static void main(String[] args) {
        /*
        Polymorfizm(Cok Bicimlilik):
        abstract class: Soyut siniflar kendisinden türeyen alt siniflara
        ne yapmalari gerektigini söyler ama nasil yapmalari gerektigini söylemez,
        kendilerine birakir.
        */

        Kare kare = new Kare(9);
        System.out.println("Karenin Alani   = " + kare.alanHesapla());
        System.out.println("Karenin Cevresi = " + kare.cevreHesapla());
        System.out.println();
        Sekil sekil = new Daire(7);
        Sekil[] sekiler = new Sekil[5];
        sekiler[0] = new Daire(5);
        sekiler[1] = new Kare(6);
        sekiler[2] = new Dikdortgen(8,12);
        sekiler[3] = new Daire(9);
        sekiler[4] = new Sekil() {
            @Override
            public double alanHesapla() {
                return 100;
            }

            @Override
            public double cevreHesapla() {
                return 50;
            }
        };

        for (Sekil s:sekiler) {
            System.out.println("Alan  :" + s.alanHesapla());
            System.out.println("Cevre :" + s.cevreHesapla());
            System.out.println();
        }
    }
}
