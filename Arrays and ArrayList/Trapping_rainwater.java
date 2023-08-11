// time complexity - O(n)

import java.util.*;

public class Trapping_rainwater {
    public static void main(String[] args) {
        int[] height = {4,2,0,6,3,2,5};
        int width=1;
        System.out.println("Trapped water = " + trappedRainwater(height,width));
    }
    public static int trappedRainwater(int[] height, int width) {
        int n = height.length;

        // calculate left max boundary - array
        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++) {
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }

        // calculate right max boundary - array
        int[] rightMax = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--) {
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }

        int trappedWater=0;
        for(int i=0; i<n; i++) {
            // waterLevel = min(leftMax boundary, rightMax boundary)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // trappedWater = waterLevel - height[i]
            trappedWater += (waterLevel - height[i])*width;
        }
        return trappedWater;
    }
}
