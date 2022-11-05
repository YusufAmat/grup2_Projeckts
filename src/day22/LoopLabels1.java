package day22;

public class LoopLabels1 {
    public static void main(String[] args) {
        int []numbers = {1,3,5,6,8,10};
        int sum = 0;
        Label1:
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]%2==0){
                break Label1;
            }
            sum+=numbers[i];
        }
        System.out.println("Toplam = " + sum);
    }
}
