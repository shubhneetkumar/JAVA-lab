public class queue {
static int front,rear,cap;
int arr[];
queue(int c){
    front=0;
    rear=0;
    cap=c;
    arr=new int[cap];
}
boolean isEmpty(){
    if(front==rear){
        return true;
    }
    else{
        return false;
    }
}
boolean isfull(){
    if(rear==cap){
        return true;
    }
    else{
        return false;
    }
}
public void enqueue(int data){
    if(isfull()){
        System.out.println("Queue is Full");
    }
    else{
        arr[rear]=data;
        rear++;
    }
}
public int dequeue(){
    if(isEmpty()){
        System.out.println("Queue is Empty");
        return -1;
    }
    else{
        int x=arr[front];
        for(int i=0;i<rear-1;i++){
            arr[i]=arr[i+1];
        }
        arr[rear-1]=0;
        rear--;
        return x;
    }
}
public int front(){
    if(isEmpty()){
        System.out.println("Queue is Empty");
        return -1;
    }
    else{
        return arr[front];
    }
}
public int rear(){
    if(isEmpty()){
        System.out.println("Queue is Empty");
        return -1;
        
    }
    else{
        return arr[rear-1];
    }
}
public static void main(String args[]){
    
    
}
}

