package crudoperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your id to delete");
		int id=scanner.nextInt();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//System.out.println("Driver Found");
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudoperation ", "saksham-pokhrel", "admin");
			//System.out.println("Connection Successful");
			
			Statement statement=connection.createStatement();//query CRUD
			String deletequery="DELETE FROM crud WHERE (`id` = '"+id+"')";

			
			int flag=0;
			flag=statement.executeUpdate(deletequery);
			if(flag!=0) 
			{
				System.out.println("Data Deleted");
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
