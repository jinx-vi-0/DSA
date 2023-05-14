// leetcode : 733

// Flood Fill Algorithm
// TC : O(m*n)

import java.util.*;

public class FloodFillAlgo {
    public static void helper(int[][] image, int sr, int sc, int newColor, int prevColor) {
        if(sr == -1 || sr == image.length || sc == -1 || sc == image[0].length)
            return;

        if(image[sr][sc] != prevColor)
            return;

        image[sr][sc] = newColor;

        helper(image, sr, sc-1, newColor, prevColor);
        helper(image, sr, sc+1, newColor, prevColor);
        helper(image, sr-1, sc, newColor, prevColor);
        helper(image, sr+1, sc, newColor, prevColor);
    }

    public static void main(String[] args) {
        int[][] image = {{1,1,1},
                         {1,1,0},
                         {1,0,1}};

        int sr = 1, sc = 1, color = 2;

        if(image[sr][sc] != color)
            helper(image, sr, sc, color, image[sr][sc]);

        for(int i=0; i<image.length; i++) {
            for(int j=0; j<image[0].length; j++) {
                System.out.print(image[i][j] + " ");
            }
            System.out.println();
        }
    }
}
