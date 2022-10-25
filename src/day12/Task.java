package day12;

public class Task {
    public static void main(String[] args) {
        //TODO: Asagidaki Java programini gelistiriniz.
        /*
            Verilen bir sayinin hem 5 ' e hem de 2 ' ye bölünüp bölünmedigini bulan bir program yaziniz
         */

        int sayi = 25;
        if (sayi % 10 == 0){
            System.out.println("Sayi hem 5 ' e hem de 2 ' ye tam bölünür ");
        }else {
            System.out.println("tam bölünmez");
        }
    }
}
