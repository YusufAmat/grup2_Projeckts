package day15;

import java.util.Scanner;

public class IfTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayiyi giriniz : ");
        int sayi = scanner.nextInt();
        if (sayi%2==0){
            System.out.println("Girmis oldugunuz sayi cifttir.");
        }else {
            System.out.println("Girmis oldugunuz sayi tektir.");
        }
    }
}
