package crudoperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter your id and name and sex and phone_no");
		int id=scanner.nextInt();
		String name=scanner.next();
//		String sex=scanner.next();
//		int phone_no=scanner.nextInt();
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//System.out.println("Driver Found");
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudoperation ", "saksham-pokhrel", "admin");
			//System.out.println("Connection Successful");
			
			Statement statement=connection.createStatement();//query CRUD
 			String Updatequery="UPDATE crud SET `name` = '"+name+"' WHERE (`id` = '"+id+"')";
			//String Updatequery="UPDATE crud SET `name` = '"+name+"' , `sex` = '"+sex+"' , `phone+no` = '"+phone_no+"' WHERE (`id` = '"+id+"')";

 			int flag=0;
			flag=statement.executeUpdate(Updatequery);
			if(flag!=0)
			{
				System.out.println("Data Updated");
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
