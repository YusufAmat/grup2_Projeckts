package day10;

public class Task {
    public static void main(String[] args) {
        /*
            Kenar uzunluğu verilen bir karenin alan hesaplaması yapılacaktır. Bunun için karenin alanını geriye
            döndüren bir metot tasarlayınız. Daha sonra bu metotodu main metodu içerisinden çağırarak
            iki farklı karenin alanlarını toplayınız. Metot ismi alanHesapla olacaktır.
         */
        int toplamAlan = alanHesapla(9) + alanHesapla(5);
        System.out.println(toplamAlan);
    }

    public static int alanHesapla (int kenarUzunluk){
        return kenarUzunluk*kenarUzunluk;
    }
}
