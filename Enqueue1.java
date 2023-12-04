class Node
{
    int data;
    Node next;
    public Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class Enqueue1
{
    private Node tail=null;
    private Node front=null;
    private int count=0;

    public void enqu(int data)
    {
        Node temp=new Node(data);
        if(front==null)
        {
            front = temp;
            tail = temp;
        }else{
            tail.next=temp;
            tail=temp;
        }
        count+=1;
    }
    public int dequeue()
    {
        if(front==null)
        {
            System.out.println("underflow condition");
            System.exit(-1);
        }
            Node temp=front;
            front=front.next;
            if(front==null)
            {
                tail=null;
            }
            count-=1;
            return temp.data;
        
    }
    public int peek()
    {
        if(front ==null)
        {
            System.exit(-1);
        }
        return front.data;
    }
    public void display()
    {
        Node current=front;
        while(current!=null)
        {
            System.out.println(current.data+"");
            current=current.next;
        }
    }
    public static void main(String args[])
    {
        Enqueue1 e=new Enqueue1();
        e.enqu(1);
        e.enqu(2);
        e.enqu(3);
        e.dequeue();
        e.peek();
        e.display();
    }

}