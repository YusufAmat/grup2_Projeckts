package day40;

public class Tools {
    public static void main(String[] args) {

        char[] dizi = {'A','L','I'};
        System.out.println(convertToString(dizi));
        int[] nums = {1,3,5,7};
        System.out.println(convertToString(nums));
    }

    //Task 1: Verilen bir karakter dizisini (char[]) metne çevirip döndüren metodu yazınız.
    public static String convertToString(char[] karakterler){
        String str = "";
        for (char karakter : karakterler) {
            str += karakter;
        }
        return str;
    }

    //Task 2: Verilen bir tamsayı dizisini (int[]) metne çevirip döndüren metodu yazınız.
    public static String convertToString(int[] sayilar){
        String str = "";
        for (int sayi : sayilar) {
            str += sayi;
        }
        return str;
    }
}
