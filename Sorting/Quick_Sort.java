// quick sort
// TC : O(nlog n);
// worst case : O(n^2)
// SC : O(1)

// worst case occurs when pivot is always the smallest or the largest element

public class Quick_Sort {
    public static void main(String[] args) {
        int[] arr = {6,3,9,5,2,8};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
    private static void printArr(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void quickSort(int[] arr, int si, int ei) {
        if(si >= ei)
            return;
        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx-1); // left part
        quickSort(arr, pIdx+1, ei); // right part
    }
    public static int partition(int[] arr, int si, int ei) {
        int pivot = arr[ei];
        int i = si-1; // to make place for els smaller than pivot
        
        for(int j=si; j<ei; j++) {
            if(arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;
    }
}
