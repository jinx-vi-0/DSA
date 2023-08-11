import java.util.Scanner;
//binary to decimal conversion
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter binary : ");
        int num = in.nextInt();
        int deciNum = 0;
        int pow = 1;
        while(num!=0) {
            deciNum = deciNum + ((num % 10)*pow);
            num = num/10;
            pow = pow*2;
        }
        System.out.println("decimal : " + deciNum);
    }
}