package day12;

import java.util.Scanner;

public class LogicalLoops {
    public static void main(String[] args) {
        /*
            Mantıksal Operatörler
            & (ampersant)   : ve (and) operatörü
            | (pipe)        : veya (or) operatörü
           ^                : xor operatörü
           !                : Değil


            and & operatörü:
            true & true     : true
            true & false    : false
            false & true    : false
            false & false   : false

            veya | operatörü
            true | true     : true
            true | false    : true
            false | true    : true
            false | false   : false


            xor ^ operatörü
            true ^ true     : false
            true ^ false    : true
            false ^ true    : true
            false ^ false   : false

            not, değil ! operatörü
            !true           : false
            !false          : true


         */
        Scanner scanner =new Scanner(System.in);
        System.out.print("Birinci Sayi : ");
        int sayi1 = scanner.nextInt();
        System.out.print("Ikinci Sayi : ");
        int sayi2 = scanner.nextInt();
        System.out.print("Ucuncu Sayi : ");
        int sayi3 = scanner.nextInt();
        boolean b1 = sayi1 > sayi2 ;
        boolean b2 = sayi3 > sayi2 ;
        boolean b3 = sayi1 > sayi3 ;

        System.out.println(b1&b2);
        System.out.println(b1&b3 );
        System.out.println(b2&b3);
        System.out.println(b1|b2);
        System.out.println(b1|b3 );
        System.out.println(b2|b3);
        System.out.println(b1^b2);
        System.out.println(b1^b3 );
        System.out.println(b2^b3);
        System.out.println(!b1);
        System.out.println(!b2 );
        System.out.println(!b3);

    }
}
