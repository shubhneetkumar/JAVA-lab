public class stack {
    static int max=1000;
    static int ar[]=new int[max];
    int top;
    stack(){
        top=-1;
        
    }
    boolean isEmpty(){
        if(top==-1){
            return true;
        }
        else
            return false;
    }
    boolean isfull(){
        if(top>=(max-1))
            return true;
        else
            return false;
    }
    public void push(int x){
        if(isfull())
            System.out.println("Stack Overflow");
        else{
            top++;
            ar[top]=x;
        }
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
        else{
            int x=ar[top];
            top--;
            return x;
        }
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
        else{
            int x=ar[top];
            return x;
            
        }
    }
    public static void main(String args[]){
        stack s=new stack();
        System.out.println(s.pop());
        s.push(10);
        s.push(20);
        System.out.println(s.pop());
        s.push(30);
        System.out.println(s.peek());
        
        s.push(40);
        
    }
    
}
