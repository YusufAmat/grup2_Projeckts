package day15;

import java.util.Scanner;

public class MenuTasarimi {
    public static void main(String[] args) {
        // Dört islem yapabilen hesap makinasi tasarlayiniz.
        Scanner scanner = new Scanner(System.in);

        System.out.println("-".repeat(20));
        System.out.println("     Dört islem     ");
        System.out.println("-".repeat(20));
        System.out.println("1. Toplama");
        System.out.println("2. Cikarma");
        System.out.println("3. Carpma");
        System.out.println("4. Bölme");
        System.out.println("-".repeat(20));
        System.out.print("Seciminiz : ");
        int secim = scanner.nextInt();
        int sonuc = 0;
        boolean flag = true;
        switch (secim) {
            case 1:
                System.out.println("Toplami bulunacak sayilari giriniz.");
                System.out.print("Birinci Sayi : ");
                int n1 = scanner.nextInt();
                System.out.print("Ikinci Sayi : ");
                int n2 = scanner.nextInt();
                sonuc = n1 + n2;
                break;
            case 2:
                System.out.println("Cikarilacak sayilari giriniz.");
                System.out.print("Birinci Sayi : ");
                n1 = scanner.nextInt();
                System.out.print("Ikinci Sayi : ");
                n2 = scanner.nextInt();
                sonuc = n1 - n2;
                break;
            case 3:
                System.out.println("Carpilacak sayilari giriniz.");
                System.out.print("Birinci Sayi : ");
                n1 = scanner.nextInt();
                System.out.print("Ikinci Sayi : ");
                n2 = scanner.nextInt();
                sonuc = n1 * n2;
                break;
            case 4:
                System.out.println("Bölünecek sayilari giriniz.");
                System.out.print("Birinci Sayi : ");
                n1 = scanner.nextInt();
                System.out.print("Ikinci Sayi : ");
                n2 = scanner.nextInt();
                if (n2==0){
                    System.out.println("Ikinci sayi 0 olamaz!!!");
                    flag = false;
                    break;
                }
                sonuc = n1 / n2;
                break;
            default:
                System.out.println("Yanlis secim yaptiniz.");
                flag = false;
                break;
        }
        if (flag){
            System.out.println("Sonuc : " + sonuc);
        }

    }
}
