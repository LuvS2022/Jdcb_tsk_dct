package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Demo {
	private static final String driver_ClassName = "com.mysql.cj.jdbc.Driver";
	private static final String url = "jdbc:mysql://localhost:3306/java_project";
	private static final String userName = "root";
	private static final String password = "";
	private static final String getAll = "select * from student";
	private static final String getById = "select * from student where id = ?";
	private static final String insert = "insert into student values (?, ?, ?, ?)";
	private static final String update = "update student set name = ?, course = ? where id = ?";
	private static final String delete = "delete from student where id= ?";
	
	public static void main(String[] args) throws Exception{
		Class.forName(driver_ClassName);
		Connection con = DriverManager.getConnection(url, userName, password);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		PreparedStatement ps1 = con.prepareStatement(getAll);
		PreparedStatement ps2 = con.prepareStatement(getById);
		PreparedStatement ps3 = con.prepareStatement(insert);
		PreparedStatement ps4 = con.prepareStatement(update);
		PreparedStatement ps5 = con.prepareStatement(delete);
		
		while(true)
		{
			System.out.println("\n\n1. Show All Records");
			System.out.println("2. Show All Records By id");
			System.out.println("3. Add New Records");
			System.out.println("4. Update Name and Course By id");
			System.out.println("5. Delete Record by id");
			System.out.println("6. Exit\n\n");
			
			System.out.println("Enter your Choice : ");
			String opt = br.readLine();
			
			switch (opt) {
				
			case "1":
			{
				ResultSet rs = ps1.executeQuery();
				System.out.println("Id" + "\t" + "Name" + "\t"+"\t" + "Course" + "\t"+"\t" + "age");
				System.out.println("------------------------------------------------");
				while(rs.next())
				{
					System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getInt(4));
				}
			}
			break;
			case "2":
			{
				System.out.print("Enter your id : ");
				int id = Integer.parseInt(br.readLine());
//				          (col no, name of col)
				ps2.setInt(1,id);
				ResultSet rs = ps2.executeQuery();
				if(rs.next())
				{
					System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getInt(4));
				}
				else
					System.out.println("No Record Found");
			}
			break;
			case "3":
			{
				System.out.print("Enter your id : ");
				int id = Integer.parseInt(br.readLine());
				
				System.out.print("Enter Your Name : ");
				String name = br.readLine();
				
				System.out.print("Enter Your Course : ");
				String Course = br.readLine();
				
				System.out.print("Enter your age : ");
				int age = Integer.parseInt(br.readLine());
				
				ps3.setInt(1,id);
				ps3.setString(2, name);
				ps3.setString(3, Course);
				ps3.setInt(4, age);
				
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
				System.out.println("Dublicate Id Recored will not insert");	
				}
			}
			break;
			case "4":
			{
				System.out.print("Enter your id : ");
				int id = Integer.parseInt(br.readLine());
//				          (col no, name of col)
				ps2.setInt(1,id);
				ResultSet rs = ps2.executeQuery();
				if (rs.next()){
					System.out.println("OLD name :  " + rs.getString(2));
					System.out.println("old course name  : " + rs.getString(3));
					
					
					System.out.print("Enter new Name : ");
					ps4.setString(1, br.readLine());
					
					System.out.print("Enter new Course : ");
					ps4.setString(2, br.readLine());
					
					ps4.setInt(3, id);
					
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
				System.out.print("Enter your id : ");
				int id = Integer.parseInt(br.readLine());
//				          (col no, name of col)
				ps2.setInt(1, id);
				ResultSet rs = ps2.executeQuery();
				if (rs.next()){
					ps5.setInt(1, id);
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
				System.out.println("invalid option seletecd");
				main(null);
			}
			}
		}
		
		
	}
}
