
public class doublilinklist 
{
    class Node{
            Node prev;
            int data;
            Node next;
            Node(int data){
                this.data=data;
            }
    }
    Node head;
    Node tail;
    public void dinsertAtBeg(int x){
        Node n=new Node(x);
        if(head==null){
            head=n;
            tail=n;
        }
        else{
            n.next=head;
            head.prev=n;
            head=n;
        }
        
    }
    public void dinsertAtEnd(int x){
        Node n=new Node(x);
        if(head==null){
            head=n;
            tail=n;
        }
        else{
            
            n.prev=tail;
               tail.next=n;
            tail=n;
        }
    }   
    public int count(){
        Node temp=head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        return c;
    }
public void dinsertAtpos(int x, int pos){
    Node n = new Node(x);
    if(head==null){
        if(pos!=1)
            System.out.println("Invalid position");
        else{
            head=n;
            tail=n;
        }
    }
    else
    {
        if(pos==1)
        {
        n.next=head;
        head.prev=n;
        head=n;
    }
        if(pos>count()+1)
            System.out.println("Invalid position");
        else{
            Node temp=head;
            int c=1;
            while(temp.next!=null){
                if(pos-1==c)
                    break;
                c++;
                temp=temp.next;
            }
            n.prev=temp;
            n.next=temp.next;
        if(count()+1==pos)
        {
            temp.next=n;
            tail=n;
        }
        else{
            temp.next.prev=n;
            temp.next=n;
        }
    }
    }
}
    public static void main(String args[]){
        doublilinklist obj=new doublilinklist();
        obj.dinsertAtBeg(10);
        obj.dinsertAtBeg(20);
        obj.dinsertAtBeg(30);
        obj.dinsertAtEnd(40);
        obj.dinsertAtpos(40,3);
    }
}
