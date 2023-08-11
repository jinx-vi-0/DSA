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
        int start=0, end=arr.length-1;
        while(start<=end) {
            int mid = (start+end)/2;
            if(key==arr[mid]) {
                System.out.println("element found at index " + mid);
                return;
            }
            if(key>arr[mid])
                start=mid+1;
            else
                end=mid-1;
        }
        System.out.println("element not found");
    }
}