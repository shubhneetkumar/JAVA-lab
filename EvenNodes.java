import java.util.*;
public class EvenNodes {  
      
    class Node{  
        int data;  
        Node next;  
          
        public Node(int data) {  
            this.data = data;  
            this.next = null;  
        }  
    }  
 

    public Node head = null;  
    public Node tail = null;  
      

    public void addNode(int data) {  

        Node newNode = new Node(data);  
          

        if(head == null) {  

            head = newNode;  
            tail = newNode;  
        }  
        else {  

            tail.next = newNode;  

            tail = newNode;  
        }  
    }  
      
     

    public int countNodes() {  
        int count = 0;  
        Node temp = head;  
          
        while(temp!= null) {
            
            if(temp.data%2==0)
            { 
                count++;  
            }
            temp = temp.next;

            
            }  
            return count;  
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
          
        EvenNodes sList = new EvenNodes();  
          
        Scanner sc=new Scanner(System.in);
     
          int n=sc.nextInt();
           for(int i=0; i<n; i++){
               int x=sc.nextInt();
               sList.addNode(x);
            
        }
        System.out.println(sList.countNodes());
  
    }  
}  