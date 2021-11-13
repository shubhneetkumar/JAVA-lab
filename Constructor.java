class Constructor
{ 
           void Btech()
           { 
                       System.out.println("Bachelor of tech..");
           }
           void BCA()
           {
                      System.out.println("Bachelor of comp app....");
           }
           void BBA()
           {
                      System.out.println("Bachelor of Buss admin....");
           }
           public static void main(String args[])
           {
                       Constructor con = new Constructor();
                       con.Btech();
                       con.Btech();
                       
                       Constructor SHUBHNEET = new Constructor();
                       SHUBHNEET.BCA();
           }
}
// AN object represents abstraction
//An class represents encapsulation