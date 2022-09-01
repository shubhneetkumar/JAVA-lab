import java.util.*;
public class MergeSort {
    static void merge(int arr[],int l, int r,int m){
        int n1=m-l+1;
        int n2=r-m;
        
        int l1[]=new int[n1];
        int r2[]=new int[n2];
        
        for(int i=0;i<n1;i++){
            l1[i]=arr[l+i];
        }
        for(int j=0;j<n2;j++){
            r2[j]=arr[m+1+j];
        }
        int i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(l1[i]<r2[j]){
                arr[k]=l1[i];
                i++;
            }
            else{
                arr[k]=r2[j];
                j++;
            }
                k++;
        }    
            
            while(i<n1){
                arr[k]=l1[i];
                k++;
                i++;
            }
            while(j<n2){
                arr[k]=r2[j];
                k++;
                j++;
            }
        
    }
    static void mergesort(int arr[],int l,int r){
            if(l<r){
                int m=l+(r-l)/2;
                mergesort(arr,l,m);
                mergesort(arr,m+1,r);
                merge(arr,l,r,m);
            }
        }
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        mergesort(arr,0,n-1);
        
        System.out.println("Sorted Array");
        for(int i=0;i<n;i++){
            System.out.println(arr[i] +" ");
            
            System.out.println();
        }
    }

    
}
