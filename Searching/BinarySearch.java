import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[50];
        for(int i=0; i<arr.length; i++) {
            arr[i]=i+1;
        }
        System.out.print("enter element(1-50): ");
        int key = in.nextInt();

        int ans = binary_search(arr, key);
        if(ans == -1)
            System.out.println("element not found");
        else
            System.out.println("element found at index :" + ans);
    }
    public static int binary_search(int[] arr, int target) {
        int start=0, end=arr.length-1;
        while(start<=end) {
            int mid = (start+end)/2;
            if(key==arr[mid]) {
                return mid;
            }
            if(key>arr[mid])
                start=mid+1;
            else
                end=mid-1;
        }
        return -1;
    }
    public static int first_Occurence(int[] arr, int key) {
        int st = 0, end = arr.length-1;
        while(st < end) {
            int mid = (st+end)/2;
            if(arr[mid] < key)
                st = mid + 1;
            else
                end = mid;
        }
        return (arr[st] == key) ? st : -1;
    }
    public static int last_Occurence(int[] arr, int key) {
        int st = 0, end = arr.length-1;
        while(st < end) {
            int mid = (st+end+1)/2;
            if(arr[mid] <= key)
                st = mid;
            else
                end = mid - 1;
        }
        return (arr[st] == key) ? st : -1;
    }
}
