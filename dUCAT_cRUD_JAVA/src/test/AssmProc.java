package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.cj.jdbc.CallableStatement;

public class AssmProc {
	private static final String driver_ClassName = "com.mysql.cj.jdbc.Driver";
	private static final String url = "jdbc:mysql://localhost:3306/hr_data";
	private static final String userName = "root";
	private static final String password = "";
	private static final String query = "{call InsertEmployeeData (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}";
	public static void main(String[] args) throws Exception{
		Class.forName(driver_ClassName);
		Connection con = DriverManager.getConnection(url, userName, password);
		if(con != null)
			System.out.println("connect is done");
		else 
			System.out.println("conneciton is not done");
		
		CallableStatement cs = (CallableStatement) con.prepareCall(query);
		
		InputStreamReader isr = new InputStreamReader(System.in); //  this also work like scanner but much better due to less type casting
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("input name : ");
		cs.setString(1, br.readLine());
		

		System.out.println(" input p_edesg : ");
		cs.setString(2, br.readLine());

		System.out.println("input p_hno : ");
		cs.setString(3, br.readLine());
		

		System.out.println("input p_sname : ");
		cs.setString(4, br.readLine());
		

		System.out.println("input p_city : ");
		cs.setString(5, br.readLine());
		

		System.out.println("input p_state : ");
		cs.setString(6, br.readLine());
		

		System.out.println("input p_pincode : ");
		cs.setInt(7, Integer.parseInt(br.readLine()));
		

		System.out.println("input p_mailid : ");
		cs.setString(8, br.readLine());
		

		System.out.println("Enter p_phoneno: ");
		cs.setLong(9, Long.parseLong(br.readLine()));
		

		System.out.println("input p_bsal :");
		double bsal = Double.parseDouble(br.readLine());
		cs.setDouble(10, bsal);
		
		double HRA = 0.93*bsal,
				DA = 0.61*bsal;
		
		double totSal = bsal + HRA + DA;
		cs.setDouble(11, HRA);
		cs.setDouble(12, DA);
		cs.setDouble(13, totSal);
		
		try {
			cs.execute();
			System.out.println("Record save successfully");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("not inserted");
		}
		
	}
}
