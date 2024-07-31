package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

import com.mysql.cj.jdbc.CallableStatement;

public class AssmProc {
	private static final String driver_ClassName = "com.mysql.cj.jdbc.Driver";
	private static final String url = "jdbc:mysql://localhost:3306/hr_data";
	private static final String userName = "root";
	private static final String password = "";
	private static final String queryInsert = "{call InsertEmployeeData (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}";
	private static final String queryRetreve = "{call retrieve (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}";
	
	public static void main(String[] args) throws Exception{
		Class.forName(driver_ClassName);
		Connection con = DriverManager.getConnection(url, userName, password);
		if(con != null)
			System.out.println("connect is done");
		else 
			System.out.println("conneciton is not done");
		
		CallableStatement cs = (CallableStatement) con.prepareCall(queryInsert);
		CallableStatement csr = (CallableStatement) con.prepareCall(queryRetreve);
		
		InputStreamReader isr = new InputStreamReader(System.in); //  this also work like scanner but much better due to less type casting
		BufferedReader br = new BufferedReader(isr);
		
		
		
		while(true)
		{
			System.out.println("1. Make Account  ");
			System.out.println("2. Show deatil by id");
			System.out.println("3. Exit\n\n");
			
			System.out.println("Enter your Choice : ");
			String opt = br.readLine();
			
			switch (opt) {
			case "1":
			{
				
//				1. input name : 
				System.out.println("input name : ");
				cs.setString(1, br.readLine());
				
//				1. input p_edesg : 
				System.out.println(" input p_edesg : ");
				cs.setString(2, br.readLine());
				
//				1. input p_hno: 
				System.out.println("input p_hno : ");
				cs.setString(3, br.readLine());
				
//				1. input p_sname : 
				System.out.println("input p_sname : ");
				cs.setString(4, br.readLine());
				
//				1. input p_city : 
				System.out.println("input p_city : ");
				cs.setString(5, br.readLine());
				
//				1. input p_state : 
				System.out.println("input p_state : ");
				cs.setString(6, br.readLine());
				
//				2 : input p_pincode
				System.out.println("input p_pincode : ");
				cs.setInt(7, Integer.parseInt(br.readLine()));
				
//				1. input p_mailid 
				System.out.println("input p_mailid : ");
				cs.setString(8, br.readLine());
				
//				1 : input p_phoneno
				System.out.println("Enter p_phoneno: ");
				cs.setLong(9, Long.parseLong(br.readLine()));
				
//				4. input p_bsal
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
			break;
			case "2":
			{
				 System.out.println("Enter Employee ID (eid): ");
		            int eid = Integer.parseInt(br.readLine());
		            csr.setInt(1, eid);
		            
		            csr.registerOutParameter(2, Types.VARCHAR); // p_ename
		            csr.registerOutParameter(3, Types.VARCHAR); // p_edesg
		            csr.registerOutParameter(4, Types.VARCHAR); // p_hno
		            csr.registerOutParameter(5, Types.VARCHAR); // p_sname
		            csr.registerOutParameter(6, Types.VARCHAR); // p_city
		            csr.registerOutParameter(7, Types.VARCHAR); // p_state
		            csr.registerOutParameter(8, Types.INTEGER); // p_pincode
		            csr.registerOutParameter(9, Types.VARCHAR); // p_mailid
		            csr.registerOutParameter(10, Types.BIGINT); // p_phoneno
		            csr.registerOutParameter(11, Types.DECIMAL); // p_bsal
		            csr.registerOutParameter(12, Types.DECIMAL); // p_hra
		            csr.registerOutParameter(13, Types.DECIMAL); // p_da
		            csr.registerOutParameter(14, Types.DECIMAL); // p_totsal
		            
		            csr.execute();
		            
		        	System.out.println("p_id : " + eid);
		            System.out.println("p_ename: " + csr.getString(2));
		            System.out.println("p_edesg: " + csr.getString(3));
		            System.out.println("p_hno: " + csr.getString(4));
		            System.out.println("p_sname: " + csr.getString(5));
		            System.out.println("p_city: " + csr.getString(6));
		            System.out.println("p_state: " + csr.getString(7));
		            System.out.println("p_pincode: " + csr.getInt(8));
		            System.out.println("p_mailid: " + csr.getString(9));
		            System.out.println("p_phoneno: " + csr.getLong(10));
		            System.out.println("p_bsal: " + csr.getBigDecimal(11));
		            System.out.println("p_hra: " + csr.getBigDecimal(12));
		            System.out.println("p_da: " + csr.getBigDecimal(13));
		            System.out.println("p_totsal: " + csr.getBigDecimal(14));
		            System.out.println("\n");

			}
			break;
			case "3":
			{
				System.out.println("Good Bye");
				System.exit(0);
			}
				break;
			default:
				System.out.println("invalid option seletecd");
				main(null);
			}
		}
	}
}
