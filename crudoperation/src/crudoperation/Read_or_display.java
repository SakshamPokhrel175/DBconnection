package crudoperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Read_or_display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//System.out.println("Driver Found");
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudoperation ", "saksham-pokhrel", "admin");
			//System.out.println("Connection Successful");
			
			Statement statement=connection.createStatement();//query CRUD
			ResultSet set=statement.executeQuery("SELECT * FROM crudoperation.crud");
			
			while(set.next()) //true - next data
				{
					System.out.println(set.getInt("id")+" "+set.getString("name")+" "+set.getString("sex")+" "+set.getInt("phone_no"));
					
				}
			
			

			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	

		

	}

}
