package day10;

public class MethodsUsAlma {
    public static void main(String[] args) {
        //Herhangi bir sayinin herhangi bir üssünü hesaplayan bir metod yazalim.
        usAl(5,3);
    }

    public static int usAl (int taban, int us){
        int sonuc = 1;
        for (int i = 0; i < us; i++) {
            sonuc*=taban;
        }
        System.out.println(sonuc);
        return sonuc;
    }
}
