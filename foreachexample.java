//                            concept foreach loop
/*
foreach loop in java--does not maintain..loop intialization , condition & incrementation
/decrementation

*/
//Q->print all elemets of numeric array by using foreach loop
//Q->printe all elements of string array by using foreach loop

class foreachexample
{
         public static void main(String args[])
         { 
                      //Type 1
                      /*
                     int ar[] = {10,20,30,40,50,60,7,8,90};
                     for(int var : ar)
                     {
                     
                                   System.out.println(var);
                     }
                     */
                     //Type 2
                     String days[]={"sun","Mon","Tue","Wed","Thur","Fri","Sat"};
                     for(String var : days)
                     {
                                     
                                    System.out.println(var);
                     }
         }

}
