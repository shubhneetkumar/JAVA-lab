public class stackUsingLinklist {
    class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
    
}
    Node top;
    boolean isEmpty(){
        if(top==null){
            return true;
        }
        else
            return false;
    }
    public void push(int data){
        Node n=new Node(data);
        n.next=top;
        top=n;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("stack is Underflow");
            return -1;
        }
        else{
            int x=top.data;
            top=top.next;
            return x;
        }
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is Underflow");
            return -1;
        }
        else{
            int x=top.data;
            return x;
        }
    }
    public static void main(String args[]){
        stackUsingLinklist obj= new stackUsingLinklist();
        System.out.println(obj.pop());
        obj.push(10);
        obj.push(20);
        System.out.println(obj.pop());
        obj.push(30);
         System.out.println(obj.peek());
        obj.push(40);
    }
}
