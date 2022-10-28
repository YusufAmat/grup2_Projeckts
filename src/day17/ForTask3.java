package day17;

public class ForTask3 {
    public static void main(String[] args) {
        System.out.print("Number\t");
        System.out.println("Number Squared");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%5d\t%5d", i,i*i);
            System.out.println();
        }
    }
}
