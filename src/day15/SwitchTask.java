package day15;

import java.util.Scanner;

public class SwitchTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Renk secin [K, S, Y]");
        String renk = scanner.nextLine();
        renk = renk.toLowerCase();

        switch (renk){
            case "k":
                System.out.println("Kirmizi"); break;
            case "s":
                System.out.println("Sari");break;
            case "y":
                System.out.println("Yesil");break;
            default:
                System.out.println("Yanlis secim");
        }
    }
}
