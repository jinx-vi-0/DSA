import java.util.Arrays;
public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {2,4,3,5,1};
        cyclicsort(arr);
        System.out.print(Arrays.toString(arr));
    }
    static void cyclicsort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if(arr[i] != correct)
                swap(arr, i , correct);
            else
                i++;
        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
