import java.util.*;
public class insertatEnd {  
      
    
    class Node{  
        int data;  
        Node next;  
          
        public Node(int data) {  
            this.data = data;
        }  
    }  
   
 
    public Node head = null;  
    public Node tail = null;  
    public void addNode(int data) {  
          
        Node n = new Node(data);  
          
      
        if(head == null) {  
              
            head = n;  
            tail = n;  
        }  
        else {  
              
            tail.next = n;  
              
            tail = n;  
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
          
        insertatEnd obj = new insertatEnd();  
          
        Scanner sc=new Scanner(System.in);
     
          int n=sc.nextInt();
           for(int i=0; i<n; i++){
               int x=sc.nextInt();
               obj.addNode(x);
            
        }
        obj.display();
  
    }  
}  
