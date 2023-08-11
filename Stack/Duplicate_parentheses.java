// duplicate parentheses
// TC : O(n)

import java.util.*;
public class Duplicate_parentheses {

    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            // closing
            if(ch == ')') {
                int count = 0;
                while(s.pop() != '(') {
                    count++;
                }
                if(count < 1) {
                    return true; // duplicate
                }
            }
            else { // opening
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "((a+b))";
        System.out.println(isDuplicate(str));
    }
}
