// to find x to the power y using recursion
public class Power {
    public static void main(String[] args) {
        //System.out.println(power(2, 5));
        System.out.println(optimizedPower(2, 10));
    }
    // to find x^y
    // TC : O(n)
    public static int power(int x, int y) {
        if(y==0)
            return 1;
        return x * power(x, y-1);
    }
    // optimized way to find power
    // time complexity : O(log n)
    public static int optimizedPower(int x, int y) {
        if(y==0)
            return 1;
        // int halfPowersq = optimizedPower(x, y/2) * optimizedPower(x, y/2);
        int halfPower = optimizedPower(x, y/2);
        int halfPowersq = halfPower * halfPower;
        if(y%2!=0) // y is odd
            halfPowersq = x * halfPowersq;
        return halfPowersq;
    }
}
