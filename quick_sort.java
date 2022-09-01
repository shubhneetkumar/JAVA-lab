import java.util.*;
public class quick_sort {
    static int partition(int arr[],int l,int r){
        int i=(l-1);
        for(int j=l;j<r;j++){
            if(arr[j]<arr[r]){
                i++;
                int t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[r];
        arr[r]=temp;
        return(i+1);
    }
    static void quicksort(int arr[],int l,int r){
        if(l<r){
            int p=partition(arr,l,r);
            quicksort(arr,l,p-1);
            quicksort(arr,p+1,r);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        quicksort(ar,0,n-1);
        
        System.out.println("Sorted Array");
        for(int i=0;i<n;i++){
            System.out.println(ar[i] +" ");
            
            System.out.println();
        }
        
        
        
    }
    
}
