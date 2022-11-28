package day38;

import java.util.Scanner;

public class MainApp4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayiyi giriniz : ");
        int sayi = scanner.nextInt();
        if (isPalindrom(sayi)){
            System.out.println("Girdiginiz sayi palindromdur.");
        }else{
            System.out.println("Girdiginiz sayi palindrom degildir.");
        }
    }

    public static boolean isPalindrom(int sayi) {
        int temp = sayi;
        int reverse = 0;
        while (temp > 0) {
            reverse *= 10;
            reverse += temp % 10;
            temp /= 10;
        }
        return sayi == reverse;
    }
}
