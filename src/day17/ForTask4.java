package day17;

public class ForTask4 {
    public static void main(String[] args) {
        System.out.println("KPH\t\t MPH");
        for (int i = 60; i <=130 ; i=i+10) {
            System.out.printf("%d\t\t%5.1f",i,i*0.6214);
            System.out.println();
        }
    }
}
