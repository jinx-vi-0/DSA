// Prefix sum approach

import java.util.*;
public class Prefix_Sum {
    public static void main(String[] args) {
        int[] arr = {1,-2,6,-1,3};
        calculateSum(arr);
    }
    public static void calculateSum(int[] arr) {
        // create a prefixSum array
        int[] prefix = new int[arr.length];
        // 0th element of the prefix is the 0th element of array
        prefix[0] = arr[0];
        for(int i=1; i<prefix.length; i++) {
            prefix[i] = prefix[i-1]+arr[i];
        }
        int sum=0;
        int maxSum=0;
        for(int i=0; i<arr.length; i++) {
            for(int j=i; j<arr.length; j++) {
                // to find the sum of subArray from the prefix array
                sum = i==0 ? prefix[j] : prefix[j]-prefix[i-1];
                // for i==0 sum will be 0th element of the array or 0th element of prefix array
            }
            if(sum>maxSum)
                maxSum=sum;
        }
        System.out.println("maximum sum = "+maxSum);
    }
}
