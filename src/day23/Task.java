package day23;

public class Task {
    public static void main(String[] args) {
        //Task 3: On elemanlı sayilar dizi oluşturunuz.
        //Sonra 0-100 arasındaki rastgele tamsayılarla doldurunuz.
        //Listeleyip, toplamını ve ortalamasını gösteren bir Java programı yazınız.

        int [] rasgeleSayilar = new int[10];
        double toplam = 0;
        for (int i = 0; i < rasgeleSayilar.length; i++) {
            rasgeleSayilar[i]=(int)Math.round(Math.random()*99+1);
            toplam += rasgeleSayilar[i];
            System.out.print(rasgeleSayilar[i] + " ");
        }
        System.out.println("\nToplam : " + toplam);
        System.out.println("Ortalama : " + toplam/ rasgeleSayilar.length);

    }
}
