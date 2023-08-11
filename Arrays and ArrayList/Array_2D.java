
import java.util.*;
public class Array_2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        minMax(arr);
    }
    // search for an element
    public static void search(int[][] arr, int key) {
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                if(arr[i][j]==key) {
                    System.out.println("found at index : " + i +"," + j);
                    return;
                }
            }
        }
        System.out.println("not found");
    }
    // print Array
    public static void printArr(int[][] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    // find maximum and minimum element
    public static void minMax(int[][] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                if(arr[i][j]>max)
                    max = arr[i][j];
                if(arr[i][j]<min)
                    min= arr[i][j];
            }
        }
        System.out.println("largest element = " + max);
        System.out.println("smallest element = " + min);
    }
}
