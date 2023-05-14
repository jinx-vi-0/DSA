import java.util.*;

public class HeapOperations {

    static class Heap {
        ArrayList<Integer> list = new ArrayList<>();

        // TC : O(log n)
        public void add(int data) {
            // add at last index
            list.add(data);

            int childIdx = list.size()-1;  // Child Index
            int parentIdx = (childIdx-1)/2; // Parent Index

            while(list.get(childIdx) < list.get(parentIdx)) { // O(log n)
                // swap
                int temp = list.get(childIdx);
                list.set(childIdx, list.get(parentIdx));
                list.set(parentIdx, temp);

                childIdx = parentIdx;
                parentIdx = (childIdx-1)/2;
            }
        }

        public int peek() {
            return list.get(0);
        }

        // TC : O(log n)
        private void heapify(int i) {
            int left = 2*i+1;
            int right = 2*i+2;
            int minIdx = i;

            if(left < list.size() && list.get(minIdx) > list.get(left))
                minIdx = left;
            
            if(right < list.size() && list.get(minIdx) > list.get(right))
                minIdx = right;

            if(minIdx != i) {
                // swap
                int temp = list.get(i);
                list.set(i, list.get(minIdx));
                list.set(minIdx, temp);

                heapify(minIdx);
            }
        }

        public int remove() {
            int data = list.get(0);

            // step1 - swap first & last
            int temp = list.get(0);
            list.set(0, list.get(list.size()-1));
            list.set(list.size()-1, temp);

            // step2 - delete last
            list.remove(list.size()-1);

            // step3 - heapify
            heapify(0);

            return data;
        }

        public boolean isEmpty() {
            return list.size() == 0;
        }
    }

    public static void main(String[] args) {
        Heap pq = new Heap();
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(5);

        while(!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
