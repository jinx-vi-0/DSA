public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int numToSearch = 5;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]==numToSearch) {
                System.out.println("element is at index : " + i);
                return;
            }
        }
        System.out.println("not found");
    }
}
