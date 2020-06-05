package hw6;

import java.sql.*;

public class DBConnect {
	private Connection con; //connection
	private Statement st; //statement
	
	public DBConnect(){//makes connection with our database and particular table
		try{
			Class.forName("com.mysql.jdbc.Driver");  
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pr5_oop","root",""); 
			st = con.createStatement();
		}catch(Exception e){
			System.out.println("Error:" + e);
		}
	}
	public void getDesktopData() throws SQLException, ClassNotFoundException{ //outputs information of desktop app employee
		try{
			ResultSet rs;
			String query = "SELECT * FROM emloyee WHERE speciality IN ('front end', 'back end', 'PR manager', 'tester')";
			rs = st.executeQuery(query);
			System.out.println("Information about our team:");
			while(rs.next()){
				String name = rs.getString("emp_name");
				String speciality = rs.getString("speciality");
				System.out.println(name +"     " + speciality);
			}
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
	public void getDesktopCost() throws SQLException, ClassNotFoundException{ //outputs total cost of desktop app
		try{
			String query = "SELECT SUM(salary) FROM emloyee WHERE speciality IN ('front end', 'back end', 'PR manager', 'tester')";
			ResultSet rs = st.executeQuery(query);
			System.out.println("Price for our service:");
			while(rs.next()){
				System.out.println(rs.getInt(1));
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	public void getMobileCost() throws SQLException, ClassNotFoundException{ // outputs final cost of mobile app
		try{
			String query = "SELECT SUM(salary) FROM emloyee WHERE speciality IN ('mobile', 'PR manager', 'tester')";
			ResultSet rs = st.executeQuery(query);
			System.out.println("Price for our service:");
			while(rs.next()){
				System.out.println(rs.getInt(1));
			}
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	public void getMobileData() throws SQLException, ClassNotFoundException{ //outputs information about mobile app employee
		try{
			ResultSet rs;
			String query = "SELECT * FROM emloyee WHERE speciality IN ('mobile', 'PR manager', 'tester')";
			rs = st.executeQuery(query);
			System.out.println("Information about our team:");
			while(rs.next()){
				String name = rs.getString("emp_name");
				String speciality = rs.getString("speciality");
				System.out.println(name +"     " + speciality);
			}
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	public ResultSet getEmployee(String speciality) throws SQLException, ClassNotFoundException{ //gets info about employee of a particular speciality employee
		String query = "SELECT * FROM emloyee WHERE speciality ='" + speciality +"'";
		return st.executeQuery(query);
		
	}
	/*я все в основном через базу сделала
	 *не бейте пж и не губите любовь к SQL
	 */
}
