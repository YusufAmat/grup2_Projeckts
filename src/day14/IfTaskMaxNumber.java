package day14;

import java.util.Scanner;

public class IfTaskMaxNumber {
    public static void main(String[] args) {
        //TODO : Writ a java Program that will accept three numbers and return the greatest number.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci Sayi : ");
        int num1 = scanner.nextInt();
        System.out.print("Ikinci Sayi : ");
        int num2 = scanner.nextInt();
        System.out.print("Ücüncü Sayi : ");
        int num3 = scanner.nextInt();
        int maxNum = num1;

        if (num2 > maxNum) {
            maxNum = num2;
        }
        if (num3 > maxNum) {
            maxNum = num3;
        }
        System.out.println("En büyük sayi : " + maxNum);
    }
}
