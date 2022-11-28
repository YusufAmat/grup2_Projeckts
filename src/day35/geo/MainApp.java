package day35.geo;

import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainApp {
    public static void main(String[] args) {
        JFrame pencere = new JFrame("Geometrik Şekiller V1.0");
        pencere.setSize(800, 600);
        pencere.setLayout(null);


        JTextField txt = new JTextField();
        txt.setBounds(337,240,125,30);
        txt.setEditable(false);
        pencere.add(txt);

        JButton btn = new JButton("Hesapla");
        btn.setSize(125, 30);
        btn.setLocation(337, 280);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Kare kare = new Kare(200);
                int alan = kare.getAlan();
                int cevre = kare.getCevre();
                String bilgi = String.format("Alan = %d, Cevre = %d",alan,cevre);
                txt.setText(bilgi);
            }
        });
        pencere.add(btn);





        //Kare
        Kare kare1 = new Kare(200);
        kare1.setLocation(300, 20);
        pencere.add(kare1);


        pencere.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pencere.setVisible(true);
    }
}
