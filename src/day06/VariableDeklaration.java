package day06;

import java.util.Scanner;

public class VariableDeklaration {
    public static void main(String[] args) {

        // Değişken Tanımlama
    /*
    Kurallar;
    1. Resmi kurallar:
        - Java anahtar kelimeleri kullanılamaz
        - Değilken isminde boşluk bulunamaz
        - Sayı ile başlayamaz
        -Değişken isminde herhangi bir operatör bulunamaz.
        - Değişken isminin ortasında veya sonunda sayı bulunabilir
        - Değişken içerisinde alttan tire kullanılabilir

    2. Gayr-ı resmi kurallar:
        - Değişken ismi içeriğe uygun olmalı
        - Notasyonlara uygun yazılmalıdır
        - Türkçe karakter kullanmayınız: ı,İ,ç,Ç,ğ,Ğ,ü,Ü,ş,Ş

    Notasyonlar:
        -Camel Notasyonu: Değişken ve metot tanımlamalarında kullanılır
        Eğer tek kelime ise tamamen küçük harflerle,
        Eğer birden fazla kelimeden oluşuyorsa ilk kelimetamamen küçük, sonraki kelimelerin
        baş harfleri büyük yazılmalı. Örn; kenar, kareninKenari

        - Pascal notasyonu: Sınıf isimlendirmelerinde kullanılır
        Tek kelime ise sadece baş harfi büyük, birden çok kelimeden oluşuyorsa her kelimenin baş harfi büyük olmalıdır

        - Snake notasyonu:
        kelimeler arasında alttan tire bulunur*/

        // Dikdörtgenin alan ve cevresini hesaplayan bir java programi gelistirelim.
        // Concanatation = Metin Birlestirme

        Scanner scanner = new Scanner(System.in);
        System.out.print("Dikdörtgenin kisa kenarini giriniz : ");
        int kisaKenar = scanner.nextInt();
        System.out.print("Dikdörtgenin uzun kenarini giriniz : ");
        int uzunKenar = scanner.nextInt();
        System.out.println("Dikdörtgenin Cevresi = " + 2 * (kisaKenar + uzunKenar ));
        System.out.println("Dikdörtgenin Alani = " + kisaKenar * uzunKenar);
    }
}
