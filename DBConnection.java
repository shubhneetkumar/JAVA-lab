import java.sql.*;
public class DBConnection 
{
    Connection con;
    DBConnection()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
             
            String connectionURL="jdbc:mysql://localhost:3306/library";
            con=DriverManager.getConnection(connectionURL,"root","root");
            System.out.println("Connection Success");
        }
        catch(Exception e)
        {
            System.out.println("Connection failed..."+e);
        }
    }
    public static void main(String args[])
    {
        DBConnection obj = new DBConnection();
    }
}
