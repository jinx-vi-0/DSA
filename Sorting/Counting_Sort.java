import java.util.*;
public class Counting_Sort
{
	public static void main(String[] args) {
	    int[] arr = {1,4,1,3,2,4,3,7};
	    countingSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void countingSort(int[] arr) {
        // find the range of array
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        // form the count array or frequency array
        int[] count = new int[largest+1];
	    for(int i=0; i<arr.length; i++) {
            count[arr[i]]++;
        }
        // change element in the main array according to count array
        int j=0;
        for(int i=0; i<count.length; i++) {
            // run the loop only when the frequency greater than zero
            while(count[i]>0) {
                // count[i] = frequency array element
                arr[j] = i; // set main array element as per the index value
                j++;
                count[i]--; //decrease the count[i] value to zero
            }
        }
	}
}
