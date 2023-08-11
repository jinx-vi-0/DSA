
public class Ceiling {
	public static void main(String[] args) {
	    int[] arr = {2,3,5,9,14,16,18};
	    int target = 1;
		System.out.println(ceiling(arr, target));
	}
	public static int ceiling(int[] nums,int target) {
		if(target>nums[nums.length-1])
			return -1;
	    int start=0;
	    int end=nums.length-1;
	    int mid=0;
	    while(start<=end) {
	        mid = start+(end-start)/2;
	        if(nums[mid]>target)
	            end=mid-1;
	        else if(nums[mid]<target)
	            start=mid+1;
	        else
	            return nums[mid];
	    }
	        return nums[start];
	}
}
