// greedy algorithm

// Activity Selection
// TC: O(n)

// You are given n activities with their start and end times. Select the maximum number of activities that
// can be performed by a single person, assuming that a person can only work on a single activity at a time
// Activity are sorted according to end time

import java.util.*;

public class Activity_Selection {
    // public static void main(String[] args) {
    //     int[] start = {1,3,0,5,8,5};
    //     int[] end = {2,4,6,7,9,9};

    //     // if activity are end time sorted basis
    //     int maxAct = 0;
    //     ArrayList<Integer> ans = new ArrayList<>();

    //     // 1st Activity
    //     maxAct=1;
    //     ans.add(0);
    //     int lastEnd = end[0];
    //     for(int i=1; i<end.length; i++) {
    //         if(start[i] >= lastEnd) {
    //             // activity selection
    //             maxAct++;
    //             ans.add(i);
    //             lastEnd = end[i];
    //         }
    //     }
    //     System.out.println("maximum activities = " + maxAct);
    //     for(int i=0; i<ans.size(); i++) {
    //         System.out.print("A"+ans.get(i)+" ");
    //     }
    //     System.out.println();
    // }


    
    // if activity are not sorted basis
    // TC : O(nlog n)
    public static void main(String[] args) {
        int[] start = {1,3,0,5,8,5};
        int[] end = {2,4,6,7,9,9};

        // sorting
        int[][] activities = new int[start.length][3];
        for(int i=0; i<start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        // lambda function - shortform
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2])); // sorting on the basis of column 2
        // comparator is an interface for sorting java objects

        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // 1st Activity
        maxAct=1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];

        for(int i=1; i<end.length; i++) {
            if(activities[i][1] >= lastEnd) {
                // activity selection
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }

        System.out.println("maximum activities = " + maxAct);
        for(int i=0; i<ans.size(); i++) {
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
    }
}
