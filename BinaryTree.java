import java.util.Scanner;

class Node{
    int data;
    Node left;
    Node right;
    public Node(int data)
    {
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class BinaryTree{
    Node root;
    BinaryTree()
    {
        System.out.println("Enter Root no");
        Scanner sc = new Scanner(System.in);
        root=createtree(sc);
    }
    Node createtree(Scanner sc)
    {
        int data=sc.nextInt();
        if(data == -1)
        {
            return null;
        }
        Node n = new Node(data);
        System.out.println("Enter left child");
        n.left=createtree(sc);
        System.out.println("Enter right tree");
        n.right=createtree(sc);
        return n;
    }
    void display()
    {
        inorder_traversal(root);
    }
    void inorder_traversal(Node root)
    {
        if(root!=null)
        {
        
        inorder_traversal(root.left);
        System.out.print(root.data+"");
        inorder_traversal(root.right);
    }
    }
    public static void main(String args[])
    {
        BinaryTree b = new BinaryTree();
        b.display();
    }


}