package day40;

public class MainApp {
    public static void main(String[] args) {
        //concat
        //Ad ve soyad usulüne uygun birlestirilip, büyük karakterli olarak yazdirilacaktir.
        String str1 = "Ahmet";
        String str2 = "Dursun";
        String isim = str1.concat(" ").concat(str2).toUpperCase();
        System.out.println(isim);
        System.out.println((str1 + " " + str2).toUpperCase());
        System.out.printf("%s %s\n".toUpperCase(), str1,str2);

        System.out.println(String.format("%s %s\n", str1,str2).toUpperCase());
    }
}
