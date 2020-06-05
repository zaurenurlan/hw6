package hw6;

import java.sql.*;
import java.sql.SQLException;
import java.util.*;
public class Project {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ArrayList<Employee> employee = new ArrayList<Employee>();//employee array list creation
		DBConnect connect = new DBConnect(); //connection to database
		
		System.out.println("Welcome! Type in 'false' for desktop application or 'true' for mobile application: ");
		Scanner s = new Scanner(System.in);
		boolean a; //choice of our user
		a = s.nextBoolean();
		s.close();
		if(!a){//gets all of the information about desktop app project
			connect.getDesktopCost();
			connect.getDesktopData();
		}else{//gets all of the info about mobile app project
			connect.getMobileCost();
			connect.getMobileData();
		}
		ResultSet rs = connect.getEmployee("front end");
		while(rs.next()) { //get info from db about front end developer and insert into array list
             FrontEnd fE = new FrontEnd(rs.getString("emp_name"), rs.getInt("salary"));
             employee.add(fE);
             fE.work();
         }
		ResultSet rs1 = connect.getEmployee("back end");
		while(rs1.next()) {//get info from db about back end developer and insert into array list
             BackEnd bE = new BackEnd(rs1.getString("emp_name"), rs1.getInt("salary"));
             employee.add(bE);
             bE.work();
         }
		ResultSet rs2 = connect.getEmployee("mobile");
		while(rs2.next()) {////get info from db about mobile developer and insert into array list
             Mobile m = new Mobile(rs2.getString("emp_name"), rs2.getInt("salary"));
             employee.add(m);
             m.work();
         }
		ResultSet rs3 = connect.getEmployee("PR manager");
		while(rs3.next()) {//get info from db about PR manager and insert into array list
             PRmanager PRM = new PRmanager(rs3.getString("emp_name"), rs3.getInt("salary"));
             employee.add(PRM);
             PRM.work();
         }
		ResultSet rs4 = connect.getEmployee("tester");
		while(rs4.next()) {//get info from db about tester and insert into array list
             Tester t = new Tester(rs4.getString("emp_name"), rs4.getInt("salary"));
             employee.add(t);
             t.work();
         }
	}
	
}
