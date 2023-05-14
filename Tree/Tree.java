
public class Tree {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // height of a tree
    // TC : O(n)
    public static int height(Node root) {
        if(root == null)
            return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }

    // count nodes of a tree
    // TC : O(n)
    public static int count(Node root) {
        if(root == null)
            return 0;
        
        int lc = count(root.left);
        int rc = count(root.right);
        
        return lc+rc+1;
    }

    // sum of nodes
    // TC : O(n)
    public static int sum(Node root) {
        if(root == null)
            return 0;
        
        int ls = sum(root.left);
        int rs = sum(root.right);
        
        return ls+rs+root.data;
    }

    // diameter of tree
    // O(n^2)
    public static int diameter2(Node root) {
        if(root == null)
            return 0;
        int leftDiam = diameter2(root.left);
        int leftH = height(root.left);
        int rightDiam = diameter2(root.right);
        int rightH = height(root.right);

        int selfDiam = leftH + rightH + 1;

        return Math.max(selfDiam, Math.max(leftDiam, rightDiam));
    }

    static class Info {
        int diam;
        int ht;

        public Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }
    // approach 2
    // TC: O(n)
    public static Info diameter(Node root) {
        if(root == null)
            return new Info(0,0);
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;
        return new Info(diam, ht);
    }

    // kth level of a tree
    // TC : O(n)
    public static void kLevel(Node root, int level, int k) {
        if(root == null)
            return;
        if(level == k) {
            System.out.print(root.data+" ");
            return;
        }
        kLevel(root.left, level+1, k);
        kLevel(root.right, level+1, k);
    }

    public static void main(String[] args) {
        /*
                      1
                    /   \
                   2     3
                  / \   /  \
                 4   5 6    7
         */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        //System.out.println(height(root));
        
        //System.out.println(count(root));

        //System.out.println(sum(root));

        //System.out.println(diameter2(root));

        // System.out.println(diameter(root).diam);
        // System.out.println(diameter(root).ht);

        int k = 3;
        kLevel(root, 1, k);
    }
}
