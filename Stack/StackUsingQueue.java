// stack using 2 queue

import java.util.*;
import java.util.LinkedList;

public class StackUsingQueue {

    // first method
    // pop/peek - O(n) , push - O(1)
    static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        // public static void push(int data) {
        //     if(!q1.isEmpty()) {
        //         q1.add(data);
        //     }
        //     else {
        //         q2.add(data);
        //     }
        // }

        // public static int pop() {
        //     if(isEmpty()) {
        //         System.out.println("empty stack");
        //         return -1;
        //     }
        //     int top = -1;
        //     // case 1
        //     if(!q1.isEmpty()) {
        //         while(!q1.isEmpty()) {
        //             top = q1.remove();
        //             if(q1.isEmpty()) {
        //                 break;
        //             }
        //             q2.add(top);
        //         }
        //     }
        //     else { // case 2
        //         while(!q2.isEmpty()) {
        //             top = q2.remove();
        //             if(q2.isEmpty()) {
        //                 break;
        //             }
        //             q1.add(top);
        //         }
        //     }
        //     return top;
        // }

        // public static int peek() {
        //     if(isEmpty()) {
        //         System.out.println("empty stack");
        //         return -1;
        //     }
        //     int top = -1;
        //     // case 1
        //     if(!q1.isEmpty()) {
        //         while(!q1.isEmpty()) {
        //             top = q1.remove();
        //             q2.add(top);
        //         }
        //     }
        //     else { // case 2
        //         while(!q2.isEmpty()) {
        //             top = q2.remove();
        //             q1.add(top);
        //         }
        //     }
        //     return top;
        // }


        // second method
        // push - O(n), pop/peek-O(1)
        public static void push(int data) {
            int top = -1;
            while(!q1.isEmpty()) {
                top = q1.remove();
                q2.add(top);
            }
            q1.add(data);
            while(!q2.isEmpty()) {
                top = q2.remove();
                q1.add(top);
            }
        }

        public static int pop() {
            if(q1.isEmpty()) {
                System.out.println("empty stack");
                return -1;
            }
            return q1.remove();
        }

        public static int peek() {
            if(q1.isEmpty()) {
                System.out.println("empty stack");
                return -1;
            }
            return q1.peek();
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
