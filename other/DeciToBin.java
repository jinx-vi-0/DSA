import java.util.Scanner;
//decimal to binary conversion
public class DeciToBin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter decimal number : ");
        int num = in.nextInt();
        int binNum=0, pow=0;
        while(num>0) {
            binNum = binNum + ((num%2)*(int)Math.pow(10,pow));
            num = num/2;
            pow++;
        }
        System.out.println("binary : " + binNum);
    }
}