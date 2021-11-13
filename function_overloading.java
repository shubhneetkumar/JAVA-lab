//Function Overloading
class function_overloading
{
             void Btech()
             {
                       System.out.println("Btech from CS");
             }
             void Btech(int x)
             {
                       System.out.println("Btech from ME");
             }
             void Btech(int a,int b)
             {
                       System.out.println("Btech from EC");
             }
             public static void main(String args[])
             {
                        function_overloading con=new function_overloading();
                        con.Btech(2501);
                        con.Btech();
                        con.Btech(254,668);
             }
}