public class ClimbingStairs {
    public static int countWays(int n) {
        if(n == 0) return 1;
        if(n < 0) return 0;
        
        return countWays(n-1) + countWays(n-2);
    }
    public static int ways(int n, int[] dp) {
        if(n == 0) return 1;
        if(n < 0) return 0;

        if(dp[n] != 0) return dp[n];

        dp[n] = ways(n-1, dp) + ways(n-2, dp);
        return dp[n];
    }
    public static int countWaysTab(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2; i<=n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 3;

        // recursive approach
        System.out.println(countWays(n));

        // memoization
        int[] dp = new int[n+1];
        System.out.println(ways(n, dp));

        // tabulation
        System.out.println(countWaysTab(n));
    }
}
