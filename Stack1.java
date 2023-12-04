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
class Stack1
{
    Node top;
    Stack1()
    {
        this.top=null;
    }
    public boolean isEmpty()
    {
        return top==null;
    }
    public void push(int data)
    {
        Node temp = new Node(data);
        temp.next=top;
        top=temp;

    }
    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stcak is Empty");
        }
        int popitem=top.data;
        top=top.next;
        return popitem;
    }
    public void display()
    {
        Node current=top;
        if(isEmpty())
        {
            System.out.println("sttack is empty");
            return;
        }
        while(current!=null)
        {
        System.out.println(current.data+"");
        current=current.next;
        }
    }

public static void main(String args[])
{
    Stack1 s=new Stack1();
    s.push(1);
    s.push(2);
    s.push(3);
    s.pop();
    s.display();
}
}