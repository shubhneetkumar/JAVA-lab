//Q find the highest nos input three nos by command line argument

class highestno
{
                public static void main(String args[])
                {
                            int var1=Integer.parseInt(args[0]); 
                            int var2=Integer.parseInt(args[1]); 
                            int var3=Integer.parseInt(args[2]); 
                            
                            int temp , highest;
                            temp=var1>var2?var1:var2;
                            highest=var3>temp?var3:temp;

                            System.out.println("The highest no is "+highest);
                }
}