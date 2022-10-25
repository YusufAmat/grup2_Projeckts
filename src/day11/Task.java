package day11;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        // Klavyeden iki ayri kareye ait kenar bilgisi girilecektir.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci karenin kenar uzunlugunu giriniz : ");
        int kenar1 = scanner.nextInt();
        System.out.print("Ikinci karenin kenar uzunlugunu giriniz : ");
        int kenar2 = scanner.nextInt();
        int alan1 = alanKare(kenar1);
        int alan2 = alanKare(kenar2);
        if (alan1 > alan2) {
            System.out.println("Birinci karenin alani ikinci karenin alanindan büyüktür.");
        } else if (alan2 > alan1) {
            System.out.println("Ikinci karenin alani birinci karenin alanindan büyüktür.");
        } else {
            System.out.println("Karelerin alanlari esittir.");
        }
    }

    public static int alanKare(int kenarUzunluk) {
        return kenarUzunluk * kenarUzunluk;
    }
}
