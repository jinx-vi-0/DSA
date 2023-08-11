import java.util.Scanner;
// swap two numbers without using a temporary variable
public class Swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter first number : ");
        int num1 = in.nextInt();
        System.out.print("enter second number : ");
        int num2 = in.nextInt();
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("first number : " + num1);
        System.out.println("second number : " + num2);
    }
}
