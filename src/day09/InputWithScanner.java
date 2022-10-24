package day09;

import java.util.Scanner;

public class InputWithScanner {
    public static void main(String[] args) {
        System.out.println("IKI SAYIYI CARPMA PROGRAMI");
        System.out.println("------------------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen birinci sayiyi giriniz : " );
        int num1 = scanner.nextInt();
        System.out.print("Lütfen ikinci sayiyi giriniz : " );
        int num2 = scanner.nextInt();
        System.out.print("num1 * num2 = " + (num1 * num2) );
    }
}
