class Node
{
    int data;
    Node left;
    Node right;

    public Node(int x)
    {
        data=x;
        left=null;
        right=null;
    }
}
class inorder
{
Node root;
inorder()
 {
    root=null;
 }
 void inorder_traversal(Node current_Node)
  {

    if(current_Node == null)
    {
    return;
    }
    
    inorder_traversal(current_Node.left);
    System .out.print(current_Node.data+" ");
    inorder_traversal(current_Node.right);
  }
public void display()
{
    inorder_traversal(root);
}
public static void main(String args[])
{
    inorder i= new inorder();
    i.root = new Node(1);
    i.root.left = new Node(2);
    i.root.right = new Node(3);
    i.root.left.left = new Node(4);
    i.root.left.right = new Node(5);
    i.root.right.right = new Node(6);
    i.root.right.left = new Node(7);
    System.out.println("Inorder Traversal:");
    i.display();
    }
}