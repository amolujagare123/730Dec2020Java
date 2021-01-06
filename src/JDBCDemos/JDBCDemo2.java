package JDBCDemos;

import java.sql.*;

public class JDBCDemo2 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // 1. loading a driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2. creating a connection
        String url = "jdbc:mysql://localhost:3306/730batch";
        String user = "root";
        String pass = "root";

        Connection con = DriverManager.getConnection(url,user,pass);

        // 3. creating a statement

        Statement st = con.createStatement();

        // 4. execute query
        // select
        // -> DDL - data definition language

        String sql = "select * from student where marks=77";

         ResultSet rs =  st.executeQuery(sql);

         while(rs.next())
         {
             System.out.print(rs.getInt("rno")+" ");
             System.out.print(rs.getString("name")+" ");
             System.out.print(rs.getString("branch")+" ");
             System.out.println(rs.getInt("marks"));
         }





    }
}
