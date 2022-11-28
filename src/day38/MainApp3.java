package day38;

public class MainApp3 {
    public static void main(String[] args) {
        String str = "Merhaba";
        //Alt alta yazdirma
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

        //Yanyana yazdirma
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();

        String str1 = "ey edip adanada pide ye";
        String str2 = "";
        for (int i = str1.length()- 1; i >= 0; i--) {
            str2 += str1.charAt(i);
        }
        System.out.println(str2);

        StringBuilder strb = new StringBuilder("ey edip adanada pide ye");
        System.out.println(strb.reverse());

    }
}
