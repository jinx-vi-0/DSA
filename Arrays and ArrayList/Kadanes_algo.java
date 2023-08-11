// Kadanes algorithm
// used to find the maximum subArray sum
// time complexity = O(n)
// corner case = if all the elements are negative then it will return zero as maximum subArray sum but the
// actural maxumum subArray sum is the least negative element

import java.util.*;
public class Kadanes_algo {
    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        //int[] arr = {-2,-3,-4,-1,-2,-1,-5,-3};
        System.out.println("maximum subArray sum = " + kadanes(arr));
    }
    public static int kadanes(int[] arr) {
        int sum=0;
        boolean flag=false;
        int maxSum=Integer.MIN_VALUE;
        // check whether the elements in the array is negative or positive
        for(int i=0; i<arr.length;) {
            if(arr[i]<0)
                i++;
            else {
                flag=true;
                break;
            }
        }
        if(!flag) {
            for(int i=0; i<arr.length; i++) {
                // maxSum will be the least negative element
                maxSum = Math.max(arr[i],maxSum);
            }
        }
        else {
            for(int i=0; i<arr.length; i++) {
                sum += arr[i];
                if(sum<0)
                    sum=0;
                maxSum=Math.max(sum,maxSum);
            }
        }
        return maxSum;
    }
}
