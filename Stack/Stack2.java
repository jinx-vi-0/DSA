import java.util.*;

public class Stack2 {

    // push the element at the bottom of the stack
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if(s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    // reverse a string using a stack
    public static String reverse(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder res = new StringBuilder("");
        while(!s.isEmpty()) {
            res.append(s.pop());
        }
        return res.toString();
    }

    // reverse a stack
    public static void reverseStack(Stack<Integer> s) {
        if(s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        // 3,2,1

        // pushAtBottom(s, 4);
        // while(!s.isEmpty()) {
        //     System.out.println(s.pop());
        // }

        // String str = "hello world";
        // System.out.println(reverse(str));

        reverseStack(s);
        printStack(s);
        // 1,2,3
    }
}
