package testscripts.regression;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Validatedept10 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String dburl="jdbc:mysql://localhost:3310/testdb";
		String username="root";
		String password="root";
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection(dburl,username,password);
		PreparedStatement ps=conn.prepareStatement(" select * from emp where deptno=10");
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			for(int i=1;i<=8;i++)
			{
				System.out.print(rs.getString(i)+" \t");
			}
			System.out.println();
		}

	}

}
