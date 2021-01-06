package JDBCDemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo1 {

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
        // insert / update or delete
        // -> DML - data manupulation language

       // String sql = "insert into student values(7,'vaishali','IT',89)";

      // String sql = "update student set branch='Comp',marks=50 where rno=7";

        String sql = "delete from student where rno=5";

        st.executeUpdate(sql);





    }
}
