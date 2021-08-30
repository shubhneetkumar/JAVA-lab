//Q print & sum all elements off array which input by command line argument 
//with using for loop
//along with length variable

class sum_of_array
{
                  public static void main(String args[])
                  {
                              int size=args.length , sum =0;
                              System.out.println("No of elements in array :"+size);
                              for(int i=0;i<size;i++)
                              {
                                        int var1=Integer.parseInt(args[i]);
                                        System.out.println(args[i]);
                                        sum=sum+var1;
                              }

                              System.out.println("------SUM OF ELEMENTS--------");

                              System.out.println(sum);
                  }
}