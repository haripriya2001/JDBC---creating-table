package com.durgasoft.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcApp01 {
 public static void main(String[] args)throws Exception
 {
	 Class.forName("oracle.jdbc.OracleDriver");
	 System.out.println("class loading");
	
	 
	 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
	 System.out.println("Connection Succed");
	 Statement st=con.createStatement();
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 System.out.println("Table Name:");
	 String tname=br.readLine();
	 String Query="create table "+tname+"(ENO number(3) primary key,ENAME varchar(20),ESAL float,EADDR varchar(50))";
	 st.executeUpdate(Query);
	 System.out.println("table "+tname+" created Succesfully");
 }

}
