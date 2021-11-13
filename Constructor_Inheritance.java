class Amity
{
         Amity()
         {
     		System.out.println("Amity..non para cons...base");
         }
}

class Constructor_Inheritance extends Amity
{   
           Constructor_Inheritance ()
           {
	        System.out.println("GLA...non para cons derived");
           }
           public static void main(String args[])
	   {
 			
           Constructor_Inheritance obj=new Constructor_Inheritance ();
	   }

}
