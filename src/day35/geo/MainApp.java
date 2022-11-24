package day35.geo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainApp {
    public static void main(String[] args) {
        JFrame pencere = new JFrame("Geometrik Şekiller V1.0");
        pencere.setSize(800, 600);
        pencere.setLayout(null);


        JButton btn = new JButton("Hesapla");
        btn.setSize(125, 30);
        btn.setLocation(337, 250);
        pencere.add(btn);





        //Kare
        Kare kare1 = new Kare(200);
        kare1.setLocation(300, 20);
        pencere.add(kare1);


        pencere.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pencere.setVisible(true);
    }
}
