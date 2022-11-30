package day40;

public class MainApp2 {
    public static void main(String[] args) {
        //contains--> bir karakter, hece veya kelime icerip icermedigini kontrol edebiliriz.
        //replace

        String str = "Ben bir garp Keloglanim";
        boolean kelVarmi = str.contains("Kel");
        if (kelVarmi){
            System.out.println("Kel var");
        }
        System.out.println();


        String isim = "Mehmet Ali Erbil";
        String replace = isim.replace('e', 'i');
        System.out.println(isim);
        System.out.println(replace);
        String replace1 = isim.replace("Erbil", "Birand");
        System.out.println(replace1);
    }
}
