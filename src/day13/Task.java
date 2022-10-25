package day13;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        // Yusufun kullanici adi ve sifresi : yusuf13 ---> 123

        Scanner scanner = new Scanner(System.in);
        String yusufKullanici = "yusuf13";
        String yusufSifre = "123";
        System.out.println("ATM´ ye HOSGELDINIZ");
        System.out.println("Lütfen bilgilerinizi giriniz");

        System.out.print("Kullanici Adi : ");
        String kullaniciAdi = scanner.nextLine();

        System.out.print("Sifre : ");
        String sifre = scanner.nextLine();

        if (kullaniciAdi.equals(yusufKullanici) & sifre.equals(yusufSifre)) {
            System.out.println("Yönetim sayfasina hosgeldiniz...");
        }else if(!(sifre.equals(yusufSifre)) &kullaniciAdi.equals(yusufKullanici)) {
            System.out.println("Yanlis parola girdiniz. Lütfen tekrar deneyiniz");
        } else if (!(kullaniciAdi.equals(yusufKullanici)) & sifre.equals(yusufSifre)){
            System.out.println("Lütfen sistem yöneticisi ile irtibata geciniz...");
        }else{
            System.out.println("Hata");
        }
    }
}
