//Q-> How many no of elements in numeric array without using "length" variable

class foreachexample2
{
                    public static void main(String args[])
                    {
                                 int ar[]={10,20,30,40,50,60};
                                 int count=0;
                                 
                                 for(int var : ar)
                                 {
                                             System.out.println(var);
                                             count++;
                                 }
                                 System.out.println("No of elements :"+count);
                    }
}