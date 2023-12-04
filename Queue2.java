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
class Queue2
{
    private Node tail=null;
    private Node front=null;
    private int count=0;

    public void Enqueue(int data)
    {
        Node temp=new Node(data);
        if(front==null)
        {
            front=temp;
            tail=temp;
        }else
        {
            tail.next=temp;
            temp=tail;
        }
        count+=1;
        
    }
    public void dequeue()
    {
        if(front==null)
        {
            System.out.println("Underflow condition");
            System.exit(-1);
        }
        Node temp=front;
        front=front.next;
        if(front==null)
        {
            tail=null;
        }
        count-=1;
         
    }
    public int peek()
    {
        if(front==null)
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
            System.out.println(current.data+" ");
        }
        current=current.next;
    }
    public static void main(String args[])
    {
        Queue2 s= new Queue2();
        s.Enqueue(1);
        s.Enqueue(2);
        s.Enqueue(3);
        s.dequeue();
        s.peek();
        s.display();
    }
}