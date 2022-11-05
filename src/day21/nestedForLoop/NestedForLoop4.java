package day21.nestedForLoop;

public class NestedForLoop4 {
    public static void main(String[] args) {
        /*
        Write a Java program to create a stair step pattern
        #
         #
          #
           #
            #
             #
         */

        for (int i = 1; i <= 6 ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.println("#");
        }
    }
}
