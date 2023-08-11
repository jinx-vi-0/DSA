import java.util.*;
// factorial
public class Factorial {
    public static void main(String[] args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : ");
        int num = sc.nextInt();
        fact(num);
    }
    public static void fact(int n) {
        if(n<0) {
            System.out.println("invalid number");
            return;
        }
        int factorial = 1;
        for(int i=n; i>=1; i--) {
            factorial=factorial*i;
        }
        System.out.print("factorial= ");
        System.out.println(factorial);
        return;
    }
}