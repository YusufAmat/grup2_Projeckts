package day34;

import java.util.Arrays;

public class MainApp1 {
    public static void main(String[] args) {
        String [][] panelistler={
                {"Dr. Ahmet", "Doc. Sengül"},
                {"Sahin", "Eren", "Fatos"},
                {"Hasan", "Zeliha", "Hakan", "Burhan"}
        };

       for (int i = 0; i < panelistler.length; i++) {
            System.out.println(Arrays.toString(panelistler[i]));
        }
        for (int i = 0; i < panelistler.length; i++) {
            for (int j = 0; j < panelistler[i].length; j++) {
                System.out.print(panelistler[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
