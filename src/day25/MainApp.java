package day25;

import java.util.Scanner;
import day25.geometriksekiller.*;

public class MainApp {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        Kare kare1=new Kare();
        kare1.kenar=7;
        kare1.bilgiGoster();

        Kare kare2=new Kare();
        kare2.kenar=5;
        kare2.bilgiGoster();

        int toplamAlan= kare1.alanHesapla()+ kare2.alanHesapla();
        int toplamCevre= kare1.cevreHesapla()+ kare2.cevreHesapla();


        Daire d=new Daire();
        //DRY
        //int alan=kare1.kenar* kare1.kenar;
        //System.out.println("Alan: "+alan);
    }

}
