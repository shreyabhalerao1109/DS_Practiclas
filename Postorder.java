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
class Postorder
{
    Node root;
    Postorder()
    {
        root=null;
    }
    void postorder_traversal(Node current_node)
    {
     if(current_node==null)
     {
         return;

     }
     postorder_traversal(current_node.left);
     postorder_traversal(current_node.right);
     System.out.print(current_node.data +" ");
     
    }
public void display()
{
    postorder_traversal(root);
}
public static void main(String args[])
{
    Postorder p = new Postorder();
    p.root=new Node(1);
    p.root.left=new Node(2);
    p.root.right=new Node(3);
    p.root.left.left=new Node(4);
    p.root.left.right=new Node(5);
    p.root.right.left=new Node(6);
    p.root.right.right=new Node(7);
    System.out.println("Postorder Traversal:");
    p.display();
}
    
}