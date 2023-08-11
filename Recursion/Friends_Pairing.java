/*
 Given n friends each one can remain single or can be paired up with some
 other friend. Each friend can be paired only once. Find out the total
 number of ways in which friends can remain single or can be paired up.
 */

public class Friends_Pairing {
    public static void main(String[] args) {
        System.out.println(friendsPairing(3));
    }
    public static int friendsPairing(int n) {
        if(n == 1 || n == 2)
            return n;
        
        // choice

        // single
        int fnM1 = friendsPairing(n-1);

        // pair
        int fnM2 = friendsPairing(n-2);
        // each one can pair with other n-1 
        int pairWays = (n-1) * fnM2;

        int totalWays = fnM1 + pairWays;
        return totalWays;
    }
}