package day39;

public class MaimApp6 {
    public static void main(String[] args) {
        String str = "Ben bir garip Keloglanim.";
        System.out.println(countWords(str));
    }

    public static int countWords(String metin){
        return metin.split(" ").length;
    }
}
