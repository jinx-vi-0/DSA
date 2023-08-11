import java.util.Scanner;

public class BinCoeff {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the value of n : ");
        int n = in.nextInt();
        System.out.print("enter the value of r : ");
        int r = in.nextInt();
        System.out.println("binomial coefficient = " + binCoeff(n,r));
    }
    public static int factorial(int num) {
        int fact=1;
        for(int i=1; i<=num; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static int binCoeff(int n, int r) {
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nMr_fact = factorial(n-r);
        return n_fact/(r_fact*nMr_fact);
    }
}
