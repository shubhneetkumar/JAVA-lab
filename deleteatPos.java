import java.io.*;
import java.util.*;

public class deleteatPos {
class Node
{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
    Node head;
        public void insertAtEnd(int data){
        Node n=new Node(data);
        if(head==null)
        {
            head=n;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=n;
        }
    }
         public int countNodes() {  
        int count = 0;  
        Node temp = head;  
          
        while(temp!= null) {
            
         
           
                count++;  
           
            temp = temp.next;

            
            }  
            return count;  
    } 
    public void deleteAtPos(int pos){
        
        if(head==null)
            return;
        else{
            if(pos==1){
                head=head.next;
            }
            else if(pos>countNodes())
                System.out.println("Invalid position");
            else{
                Node temp=head;
                int c=1;
                while(temp!=null)
                {
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
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        
    }

    public static void main(String[] args) {       
        deleteatPos obj=new deleteatPos();
        Scanner sc=new Scanner(System.in);
     
        int n=sc.nextInt();
        
        for(int i=0; i<n; i++){
            int x=sc.nextInt();
            obj.insertAtEnd(x);
            
        }
        int pos=sc.nextInt();
        obj.deleteAtPos(pos);
        obj.print();
    
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}