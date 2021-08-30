//Q print & sum all elements off array which input by command line argument 
//with using while loop
//along with length variable

class while_loop
{
                  public static void main(String args[])
                  {
                              int size=args.length , sum =0 , i=0;
                              System.out.println("No of elements in array :"+size);
                              while(i<size)
                              {
                                        int var1=Integer.parseInt(args[i]);
                                        System.out.println(args[i]);
                                        sum=sum+var1;
                                        i++;
                              }

                              System.out.println("------SUM OF ELEMENTS--------");

                              System.out.println(sum);
                  }
}
            
                            