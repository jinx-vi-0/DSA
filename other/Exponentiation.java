// to implement pow(x, y)
// time complexity : O(log y)
public class Exponentiation {
    public static void main(String[] args) {
        //System.out.println(fastExponentiation(5, 3));
        //System.out.println(modularExponentiation(2, 3, 5));
        System.out.println(modularExpo(2, 3, 5));
    }
    public static int fastExponentiation(int x, int y) {
        int ans = 1;
        while(y>0) {
            // If y is odd, 
            // multiply
            // x with result
            if((y&1)!=0)
                ans = ans * x;
            x = x * x;
            y = y>>1;
        }
        return ans;
    }
    /* Iterative Function to calculate (x^y)%p in O(log y) */
    public static int modularExponentiation(int x, int y, int p) {
        int ans=1;
        while(y>0) {
            if((y & 1) != 0)
                ans = ans * x;
            x = x * x;
            y = y>>1;
        }
        return ans%p;
    }
    // The problem with the above solutions is, overflow may occur for large values of x
    /*
    (ab) mod p = ( (a mod p) (b mod p) ) mod p 

    For example a = 50,  b = 100, p = 13
    50  mod 13  = 11
    100 mod 13  = 9
    (50 * 100) mod 13 = ( (50 mod 13) * (100 mod 13) ) mod 13 
    or (5000) mod 13 = ( 11 * 9 ) mod 13
    or 8 = 8
     */
    public static int modularExpo(int x, int y, int p) {
        int ans = 1;
        x = x%p;
        if(x==0) // in case x is divisible by p
            return 0;
        while(y>0) {
            if((y&1)!=0)
                ans = (ans*x)%p;
            x = (x*x)%p;
            y = y>>1;
        }
        return ans;
    } 
}
