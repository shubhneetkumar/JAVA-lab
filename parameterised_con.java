class Amity
{
         Amity()
         {
     		System.out.println("Amity..non para cons...base");
         }

         Amity(int a)
         {
     		System.out.println("Amity..Single Para cons...base");
         }
         Amity(int x,int y)
         {
     		System.out.println("Amity..Double Para cons...base");
         }
}

class parameterised_con extends Amity
{   
           parameterised_con ()
           {
	        System.out.println("GLA...non para cons derived");
           }
           parameterised_con (int z)
           {
		super(z,z);
	        System.out.println("GLA...SinglePara cons derived");
                
           }
           public static void main(String args[])
	   {
 			
           parameterised_con obj=new parameterised_con (10);
	   }

}