import java.util.*;
public class Ssort {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int num=sc.nextInt();
        int ar[];
        ar=new int[num];
        System.out.println("Enter the Elments in array");
        for(int i=0;i<num;i++){
            ar[i]=sc.nextInt();
        }
        for(int i=0;i<ar.length-1;i++){
            int min=i;
            for(int j=i+1;j<ar.length;j++){
                if(ar[j]<ar[min])
                    min=j;
                
            }
            int t=ar[min];
            ar[min]=ar[i];
            ar[i]=t;
            
        }
        System.out.println("Sorted array");
        for(int i=0;i<ar.length;i++){
            System.out.println(ar[i]+" ");
        }
        
    }
    
}
