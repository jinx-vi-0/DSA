import java.util.Scanner;
// prime numbers in a range
public class PrimeInRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter starting point : ");
        int n1 = in.nextInt();
        System.out.print("enter ending point : ");
        int n2 = in.nextInt();
        primesInRange(n1, n2);
    }
    public static boolean isPrime(int num) {
        if(num<=1)
            return false;
        for(int i=2; i<=Math.sqrt(num); i++) {
            if(num%i==0)
                return false;
        }
        return true;
    }

    public static void primesInRange(int n1, int n2) {
        for(int i=n1; i<=n2; i++) {
            if(isPrime(i))
            System.out.print(i + " ");
        }
    }
}