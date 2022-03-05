import java.util.*;
import java.sql.*;

public class Operation extends DBConnection
{
    void insert()
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter student id");
            int id=sc.nextInt();
            
            System.out.println("Enter student name");
            String name=sc.next();
            
            System.out.println("Enter student age");
            int age=sc.nextInt();
            
            System.out.println("Enter student course");
            String course=sc.next();
            
            String insertquery="insert into student values(?,?,?,?);";
            
            PreparedStatement pst=con.prepareStatement(insertquery);
            
            pst.setInt(1,id);
            pst.setString(2,name);
            pst.setInt(3,age);
            pst.setString(4,course);
            
            pst.executeUpdate();
            System.out.println("DAta insertedd");
            
        }
        catch(Exception e)
        {
            System.out.println("Data not inserted");
        }
    }
    void delete()
    {
        try
        {
            //int id=03;
            //String delquery="delete from student where sid="+id;
            
            String course="MCA";
            String delquery="delete from student where scourse='"+course+"'";
            PreparedStatement pst2=con.prepareStatement(delquery);
            
            pst2.executeUpdate();
            System.out.println("data deletedd.....");
        }
        catch(Exception e)
        {
            System.out.println("data not deletedd.."+e);
        }
    }
    void view()
    {
        try
        {
            String viewquery="Select *from student";
            
            Statement stmt = con.createStatement();
            
            ResultSet rs=stmt.executeQuery(viewquery);
            
            while(rs.next())
            {
                        System.out.print(" "+rs.getInt(1));
                        System.out.print(" "+rs.getString(2));
                        System.out.print(" "+rs.getInt(3));
                        System.out.print(" "+rs.getString(4));
                        System.out.print("\n");
            }
            System.out.println("view function Working");
        }
        catch(Exception e)
        {
            System.out.println("");
        }
    }
    void update()
    {
        try
        {
            String course="Diploma";
            String updatequery="update student set scourse='MCA' where sid=3";
            PreparedStatement pst2=con.prepareStatement(updatequery);
            
            pst2.executeUpdate();
            System.out.println("update function Working");
        }
        catch(Exception e)
        {
            System.out.println("Not working");
        }
    }
    public static void main(String args[])
    {
        Operation obj=new Operation();
        while(true)
        {
            System.out.println("\nPress 1 for insert");
            System.out.println("Press 2 for delete");
            System.out.println("Press 3 for view");
            System.out.println("Press 4 for update");
            System.out.println("Press 5 for Exit");
            
            System.out.println("Enter ur choice");
            Scanner sc3=new Scanner(System.in);
            int choice=sc3.nextInt();
            
            switch(choice)
            {
                case 1:
                    obj.insert();
                    break;
                case 2:
                    obj.delete();
                    break;
                case 3:
                    obj.view();
                    break;
                case 4:
                    obj.update();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice");
                    
            }
        }
    }
     
}
