import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class jdbcconnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		String host="localhost";
		String port="3306";
		Connection con=DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/qadbt", "root","Madhavan@28");
		
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select * from employeeinfo where name='sam'");
		
		
		
		while(rs.next())
			
		{
		
	
		rs.getString("location");
		rs.getInt("age");
		
		}
		
	}

}
