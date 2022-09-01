// Name Shubhneet Kumar
// roll no. 201500685

import java.util.*;
 class Binarysearch {
    public static void main(String args[]){
        int num,item,ar[],First,last,middle;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements");
        num=sc.nextInt();
        ar=new int[num];
        for(int i=0;i<num;i++){
            ar[i]=sc.nextInt();
        }
        System.out.println("Enter the value");
        item=sc.nextInt();
        First=0;
        last=num-1;
        middle=(First+last)/2;
        while(First<=last){
            if(ar[middle]<item)
                First=middle+1;
            else if(ar[middle]==item){
            System.out.println("Item Found"+(middle+1));
            break;
        }
            else{
                last=middle-1;
            }
            middle=(First+last)/2;
            
                    
                
            
        }
        if(First>last){
            System.out.println(item+"Not found");
        }
    }
    
}
// Time complexity =log n