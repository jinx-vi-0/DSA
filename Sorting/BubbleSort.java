import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {-4,-5,-2,1,6,-8,-44,7,4};
        bubbleSort(arr);
        System.out.print(Arrays.toString(arr));
    }
    public static void bubbleSort(int[] nums) {
	    for(int i=0; i<nums.length-1; i++) {
	        int count=0;
	        for(int j=0; j<nums.length-i-1; j++) {
	            if(nums[j]>nums[j+1]) {
	                int temp = nums[j];
	                nums[j]=nums[j+1];
	                nums[j+1]=temp;
	                count++;
	            }
	        }
	        if(count==0)
	            return;
	    }
	}
}