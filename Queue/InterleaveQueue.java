// Interleave 2 halves of a queue (even length)
// TC : O(n)
// SC : O(n)

import java.util.*;
import java.util.LinkedList;
public class InterleaveQueue {

    public static void interleave(Queue<Integer> q) {
        int size = q.size();
        Queue<Integer> firstHalf = new LinkedList<>();

        for(int i=0; i<size/2; i++) {
            firstHalf.add(q.remove());
        }

        while(!firstHalf.isEmpty()) {
            q.add(firstHalf.remove());
            q.add((q.remove()));
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        int i=1;
        while(i<=10) {
            q.add(i);
            i++;
        }

        interleave(q);

        while(!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
        System.out.println();
    }
}
