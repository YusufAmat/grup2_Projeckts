package day38;

public class MainApp1 {
    public static void main(String[] args) {
        //String sinifi instance methods
        String isim = "Ahmet Dursun";
        if (isim.equalsIgnoreCase("ahmet dursun")){
            System.out.println("Aynidir");
        }

        if (isim.equals("ahmet dursun")){
            System.out.println("Aynidir");
        }
    }
}
