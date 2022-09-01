import java.util.*;
class RBinary {
    public static int Brecursi(int ar[],int first,int last,int key){
        if(last>=first){
            int mid=(first+last)/2;
            if(ar[mid]==key){
                return mid;
            }
            if(ar[mid]>key){
                return Brecursi(ar,first,mid-1,key);
            }
            else{
                return Brecursi(ar,mid+1,last,key);
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int ar[];
        System.out.println("Enter the elements in array");
        ar=new int[num];
        for(int i=0;i<num;i++){
            ar[i]=sc.nextInt();
        }
        System.out.println("Enter the value");
        int key=sc.nextInt();
        int last=ar.length-1;
        int result=Brecursi(ar,0,last,key);
        if(result==-1){
            System.out.println("Not Found");
        }
        else{
            System.out.println("Found"+result);
        }

        
    }
}