/*
 given a "2xn" board/floor and tiles of size "2x1", count the number of ways to tile the given board
 using the 2x1 tiles.
 ( A tile can either be placed vertically or horizontally. )
 */

public class Tilling_Problem {
    public static void main(String[] args) {
        System.out.println(tillingProblem(4));
    }
    public static int tillingProblem(int n) {
        // base case
        if(n==0 || n==1)
            return 1;

        // vertical choice
        int fnM1 = tillingProblem(n-1);

        // horizontal choice
        int fnM2 = tillingProblem(n-2);

        int totalWays = fnM1 + fnM2;

        return totalWays;
    }
}
