public class Recursion {
    public static void main(String[] args) {
        int[] arr = {8,3,6,9,5,10,2,5,3};
        //System.out.println(isSorted(arr, 0));
        //System.out.println(firstOccurence(arr, 5, 0));
        //System.out.println(lastOccurence(arr, 5, arr.length-1));
        System.out.println(lastOccurence(arr, 5, 0));
    }

    // check if an array is Sorted or not using recursion
    // time complexity : O(n)
    // space complexity : O(n)
    public static boolean isSorted(int[] arr, int i) {
        if(i==arr.length-1) {
            return true;
        }
        if(arr[i]>arr[i+1])
            return false;
        return isSorted(arr, i+1);
    }

    // find the first occurence of a key in an array
    // worst complexity : O(n)
    // space complexity : O(n)
    public static int firstOccurence(int[] arr, int key, int i) {
        if(i==arr.length)
            return -1;
        if(arr[i]==key)
            return i;
        return firstOccurence(arr, key, i+1);
    }

    // find the last occurence of a key in an array
    // worst complexity : O(n)
    // space complexity : O(n)

    // public static int lastOccurence(int[] arr, int key, int i) {
    //     if(i==0)
    //         return -1;
    //     if(arr[i]==key)
    //         return i;
    //     return firstOccurence(arr, key, i-1);
    // }

    public static int lastOccurence(int[] arr, int key, int i) {
        if(i==arr.length)
            return -1;
        int isFound = lastOccurence(arr, key, i+1);
        if(isFound==-1 && arr[i]==key)
            return i;
        return isFound;
    }
}
