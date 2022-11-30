package day40;

public class MainApp4 {
    public static void main(String[] args) {
        //StringBuilder, StringBuffer

        StringBuilder sb = new StringBuilder("Merhaba!");
        sb.append("Nasilsin?");
        sb.append(5);
        sb.insert(8,"Kardes");
        //sb.reverse();
        sb.delete(8,14);
        System.out.println(sb);
    }
}
