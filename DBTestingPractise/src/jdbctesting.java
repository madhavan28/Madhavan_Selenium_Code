import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbctesting {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		String host="localhost";
		String port="3306";

		Connection con=DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/QAPracrise", "root", "Madhavan@28");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("Select * from credentails where creditcard='AXIS'");
		rs.next();
		System.out.println(rs.getString("Userid"));
		System.out.println(rs.getInt("CVV"));
		
		
		
	}

}
