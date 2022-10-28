package day17;

import java.util.Scanner;

public class ForTask2 {
    public static void main(String[] args) {
        //Write a program that the user to declare a positive integer. It should then print the
        //multiplication table of that number.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Carpim tablosunu olusturmak istediginiz sayiyi giriniz : ");
        int num = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "*" + i + "= " + num * i);
        }
    }
}
