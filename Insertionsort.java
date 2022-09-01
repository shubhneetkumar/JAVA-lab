import java.util.*;
public class Insertionsort {
    public static void main(String srgs[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array length");
        int n=sc.nextInt();
        System.out.println("Enter the elments in array");
        int ar[] = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        
        for(int i=1;i<ar.length;i++){
            int key=ar[i];
            int j=i-1;
            while(j>=0 && ar[j]>key){
                ar[j+1]=ar[j];
                j--;
            }
            ar[j+1]=key;
        }
        System.out.println("Sorted array");
        for(int i=0;i<ar.length;i++){
            System.out.println(ar[i]+" ");
        }
    }
    
}
