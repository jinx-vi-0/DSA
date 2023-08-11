// next greater element in right
// TC : O(n)

// same approach can be used in many other problems with little variation
// next greater left
// next smaller right
// next smaller left

import java.util.*;

public class NxtGreater {
    public static void main(String[] args) {
        int[] arr = {6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int[] nxtGreater = new int[arr.length];

        for(int i=arr.length-1; i>=0; i--) {
            // while
            while(!s.isEmpty() && arr[s.peek()] <= arr[i])
                s.pop();

            // if-else
            if(s.isEmpty())
                nxtGreater[i] = -1;
            else
                nxtGreater[i] = arr[s.peek()];

            // push in stack
            s.push(i);
        }

        System.out.println(Arrays.toString(nxtGreater));
    }
}
