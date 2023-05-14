// find the closest element in BST

public class BST5 {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static Node findClosestNode(Node root, int target) {
        if (target < root.data && root.left != null) {
          // Closest node is either the current node or a node in the left subtree
          Node closestNodeLeftSubtree = findClosestNode(root.left, target);
          return getClosestNode(root, closestNodeLeftSubtree, target);
        }
        else if (target > root.data && root.right != null) {
          // Closest node is either the current node or a node in the right subtree
          Node closestNodeRightSubtree = findClosestNode(root.right, target);
          return getClosestNode(root, closestNodeRightSubtree, target);
        }
        else {
          return root;
        }
      }
    
    public static Node getClosestNode(Node node1, Node node2, int target) {
        if(Math.abs(target - node1.data) < Math.abs(target - node2.data))
          return node1;
        else
          return node2;
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

        Node closestNode = findClosestNode(root, 19);
		    System.out.println(closestNode.data);
    }
}
