package myutility;

import java.util.*;
import java.io.*;
import java.sql.*;

public class MyDriver {

	public    java.sql.Connection Dbcon;

	public   Connection getmyConnect()
	{
				
		try
		{
   	Dbcon=null;
 	Class.forName("org.h2.Driver");
      Dbcon = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/Skillproj","sa","password");
      System.out.println("connected");
		}
		catch (Exception e)
		{
		System.out.println(e.toString());
		} 
		return(Dbcon);
	}
	
}
