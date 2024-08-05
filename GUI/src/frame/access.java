package frame;
import  java.sql.*;
import java.util.Scanner;
public class access {
		public static void main(String[] args)
		{
			// jar file--java archive file
			try
			{
			Class.forName("com.mysql.jdbc.Driver");//driver
         	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","Jesus@123");
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter Name");
			sc.nextLine();
			String Name =sc.nextLine();
			System.out.println("Enter Birth_Date:");
			Double Birth_Date=sc.nextDouble();
			System.out.println("Enter City:");
			sc.nextLine();
			String city =sc.nextLine();
			System.out.println("Enter state:");
			String state=sc.nextLine();
			System.out.println("contactNo");
			Double Contact_No =sc.nextDouble();
			System.out.println("Enter Email ID:");
			sc.nextLine();
			String EmailId =sc.nextLine();
			System.out.println("Login_name");
			String Login=sc.nextLine();
			System.out.println("password");
			String password=sc.nextLine();
			System.out.println("address");
			String address=sc.nextLine();
			
			//String s1= "update  student set Name =? where RollNo=?"; 

	String s= "INSERT INTO details (Name,Birth_Date,city,state,Contact_No,E_Mail,Login_Name,password,Address)"+ 
	"VALUES(?, ?, ?, ?, ?, ?, ?, ?,?)";
			// statement
			 // PreparedStatement
			
			PreparedStatement statement = con.prepareStatement(s);
			
			statement.setString(1, Name);
			statement.setDouble(2, Birth_Date);
			statement.setString(3, city);
			statement.setString(4, state);
			statement.setDouble(5, Contact_No);
			statement.setString(6, EmailId);
			statement.setString(7,Login);
			statement.setString(8,password);
			statement.setString(9,address);
			statement.executeUpdate(); // execute, executequery 
//			if(rows > 0)
//			{
//				System.out.println(" A new student has been Inserted Successfully...");
//			}
			System.out.println("After Inserting");
			ResultSet rs1=statement.executeQuery("select * from details");
			
			while(rs1.next())
			{
				System.out.println(rs1.getString(1)+"\t"+rs1.getDouble(2)+
		"\t"+rs1.getString(3)+"\t"+rs1.getString(4)+"\t"+rs1.getDouble(5)+"\t"+rs1.getString(6)+
		"\t"+rs1.getString(7)+"\t"+rs1.getString(8)+"\t"+rs1.getString(9));
			}
		}
		catch (Exception e)
		{
		System.out.println(e);
			
		}

		}

	}



