package day39;

public class MainApp {
    public static void main(String[] args) {
        //trim metodu bastaki ve sondaki bosluklari siler.

        String str = "               Merhaba       Kardes!              ";
        System.out.println(str.length());
        String trimStr = str.trim();
        System.out.println(trimStr.length());
        System.out.println(trimStr);
    }
}
