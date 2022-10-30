package day18;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String secim = showMainMenu().toUpperCase();
        switch (secim) {
            case "1" -> {
                String mathSecim = showSubMenuMath().toUpperCase();
                switch (mathSecim) {
                    case "1" -> faktoriyelAl();
                    case "2" -> mutlakDegerAl();
                    case "Q" -> System.out.println("Programdan cikildi.");
                    default -> System.out.println("Yanlis secim.");
                }
            }
            case "2" -> {
                String geoSecim = showSubMenuGeoCounting().toUpperCase();
                switch (geoSecim) {
                    case "1" -> {
                        System.out.println("\t\tDikdörtgen icin;");
                        System.out.print("\t\tUzun kenar = ");
                        int uKenar = new Scanner(System.in).nextInt();
                        System.out.print("\t\tKisa kenar = ");
                        int kKenar = new Scanner(System.in).nextInt();
                        System.out.println("\t\tDikdortgen alan = " + uKenar * kKenar);
                        System.out.println("\t\tDikdörtgen Cevre = " + 2 * (uKenar + kKenar));
                    }
                    case "2" -> {
                        System.out.println("\t\tKare icin;");
                        System.out.print("\t\tKenar = ");
                        int kenar = new Scanner(System.in).nextInt();
                        System.out.println("\t\tKare alan = " + kenar * kenar);
                        System.out.println("\t\tKare Cevre = " + 4 * kenar);
                    }
                    case "3" -> {
                        System.out.println("\t\tDaire icin;");
                        System.out.print("\t\tYaricap = ");
                        int r = new Scanner(System.in).nextInt();
                        System.out.printf("\t\tDaire Alan = %5.2f\n", Math.PI * r * r);
                        System.out.printf("\t\tDaire Cevre = %5.2f\n", 2 * Math.PI * r);
                    }
                    case "Q" -> System.out.println("Programdan cikildi");
                    default -> System.out.println("Yanlis secim");
                }
            }
            case "Q" -> System.out.println("Sistemden cikiliyor");
            default -> System.out.println("Yanlis bir secim yaptiniz.");
        }
    }

    public static String showMainMenu() {
        System.out.println("Uygulamamiza Hosgeldiniz");
        System.out.println("*****Islemlerimiz*****");
        System.out.println("----------------------");
        System.out.println("""
                1. Matematik islemleri\s
                2. Alan ve Cevre Hesaplama
                Q. Cikis""");
        System.out.print("Lütfen bir secim yapiniz : ");
        return new Scanner(System.in).nextLine();

    }

    public static String showSubMenuMath() {
        System.out.println("\tAlt Menü | Matematik Islemleri");
        System.out.println("\t1. Faktöriyel Hesaplama");
        System.out.println("\t2. Mutlak Deger Alma");
        System.out.println("\tQ. Cikis");
        System.out.print("\tLütfen bir secim yapiniz : ");
        return new Scanner(System.in).nextLine();
    }

    public static String showSubMenuGeoCounting() {
        System.out.println("\tAlt Menü | Alan ve Cevre Hesaplama");
        System.out.println("\t1. Dikdörtgen");
        System.out.println("\t2. Kare");
        System.out.println("\t3. Daire");
        System.out.println("\tQ. Cikis");
        System.out.print("\tLütfen bir secim yapiniz : ");
        return new Scanner(System.in).nextLine();
    }

    public static void faktoriyelAl() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\t\tFaktöriyelini almak istediginiz sayiyi giriniz : ");
        int sayi = scanner.nextInt();
        int faktoriyel = 1;
        for (int i = 0; i <= sayi; i++) {
            if (i == 0) {
                faktoriyel = 1;
            } else {
                faktoriyel *= i;
            }
        }
        System.out.println("\t\t" + sayi + "! = " + faktoriyel);
    }

    public static void mutlakDegerAl() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\t\tMutlak degerini hesaplamak istediginiz sayiyi giriniz : ");
        int sayi = scanner.nextInt();
        int mutlakDeger;
        if (sayi >= 0) {
            mutlakDeger = sayi;
        } else {
            mutlakDeger = -sayi;
        }
        System.out.println("\t\t|" + sayi + "| = " + mutlakDeger);
    }
}
