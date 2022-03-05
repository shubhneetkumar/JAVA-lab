
public class Cdeletion {
    class Node{
        int data;
        Node next;
        
    }
    Node head;
    public void cinsertAtBeg(int x){
        Node n=new Node();
        n.data=x;
       
        if(head==null){
            head=n;
            n.next=n;
        }
        else{
            n.next=head;
             Node temp = head;
            while(temp.next!=head){
                temp=temp.next;
            }
            temp.next=n;
            head=n;
        }
    }
    public void cdeleteAtBeg(){
        if(head==null){
            return;
        }
        else{
            Node temp=head.next;
            while(temp.next!=head){
                temp=temp.next;
                
            }
            temp.next=head.next;
            head=head.next;
        }
        
    }
    public void cdeleteAtEnd(){
        if(head==null){
            return;
        }
        else{
            if(head.next==head)
                head=null;
            else{
            Node temp=head;
            while(temp.next.next!=head){
                temp=temp.next;
            }
            temp.next=head;
            }
        }
    }
    public int count(){
        int c=1;
        Node temp=head;
        while(temp.next!=head){
            c++;
            temp=temp.next;
        }
        return c;
    }
    public void cdeleteAtPos(int pos)
    {
        if(head==null)
            return;
        else{
            if(pos==1){
                Node temp=head;
                while(temp.next!=head)
                    temp=temp.next;
                temp.next=head.next;
                head=head.next;
            }
            else if(pos>count())
                System.out.println("Position is invalid");
            else{Node temp=head;
            int c=1;
            while(temp.next!=head){
                if(pos-1==c)
                    break;
                c++;
                temp=temp.next;
            }
    temp.next=temp.next.next;
            }
        }
    }
           public void print(){
        Node temp=head;
        while(temp.next!=head){
            System.out.print(temp.data+" ");
             temp=temp.next;
        }
       
    }
    public static void main(String args[]){
        Cdeletion obj=new Cdeletion();
        obj.cinsertAtBeg(30);
        obj.cinsertAtBeg(40);
        obj.cinsertAtBeg(50);
        obj.cdeleteAtBeg();
        obj.cdeleteAtEnd();
        obj.cdeleteAtPos(3);
        obj.print();
    }
}
