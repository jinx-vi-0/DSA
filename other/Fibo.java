import java.util.Scanner;
//fiboancci series

public class Fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the value of n : ");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        if(n==1 || n>1)
        System.out.print(a + "\t");
        if(n==2 || n>2)
        System.out.print(b + "\t");
        int next_term = a + b;
        for(int i=3; i<=n; i++) {
            a = b;
            b = next_term;
            next_term = a + b;
            System.out.print(next_term + "\t");
        }
    }
}
