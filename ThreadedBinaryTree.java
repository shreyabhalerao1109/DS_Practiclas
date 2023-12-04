class Node {
    int data;
    Node left, right;
    boolean leftThread, rightThread;

    public Node(int data) {
        this.data = data;
        left = right = null;
        leftThread = rightThread = true;
    }
}

public class ThreadedBinaryTree {
    private static Node leftMost(Node node) {
        if (node == null)
            return null;

        while (node.left != null)
            node = node.left;

        return node;
    }
    public static void inorder(Node root) {
        Node curr = leftMost(root);

        while (curr != null) {
            System.out.println(curr.data);

            if (curr.rightThread)
                curr = curr.right;
            else
                curr = leftMost(curr.right);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(6);
        root.left = new Node(3);
        root.right = new Node(8);
        root.left.left = new Node(1);
        root.left.right = new Node(5);
        root.right.left = new Node(7);
        root.right.right = new Node(11);
         root.right.left = new Node(9);
         root.right.right = new Node(13);


    
        root.leftThread = true;
        root.left.right = root;
        root.left.rightThread = true;
        root.rightThread = true;


        inorder(root);
    }
}
