// Prefix Problem
// find shortest unique prefix for every word in a given list.

import java.util.ArrayList;

public class PrefixProblem {
    static class Node {
        Node[] children = new Node[26];
        boolean eow = false;
        int freq;

        public Node() {
            for (Node i : children) {
                i = null;
            }
            freq = 1;
        }
    }

    public static Node root = new Node();

    public static ArrayList<String> ans = new ArrayList<>();

    public static void insert(String word) {
        Node curr = root;
        for(int level=0; level<word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if(curr.children[idx] == null)
                curr.children[idx] = new Node();
            else
                curr.children[idx].freq++;

            curr = curr.children[idx];
        }

        curr.eow = true;
    }

    public static void search(String key) {
        Node curr = root;
        String str = "";
        for(int level=0; level<key.length(); level++) {
            int idx = key.charAt(level) - 'a';
            if(curr.children[idx] != null) {
                str += key.charAt(level);
                if(curr.children[idx].freq == 1) {
                    ans.add(str);
                    break;
                }
            }

            curr = curr.children[idx];
        }
    }

    public static void main(String[] args) {
        String[] words = {"zebra", "dog", "duck", "dove"};
        for(int i=0; i<words.length; i++) {
            insert(words[i]);
        }
        for(int i=0; i<words.length; i++) {
            search(words[i]);
        }
        System.out.println(ans);
    }
}
