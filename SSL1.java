import java.io.*;
public class SSL1{
class Node{
    int data;
    Node next;
    public Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
public Node head=null;
public void addfirst(int data)
{
   Node newNode= new Node(data);
   
   if(head==null){
    head=newNode;
    return;
   }
   
   
   newNode.next=head;
   head=newNode;

}
public void display()
{
    Node current=head;
    if(head==null)
    {
        System.out.println("Linked list empty");
    }
    while(current!=null)
    System.out.println(current.data+"");
    current=current.next;


}
public static void main(String args[])
{
    SSL1 s=new SSL1();
    s.addfirst(1);
    s.addfirst(2);
    s.addfirst(3);
    s.display();

}
}

