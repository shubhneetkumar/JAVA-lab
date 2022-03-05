import java.io.*;
import java.util.*;

public class deleteatEnd {
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
     public void deleteatEnd()
    {
        if(head==null)
            return;
        else{
            if(head.next==null)
                head=null;
            else{
            Node temp=head;
            while(temp.next.next!=null)
            {
                temp=temp.next;
            }
            temp.next=null;
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
        deleteatEnd obj=new deleteatEnd();
        Scanner sc=new Scanner(System.in);
     
        int n=sc.nextInt();
        for(int i=0; i<n; i++){
            int x=sc.nextInt();
            obj.insertAtEnd(x);
            
        }
        obj.deleteatEnd();
        obj.print();
    
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}