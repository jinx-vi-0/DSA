// find no of ways to reach from (0,0) to (n-1, m-1) in a nXm grid
// allowed moves = right or down

// TC : O(2^(n+m))    // exponential time complexity

// total no of right turns = no of cols = m
// total no of down turns = no of rows = n
// total turns in any path = n+m
// at every cell no of choices = 2

public class Grid_ways {
    public static void main(String[] args) {
        int n=3, m=3;
        System.out.println(gridWays(0, 0, n, m));
    }
    public static int gridWays(int i, int j, int n, int m) {
        if(i == n-1 && j == m-1) // condn for last cell
            return 1;
        else if(i == n || j == m) // condn for boundary cross
            return 0;
        int w1 = gridWays(i+1, j, n, m);
        int w2 = gridWays(i, j+1, n, m);
        return w1 + w2;
    }
}

// total no of ways = ((n-1+m-1)! / (n-1)! * (m-1)!)
// TC : O(n+m)
