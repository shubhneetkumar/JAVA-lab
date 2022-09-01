import java.util.*;
class bubblesort{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int num=sc.nextInt();
        int a[];
        
        a=new int[num];
        System.out.println("Enter the elments in array");
        for(int i=0;i<num;i++){
            a[i]=sc.nextInt();
            
        }
        int temp;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted Elments");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
    }
}