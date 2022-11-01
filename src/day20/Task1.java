package day20;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Create an array that holds 12 months names
        //User should be able to enter month index and output should be:
        //“The month name is <MonthName>”
        Scanner scanner = new Scanner(System.in);
        String[] months = {"Ocak", "Subat", "Mart", "Nisan", "Mayis", "Haziran",
                "Temmuz", "Agustos", "Eylül", "Ekim", "Kasim", "Aralik"};
        System.out.print("Enter month index [1 -12]: ");
        int i = scanner.nextInt();
        if (i>0&i<=12){
            System.out.println(i + ". month = " + months[i - 1]);
        }else{
            System.out.println("Wrong choice");
        }

    }
}
