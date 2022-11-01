package day19;

public class MainApp {
    public static void main(String[] args) {
        //Arrays and Strings
        int[] sayilar = {1, 3, 5, 9, 11};
        for (int i = 0; i < sayilar.length; i++) {
            System.out.print(sayilar[i] + " ");
        }
        System.out.println();

        for (int i = sayilar.length - 1; i >= 0; i--) {
            System.out.print(sayilar[i] + " ");
        }
    }
}
