import java.util.Scanner;
//reverse a number

public class ReverseNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number");
        int num = in.nextInt();
        int res=0;
        while(num != 0) {
            int temp = num % 10;
            res = (10*res) + temp;
            num /= 10;
        }
        System.out.print("reverse num = " + res);
    }
}
