import java.io.*;
import java.util.*;

public class deleteatbeg {
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
    public void deleteatBeg(){
        if(head==null)
            return;
        else{
            head=head.next;
            
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
        deleteatbeg obj=new deleteatbeg();
        Scanner sc=new Scanner(System.in);
     
        int n=sc.nextInt();
        for(int i=0; i<n; i++){
            int x=sc.nextInt();
            obj.insertAtEnd(x);
            
        }
        obj.deleteatBeg();
        obj.display();
    
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}