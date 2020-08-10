package com.app.dbconnection;

import java.sql.DriverManager;

public class Connection {

	public void print(String name, String phone, String gender, String address, String vehicle,
			String date, String offence, String fineamount) {
		System.out.println(name + "-" + phone + "-" + gender + "-" + address + "-" + vehicle + "-" + date
				+ "-" + offence +"-"+ fineamount);
	}

	public void addToDb(String name, String phone, String gender, String address, String vehicle,
			String date, String offence, String fineamount) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/copapp", "root",
					"root");
			if (conn != null) {
				System.out.println("connection established");
			}

			String sql = "insert into cop values (?,?,?,?,?,?,?,?)";
			java.sql.PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, name);
			statement.setString(2, phone);
			statement.setString(3, gender);
			statement.setString(4, address);
			statement.setString(5, vehicle);
			statement.setString(6, date);
			statement.setString(7, offence);
			statement.setString(8, fineamount);
			int res = statement.executeUpdate();
			
			if(res==1)
			{
				System.out.println("updated successfully...");
			}
			else
			{
				System.out.println("unsuccessfull...");
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
