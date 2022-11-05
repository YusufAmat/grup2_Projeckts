package day22;

public class LoopLabels {
    public static void main(String[] args) {
        Etiket1:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i*j!=0){
                    //break Etiket1 etiketin oldugu yere atiyor.
                    break;// break for disina atiyor
                }
                System.out.println(i + "x" + j);
            }
            System.out.println();
        }
    }
}
