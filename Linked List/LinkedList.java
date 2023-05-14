public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if(head==null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data) {
        if(idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while(i < idx-1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if(size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if(size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for(int i=0; i<size-2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data; // tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    // iterative search
    public int itrSearch(int key) {
        Node temp = head;
        int idx=0;
        while(temp != null) {
            if(temp.data == key)
                return idx;
            temp = temp.next;
            idx++;
        }
        return -1;
    }

    // recursive search
    public int helper(Node head, int key) {
        if(head == null)
            return -1;
        if(head.data == key)
            return 0;
        int idx = helper(head.next, key);
        if(idx == -1)
            return -1;
        return idx+1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    // reverse a linked list
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // delete Nth node from end
    public void deleteNthfromEnd(int n) {
        if(n == size) {
            head = head.next;
            return;
        }
        Node temp = head;
        int i=0;
        while(i<size-n-1) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
    }

    // find middle node
    // slow - fast approach
    // turtle - hare approach
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next; // +1;
            fast = fast.next.next; // +2
        }
        return slow; // slow is the mid node
    }

    // check if Linked List is palindrome
    public boolean checkPalindrome() {
        if(head == null || head.next == null) {
            return true;
        }

        // step 1- find mid node
        Node midNode = findMid(head);

        // step 2- reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; // right half head
        Node left = head;

        // step 3- check left half & right half
        while(right != null) {
            if(left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    // detect a cycle/loop in a linked list
    public static boolean isCycle() {
        // floyd's cycle finding algorithm
        // (slow-fast approach)
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
            if(slow == fast) { // cycle exist
                return true;
            }
        }
        return false; // cycle does't exist
    }

    // 
    public static void removeCycle() {
        // detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                cycle = true;
                break;
            }
        }
        if(cycle == false) {
            return;
        }

        // find meeting point
        slow = head;
        Node prev = null;
        while(slow != fast) {
            slow = slow.next;
            prev = fast;
            fast = fast.next;
        }

        // remove cycle --> last.next = null
        prev.next = null;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(4);
        // ll.addLast(5);
        // ll.add(2,3);
        // ll.print();
        //System.out.println(ll.size);
        // ll.removeFirst();
        // ll.print();
        // ll.removeLast();
        // ll.print();
        //System.out.println(ll.size);

        //System.out.println(ll.itrSearch(3));
        //System.out.println(ll.recSearch(3));

        //ll.reverse();
        // ll.deleteNthfromEnd(3);
        // ll.print();

        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(2);
        // ll.addLast(1);
        // ll.print();
        // System.out.println(ll.checkPalindrome());

        // head = new Node(1);
        // head.next = new Node(2);
        // head.next.next = new Node(3);
        // head.next.next.next = head;
        // // 1 --> 2 --> 3 --> 1
        // System.out.println(isCycle());


        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        // 1 --> 2 --> 3 --> 2
        System.out.println(isCycle());
        removeCycle();
        ll.print();
        System.out.println(isCycle());
    }
}
