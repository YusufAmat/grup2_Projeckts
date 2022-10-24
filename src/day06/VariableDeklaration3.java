package day06;

public class VariableDeklaration3 {
    public static void main(String[] args) {
        /* Veri Tipleri
            1. Ilkel Tipler - Primitive Types
            2. Referans Tipler - Reference Types
         */

        // Tamsayi veri tipleri
        // int sayiMax = 2_147_483_647;
        // int sayiMin = -2_147_483_648;
        int sayiMax = Integer.MAX_VALUE;
        int sayiMin = Integer.MIN_VALUE;
        byte sayi1Min = Byte.MIN_VALUE;
        byte sayi1Max = Byte.MAX_VALUE;
        short sayi2Max = Short.MAX_VALUE;
        short sayi2Min = Short.MIN_VALUE;
        long sayi3Min = Long.MIN_VALUE;
        long sayi3Max = Long.MAX_VALUE;
        System.out.println(sayiMax);
        System.out.println(sayiMin);
        System.out.println(sayi1Max);
        System.out.println(sayi1Min);
        System.out.println(sayi2Max);
        System.out.println(sayi2Min);
        System.out.println(sayi3Max);
        System.out.println(sayi3Min);

    }
}
