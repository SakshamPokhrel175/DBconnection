package crudoperation;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Name , sex and phone_no");
		String name=scanner.next();
		String sex=scanner.next();
		int phone_no=scanner.nextInt();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//System.out.println("Driver Found");
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudoperation ", "saksham-pokhrel", "admin");
			//System.out.println("Connection Successful");
			
			Statement statement=connection.createStatement();//query CRUD
			String insertquery="INSERT INTO crud (`name`, `sex`, `phone_no`) VALUES ('"+name+"', '"+sex+"', '"+phone_no+"')";
			
			

			int flag=0;
			flag=statement.executeUpdate(insertquery);
			if(flag!=0)
			{
				System.out.println("Data inserted");
			}
			else
			{
				System.out.println("Try Again");
			}
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
