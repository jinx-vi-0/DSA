public class BST_assign {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static int sum = 0;

    // range sum of BST
    public static void rangeSum(Node root, int l, int r) {
        if(root == null)
            return;
        
        if(root.data >= l && root.data <= r) {
            rangeSum(root.left, l, r);
            sum += root.data;
            rangeSum(root.right, l, r);
        }
        else if(root.data > r)
            rangeSum(root.left, l, r);
        else
            rangeSum(root.right, l, r);
    }

    // find the closest element in BST
    public static int min_diff = Integer.MAX_VALUE, min_diff_key = -1;

    public static void closestElem(Node root, int key) {
        if(root == null)
            return;

        if(root.data == key) {
            min_diff_key = key;
            return;
        }

        if(min_diff > Math.abs(root.data - key)) {
            min_diff = Math.abs(root.data - key);
            min_diff_key = root.data;
        }
        
        if(key < root.data)
            closestElem(root.left, key);
        else
            closestElem(root.right, key);
    }

    // Find k-th smallest element in BST
    public static int count = 0;

    public static Node kthSmallest(Node root, int k) {
        if (root == null)
            return null;
 
        Node left = kthSmallest(root.left, k);

        if (left != null)
            return left;
 
        count++;
        if (count == k)
            return root;
 
        return kthSmallest(root.right, k);
    }

    public static void main(String[] args) {
        /*
                 8
                /  \
               5    11
              / \    \
             3   6    20

                BST
         */
        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(6);

        root.right = new Node(11);
        root.right.right = new Node(20);

        // rangeSum(root, 5, 11);
        // System.out.println("sum = " + sum);

        // closestElem(root, 19);
        // System.out.println(min_diff_key);

        int k=3;
        Node res = kthSmallest(root, k);
        if (res == null)
            System.out.println("There are less than k nodes in the BST");
        else
            System.out.println("K-th Smallest Element = " + res.data);
    }
}
