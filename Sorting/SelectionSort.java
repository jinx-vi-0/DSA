import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,4,3,5,1};
        selectionSort(arr);
        System.out.print(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            int last = arr.length-1-i;
            int maxIndex = getMaxIndex(arr, last);
            swap(arr, maxIndex, last);
        }
    }
    // find max element in the array
    static int getMaxIndex(int[] arr, int n) {
        int max = 0;
        for(int i=0; i<=n; i++) {
            if(arr[i]>arr[max]) {
                max=i;
            }
        }
        return max;
    }
    // swap the elements
    static void swap(int[] arr, int max, int last) {
        int temp = arr[max];
        arr[max]=arr[last];
        arr[last]=temp;
    }
}
