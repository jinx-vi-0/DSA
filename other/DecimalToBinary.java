import java.util.Scanner;
//decimal to binary conversion
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int binNum=0, place=1;
        System.out.print("enter decimal number : ");
        int num = in.nextInt();
        while(num>0) {
            binNum = binNum + (num % 2)*place;
            num = num/2;
            place= place*10;
        }
        System.out.println("binary : " + binNum);
    }
}