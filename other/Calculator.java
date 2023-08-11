import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.println("enter the operator");
            char op = in.next().trim().charAt(0);
            if(op=='+' || op=='-' || op=='*' || op=='/' || op=='%') {
                System.out.println("enter first numer");
                int num1 = in.nextInt();
                System.out.println("enter second number");
                int num2 = in.nextInt();
                int ans=0;
                if(op=='+')
                    ans = num1 + num2;
                if(op=='-')
                    ans = num1 - num2;
                if(op=='*')
                    ans = num1 * num2;
                if(op=='/') {
                    if(num1 > num2 && num2 != 0)
                        ans = num1 / num2;
                    else
                        break;
                }
                if(op=='%')
                    ans = num1 % num2;
                System.out.println("ans = " + ans);
            }
            else {
                System.out.println("invalid operator");
                break;
            }
        }
    }
}
