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
class Preorder
{
    Node root;
    Preorder()
    {
        root=null;
    }
  void preorder_traversal(Node current_Node)
    {
        if(current_Node==null)
        {
            return;
        }
         System.out.print(current_Node.data+" ");
        preorder_traversal(current_Node.left);
        preorder_traversal(current_Node.right);
    }
    public void display()
    {
        preorder_traversal(root);
    }
    public static void main(String args[])
    {
        Preorder p= new Preorder();
        p.root= new Node(1);
        p.root.left= new Node(2);
        p.root.right=new Node(3);
        p.root.left.left= new Node(4);
        p.root.left.right= new Node(5);
        p.root.right.left=new Node(6);
        p.root.right.right=new Node(7);
        System.out.println("Preorder Traversal:");
        p.display();
        
    }
}