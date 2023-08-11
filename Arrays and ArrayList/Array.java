import java.util.*;

public class Array {
    public static void main(String[] args) {
        int[] arr = {1,3,2,4,6,89,34,65};
        System.out.println("largest number = " + getLargest(arr));
        System.out.println("smallest number = " + getSmallest(arr));
    }
    // largest number in an array
    static int getLargest(int arr[]) {
        int largest=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]>largest)
                largest=arr[i];
        }
        return largest;
    }
    // smallest number in an array
    static int getSmallest(int arr[]) {
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]<smallest)
                smallest=arr[i];
        }
        return smallest;
    }
}
