import java.io.*;
import java.util.*;

public class insertatBeg{
class Node
{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
    Node head;
    public void insertAtBeg(int data){
        Node n=new Node(data);
        n.next=head;
        head=n;
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
        insertatBeg obj=new insertatBeg();
        Scanner sc=new Scanner(System.in);
     
          int n=sc.nextInt();
           for(int i=0; i<n; i++){
               int x=sc.nextInt();
               obj.insertAtBeg(x);
            
        }
        obj.display();

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}