package day21;

public class NestedFoor {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                System.out.print(i*j);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
