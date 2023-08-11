// total number of subbArrays = (n*(n+1))/2

import java.util.*;
public class SubArrays {
    public static void main(String[] args) {
        int[] arr = {1,-2,6,-1,3};
        //printSubArrays(arr);
        //sum_SubArrays(arr);
        //max_min_Sum(arr);
    }

    // print all subbArrays
    public static void printSubArrays(int[] arr) {
        int ts=0;
        for(int i=0; i<arr.length; i++) {
            for(int j=i; j<arr.length; j++) {
                for(int k=i; k<=j; k++) {
                    System.out.print(arr[k]);
                }
                System.out.print("\t");
                ts++; //count total number of subArrays
            }
            System.out.println();
        }
        System.out.println("total number of pairs="+ts);
    }

    // calculate the sum of all subArrays
    public static void sum_SubArrays(int[] arr) {
        int sum=0;
        for(int i=0; i<arr.length; i++) {
            for(int j=i; j<arr.length; j++) {
                sum=0;
                for(int k=i; k<=j; k++) {
                    sum +=arr[k];  //calculate subArrays sum
                }
                System.out.println("sum="+sum);
            }
        }
    }

    // calculate the maximum and minimum subArrays sum
    public static void max_min_Sum(int[] arr) {
        int sum=0;
        int maxSum=Integer.MIN_VALUE, minSum=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++) {
            for(int j=i; j<arr.length; j++) {
                sum=0;
                for(int k=i; k<=j; k++) {
                    sum +=arr[k]; // calculate subArray sum
                }
                // compare for maximum and minimum subArrays sum
                if(sum>maxSum)
                    maxSum=sum;
                if(sum<minSum)
                    minSum=sum;
            }
        }
        System.out.println("maximum sum="+maxSum);
        System.out.println("minimum sum="+minSum);
    }
}
