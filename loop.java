//Q print 5 elements of array which inout by command line argument with using for loop
//Q print all elements of array which input by command line argument with using for loop
// along with length variable

//length-->it is predefined variable in JAVA--its use for find the no. of elements in array

class loop
{
              public static void main(String args[])
              {

                           int size=args.length;
                           System.out.println("No of elements in array:"+size);
               
                           for(int i=0;i<size;i++)
                           {
                                       System.out.println(args[i]);
                           }
              }
}