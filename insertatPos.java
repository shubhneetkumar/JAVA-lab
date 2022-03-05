import java.io.*;
import java.util.*;

public class insertatPos {
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
    public void insertAtPos(int x, int pos){
        Node n=new Node(x);
       if(head==null){
           if(pos!=1)
               System.out.println("Invalid Position");
           else
               head=n;
       }
       else{
           if(pos==1){
               n.next=head;
               head=n;
           }
           
           else if(pos>countNodes()+1)
               System.out.println("Invalid Position");
           else{
               Node temp = head;
               int c =1;
               while(temp!=null){
                   if(pos-1==c){
                       break;
                   }
               
                c++;
                temp=temp.next;
                }
            n.next = temp.next;
            temp.next=n;
           }
           
       }
    }
 
    public void display() {  
        Node temp = head;  
        if(head == null) { 
            return;  
        }  
 
        while(temp != null) {   
            System.out.print(temp.data+" ");  
            temp = temp.next;  
        }   
    }
    public static void main(String[] args) {       
        insertatPos obj=new insertatPos();
        Scanner sc=new Scanner(System.in);
     
        int n=sc.nextInt();
        
        for(int i=0; i<n; i++){
            int x=sc.nextInt();
            obj.insertAtEnd(x);
            
        }
        int d=sc.nextInt();
        int pos=sc.nextInt();
        obj.insertAtPos(d,pos);
        obj.display();
    
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}