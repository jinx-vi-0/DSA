// find if any pair in a sorted ArrayList has a target sum
// list = [1,2,3,4,5,6]    target = 5

import java.util.ArrayList;
public class Pair_sum1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 5;
        System.out.println(pairSum(list, target));
    }

    // brute force
    // public static boolean pairSum(ArrayList<Integer> list, int target) {
    //     for(int i=0; i<list.size(); i++) {
    //         for(int j=i+1; j<list.size(); j++) {
    //             if(list.get(i) + list.get(j) == target)
    //                 return true;
    //         }
    //     }
    //     return false;
    // }

    // 2-pointer approach
    public static boolean pairSum(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size()-1;

        while(lp != rp) {
            // case 1
            if(list.get(lp)+list.get(rp)==target)
                return true;
            
            // case 2
            else if(list.get(lp)+list.get(rp)<target)
                lp++;

            // case 3
            else
                rp--;
        }
        return false;
    }
}
