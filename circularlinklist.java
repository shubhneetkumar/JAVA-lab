public class circularlinklist 
{
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
        Node temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        n.next=head;
        temp.next=n;
        head=n;
    }
    }
    public void cinsertatEnd(int x){
        Node n=new Node();
      
        n.data=x;
        if(head==null){
            head=n;
            n.next=n;
        }
        else{
        Node temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        temp.next=n;
        n.next=head;
        }
    }
    public int count(){
        Node temp=head;
        int c=1;
        while(temp.next!=head){
            c++;
            temp=temp.next;
        }
        return c;
        
        
    }
    public void cinserAtPos(int x,int pos){
        Node n=new Node();
        n.data=x;
        if(head==null){
            if(pos!=1)
            {
                System.out.println("Invalid Position");
            }
            else{
                head=n;
                head.next=n;
            }
        }
        else{
            if(pos==1){
                 Node temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        n.next=head;
        temp.next=n;
        head=n;
                
            }
           else if(pos>count()+1){
                System.out.println("Invalid Position");
            }
            else{
                Node temp=head;
                int c=1;
                        while(temp.next!=head){
                            if(pos-1==c){
                                break;
                            }
                            c++;
                            temp=temp.next;
                        }
                        n.next=temp.next;
                        temp.next=n;
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

    public static void main(String arga[]){
        circularlinklist obj=new circularlinklist();
        
        obj.cinsertAtBeg(10);
        obj.cinsertAtBeg(20);
        obj.cinsertAtBeg(30);
        obj.cinsertatEnd(50);
        obj.cinserAtPos(40,3);
        
        obj.print();
    }
     
    
    
}
