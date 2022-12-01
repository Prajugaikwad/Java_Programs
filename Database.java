import java.sql.*;
class Database
{
    public static void main(String arg[])throws Exception
    {
        String URL = "jdbc:mysql://localhost:3306/Marvellous";
        String Username = "root";
        String Password = "root";
        String Query = "Select * from student";

        Connection cobj = DriverManager.getConnection(URL,Username,Password);
        Statement sobj = cobj.createStatement();
        ResultSet robj = sobj.executeQuery(Query);

        while(robj.next()) 
        {
          System.out.println("RollNo :"+robj.getInt("RollNo"));
          System.out.println("Name :"+robj.getString("Name"));
          System.out.println("Address :"+robj.getString("Address"));
          System.out.println("Marks :"+robj.getInt("Marks"));
       }

    }
}