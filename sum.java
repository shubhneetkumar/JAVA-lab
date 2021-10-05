//Q->print & sum all elemnts of numeric array by using foreach loop

class sum
{
                        public static void main(String args[])
                        {
                                    int ar[] = {10,20,30,40,50,60};
                                    int sum=0;
      
                                    for(int var : ar)
                                    {
                                                 System.out.println(var);
                                                 sum=sum+var;
                                    }
                                    System.out.println("Total :"+sum);
                         }
}