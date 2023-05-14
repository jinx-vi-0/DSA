// word break problem :
// given an input string and a dictionary of words, find out if the input string
// can be broken into a space-separated sequence of dictionary words.

public class WordBreakProblem {
    static class Node {
        Node[] children = new Node[26];
        boolean eow = false;

        public Node() {
            for (Node i : children) {
                i = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for(int level=0; level<word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if(curr.children[idx] == null)
                curr.children[idx] = new Node();

            curr = curr.children[idx];
        }

        curr.eow = true;
    }

    public static boolean search(String key) {
        Node curr = root;
        for(int level=0; level<key.length(); level++) {
            int idx = key.charAt(level) - 'a';
            if(curr.children[idx] == null)
                return false;

            curr = curr.children[idx];
        }

        return curr.eow == true;
    }

    // TC : O(L)
    public static boolean wordBreak(String key) {
        if(key.length() == 0)
            return true;

        for(int i=1; i<=key.length(); i++) {
            // substring[beg idx, last idx)
            String firstPart = key.substring(0,i);
            String secondPart = key.substring(i);
            if(search(firstPart) && wordBreak(secondPart))
                return true;
        }

        return false;
    }
 
    public static void main(String[] args) {
        String[] words = {"i", "like", "sam", "samsung", "mobile", "ice"};
        for(int i=0; i<words.length; i++) {
            insert(words[i]);
        }

        String key = "ilikesamsung";

        System.out.println(wordBreak(key));
    }
}
