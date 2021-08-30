class loop2
{
              public static void main(String args[])
              {
                          int sum=0;
                          for(int i=0;i<5;i++)
                          {
                                      System.out.println(args[i]);
                                      int d=Integer.parseInt(args[i]);
                                      sum=sum+d;
                           }
                           System.out.println("Toatal :"+sum);
                }
}