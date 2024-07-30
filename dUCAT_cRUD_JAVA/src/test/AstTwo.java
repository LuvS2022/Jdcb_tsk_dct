package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AstTwo {

	private static final String driver_ClassName = "com.mysql.cj.jdbc.Driver";
	private static final String url = "jdbc:mysql://localhost:3306/java_project";
	private static final String userName = "root";
	private static final String password = "";
	private static final String getAll = "select * from students";
	private static final String getByrollNo = "select * from students where rollNo = ?";
	private static final String insert = "insert into students values (?, ?, ?, ?, ?, ?)";
	private static final String update = "update students set totmarks=?, pre =?, grade=? where rollNo = ?";
	private static final String delete = "delete from students where rollNo= ?";
	public static void main(String[] args) throws Exception{
		Class.forName(driver_ClassName);
		Connection con = DriverManager.getConnection(url, userName, password);
		System.out.println("1) Connect check and database check");
		if(con == null)
			System.out.println("2)there is no connection");
		else
			System.out.println("there is conncetion");
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		PreparedStatement ps1 = con.prepareStatement(getAll);
		PreparedStatement ps2 = con.prepareStatement(getByrollNo);
		PreparedStatement ps3 = con.prepareStatement(insert);
		PreparedStatement ps4 = con.prepareStatement(update);
		PreparedStatement ps5 = con.prepareStatement(delete);
		
		while(true)
		{

			System.out.println("\n\n1. View All students");
			System.out.println("2. View All Students By rollNo");
			System.out.println("3. Add New students");
			System.out.println("4. Update Total Marks  By rollNo ");
			System.out.println("5. Delete students Record by rollNo");
			System.out.println("6. Exit\n\n");
			
			
			System.out.println("Enter your Choice : ");
			String opt = br.readLine();
			
			switch (opt) {
			
			case "1":
			{
				ResultSet rs = ps1.executeQuery();
				System.out.println("rollNo" + "\t" + "Name" + "\t" + "     Branch" + "\t" + "TotMrks" + "\t" + "   per" + "\t" + "Grade");
				System.out.println("----------------------------------------------------------");
				while(rs.next())
				{
					System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getDouble(4)  + "\t  " + rs.getDouble(5) + "\t" + rs.getString(6));
				}
			}
			break;
			case "2":
			{
				System.out.print("Enter your rollNo : ");
				int rollNo = Integer.parseInt(br.readLine());
//				          (col no, name of col)
				ps2.setInt(1,rollNo);
				ResultSet rs = ps2.executeQuery();
				System.out.println("rollNo" + "\t" + "Name" + "\t" + "     Branch" + "\t" + "TotMrks" + "\t" + "   per" + "\t" + "Grade");
				System.out.println("----------------------------------------------------------");
				if(rs.next())
				{
					System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getInt(4) + "\t  " + rs.getString(5) + "\t" + rs.getString(6));
				}
				else
					System.out.println("No Record Found");
			}
			break;
			case "3":
			{
				System.out.print("Enter your RollNo : ");
				int rollno = Integer.parseInt(br.readLine());
				
				System.out.print("Enter Your Name : ");
				String name = br.readLine();
				
				System.out.print("Enter Your branch : ");
				String branch = br.readLine();
				
				
				System.out.print("Enter your sub 1 marks : ");
				double sub1 = Double.parseDouble(br.readLine());
				System.out.print("Enter your sub 2 marks : ");
				double sub2 = Double.parseDouble(br.readLine());
				System.out.print("Enter your sub 3  marks: ");
				double sub3 = Double.parseDouble(br.readLine());
				System.out.print("Enter your sub 4 marks : ");
				double sub4 = Double.parseDouble(br.readLine());
				System.out.print("Enter your sub 5 marks : ");
				double sub5 = Double.parseDouble(br.readLine());
				System.out.print("Enter your sub 6 marks : ");
				double sub6 = Double.parseDouble(br.readLine());
				
				
				
				double totmarks = sub1 + sub2 + sub3 + sub4 + sub5 + sub6;
				double per = (totmarks/6);
				String grade;
				if(per >= 33)
				{
					grade = "pass";
				}
				else 
					grade = "fail";
				
				ps3.setInt(1,rollno);
				ps3.setString(2, name);
				ps3.setString(3, branch);
				ps3.setDouble(4, totmarks);
				ps3.setDouble(5, per);
				ps3.setString(6, grade);
				try
				{
					int k = ps3.executeUpdate();
					if(k > 0)
						System.out.println("Record Inserted");
					else
						System.out.println("Record is not Inserted");
				}
				catch(Exception e)
				{
				System.out.println("Dublicate rollNo Recored will not insert");	
				}
			}
			break;
			case "4":
			{
				System.out.print("Enter your rollNo : ");
				int rollNo = Integer.parseInt(br.readLine());
//				          (col no, name of col)
				ps2.setInt(1,rollNo);
				ResultSet rs = ps2.executeQuery();
				if (rs.next()){
					System.out.println("old total MARKS  : " + rs.getDouble(4));
					System.out.println("old PER  : " + rs.getDouble(5));
					System.out.println("old GRADE : " + rs.getString(6));
					
					
					System.out.print("Enter your sub 1 marks : ");
					double sub1 = Double.parseDouble(br.readLine());
					System.out.print("Enter your sub 2 marks : ");
					double sub2 = Double.parseDouble(br.readLine());
					System.out.print("Enter your sub 3  marks: ");
					double sub3 = Double.parseDouble(br.readLine());
					System.out.print("Enter your sub 4 marks : ");
					double sub4 = Double.parseDouble(br.readLine());
					System.out.print("Enter your sub 5 marks : ");
					double sub5 = Double.parseDouble(br.readLine());
					System.out.print("Enter your sub 6 marks : ");
					double sub6 = Double.parseDouble(br.readLine());
					
					
					
					double totmarks = sub1 + sub2 + sub3 + sub4 + sub5 + sub6;
					double per = (totmarks/6);
					String grade;
					if(per >= 33)
					{
						grade = "pass";
					}
					else 
						grade = "fail";
					
					ps4.setDouble(1, totmarks);
					ps4.setDouble(2, per);
					ps4.setString(3, grade);
					ps4.setInt(4, rollNo);
					
					int k = ps4.executeUpdate();
					
					if(k > 0)
						System.out.println("Record Update");
					else
						System.out.println("Failed Record is not Update");
				}
				else 
					System.out.println("Student Record not found");
			}
			break;
			case "5":
			{
				System.out.print("Enter your rollNo : ");
				int rollNo = Integer.parseInt(br.readLine());
//				          (col no, name of col)
				ps2.setInt(1, rollNo);
				ResultSet rs = ps2.executeQuery();
				if (rs.next()){
					ps5.setInt(1, rollNo);
					int k = ps5.executeUpdate();
					if(k > 0)
						System.out.println("Record Deleted");
					else
						System.out.println("Failed : Record is not DELETED");
				}
				else
					System.out.println("Record not found");
			}
			break;
			case "6":
			{
				System.out.println("Good Bye");
				System.exit(0);
			}
			break;
			default:
			{
				System.out.println("invalrollNo option seletecd");
				main(null);
			}
			}
			
		}
	}
}
