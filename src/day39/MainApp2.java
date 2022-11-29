package day39;

public class MainApp2 {
    public static void main(String[] args) {
        //indexof karakterin indexini verir.
        //substring metotlari(baslangic dahil, bitis dahil degil)

        String str = "Merhaba kardes!";
        String substr1 = str.substring(8);
        String substr2 = str.substring(8, 14);
        System.out.println(substr1);
        System.out.println(substr2);
        System.out.println(str.substring(8,str.length()));

        System.out.println();
        int indexSpace = str.indexOf(" ");
        System.out.println("Boslugun index numarasi : " + indexSpace);
        int indexExc = str.indexOf("!");

        System.out.println(str.substring(indexSpace+1));
        System.out.println(str.substring(indexSpace+1, indexExc));

        String str1 = str.substring(0, indexSpace);
        System.out.println(str1);
        System.out.println(str1.length());
    }
}
