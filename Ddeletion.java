public class Ddeletion {
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
    public void insertAtBeg(int x){
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
    public void DdeleteAtBeg(){
        if(head==null)
            return;
        else{
            head=head.next;
            head.prev=null;
        }
    }
    public static void main(String args[]){
        Ddeletion obj=new Ddeletion();
        obj.insertAtBeg(10);
        obj.insertAtBeg(20);
        obj.insertAtBeg(30);
        obj.DdeleteAtBeg();
    }
}

    

