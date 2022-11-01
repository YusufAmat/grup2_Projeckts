package day20;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //Gün isimlerinden ibaret TR-EN sözlük hazırlayınız.
        //Türkçe arama yapılmış ise ingilizcesini, ingilizce arama yapılmış ise Türkçesini ekrana yazdırınız.
        Scanner scanner = new Scanner(System.in);
        String[] gunler = {"Pazartesi", "Sali", "Carsamba", "Persembe", "Cuma", "Cumartesi", "Pazar"};
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println("Türkce veya ingilizce gün giriniz.");
        System.out.print("Gün/Day : ");
        String secim = scanner.nextLine();
        for (int i = 0; i < gunler.length; i++) {
            if (secim.equalsIgnoreCase(gunler[i])) {
                System.out.println(secim + "-->" + days[i]);
                break;
            } else if (secim.equalsIgnoreCase(days[i])) {
                System.out.println(secim + "-->" + gunler[i]);
                break;
            }
        }
    }
}
