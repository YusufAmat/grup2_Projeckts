package day38;

public class MainApp {
    public static void main(String[] args) {

        //Strings
        String s = String.valueOf(5);
        System.out.println(s);

        String s1 = "" + 5;
        String ahmet = String.format("%s - %d - %5.2f" , "Ahmet", 5, Math.PI);
        System.out.println(ahmet);
        int i = Integer.parseInt(s);
        System.out.println(i);
    }
}
