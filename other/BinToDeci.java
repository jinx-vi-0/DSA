import java.util.Scanner;
//binary to decimal conversion
public class BinToDeci {
    public static void main(String[] args) {
        System.out.print("enter binary : ");
        Scanner in = new Scanner(System.in);
        int deciNum=0, pow=0;
        int num = in.nextInt();
        while(num>0) {
            deciNum = deciNum + ((num%10)*(int)Math.pow(2,pow));
            num = num/10;
            pow++;
        }
        System.out.println("decimal : " + deciNum);
    }
}