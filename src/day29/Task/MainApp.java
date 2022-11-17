package day29.Task;

public class MainApp {
    public static void main(String[] args) {
        //1. Bir araba sınıfı oluşturunuz.
        //   a. ilerle():void metodunu tasarlayıp, ekrana "Araba ilerliyor" mesajı veriniz.
        //2. Bir yarış arabası sınıfı oluşturunuz. Araba sınıfından extend edilecektir.
        //   a. turbo():void metodunu tasarlayıp, ekrana "Yarış arabası turbo ile uçuyor." mesajı veriniz.
        //   b. ilerle() metodunu override edip, ekrana "Yarış arabası hızla ilerliyor." mesajı veriniz.
        //3. MainApp sınıfı - main metodu içerisinde sırasıyla araba, yarış arabası ve tekrar yarış arabası nesneleri oluşturunuz.
        //4. Birinci ve üçüncü nesnelerin referansı Araba sınıfından olmalıdır. İkinci nesnenin referansı YarisArabasi olmaldır.
        //5. Bütün nesnelerin ilerle metotlarını, ikinci ve üçüncü nesnelerin turbo metodunu çalıştırnız.

        Araba araba1 = new Araba();
        YarisArabasi yrs = new YarisArabasi();
        Araba araba2 = new YarisArabasi();

        araba1.ilerle();
        yrs.ilerle();
        araba2.ilerle();
        yrs.turbo();
        ((YarisArabasi)araba2).turbo();

    }
}
