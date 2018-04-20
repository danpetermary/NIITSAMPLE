package TestTransact;
import java.sql.*;
import java.io.*;
import java.util.*;
import myutility.MyDriver;
import MyEntity.*;


public class findTest
{
public static java.sql.Connection c;
	
	public findTest()
	{
		try
		{
				
		 MyDriver md=new MyDriver();
		 c=md.getmyConnect();
		  	}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
	public boolean getSkillbyname(String skillVar)
	{
		int count=0;
			try
			{
		
		PreparedStatement psCert=c.prepareStatement("select * from EMP_TECH_SKILLS where Skillset=?" );
		psCert.setString(1,skillVar);
			ResultSet rs=psCert.executeQuery();
			
				while(rs.next())
				{
					System.out.println(rs.getString("emp_id"));
				}
				 count=rs.getRow();
				
		
			}
		catch(Exception ek)
			{
			System.out.println(ek.toString());
			
			}
			System.out.println("searched");
			if(count==0)
			return true;
			else
				return false;
	}
	
	public Map addData(int empid,int mobile,int super_id,int exprnce,String emp_name,String region,String bunit,String work,String emailid,String role,String desig,String country,String pwd,String dob)
	{
		EmpMaster eobj=new EmpMaster();
		
		 		 eobj.setbUnit(bunit);
		 		 eobj.setCountry(country);
		 		 eobj.setDesig(desig);
		 		 eobj.setDob(dob);
		 		 eobj.setEmailid(emailid);
		 		 eobj.setEmp_name(emp_name);
		 		 eobj.setEmpid(empid);
		 		 eobj.setExprnce(exprnce);
		 		 eobj.setMobile(mobile);
		 		 eobj.setPwd(pwd);
		 		 eobj.setRegion(region);
		 		 eobj.setRole(role);
		 		 eobj.setSuper_id(super_id);
		 		 eobj.setWork_ar(work);
		 		 
		 		 try
		 		 {
		 			 
		 			 //String k=eobj.mp.
		 		 if (eobj.mp.isEmpty())
		 		 {
		 			 
		 			PreparedStatement psCert=c.prepareStatement("insert into EMPLOYEEMASTER values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
		 			psCert.setInt(1,empid);
		 			psCert.setString(2,emp_name);
		 			psCert.setString(3, region);
		 			psCert.setString(4, bunit);
		 			psCert.setString(5, work);
		 			psCert.setInt(6,mobile);
		 			psCert.setString(7,emailid);
		 			psCert.setInt(8,super_id);
		 			psCert.setString(9, role);
		 			psCert.setString(10, desig);
		 			psCert.setString(11,country);
		 			psCert.setString(12, dob);
		 			psCert.setInt(13, exprnce);
		 			psCert.setString(14, pwd);
		 			int r=psCert.executeUpdate();
		 			System.out.println("added");
		 		 }
		 		else
		 		 {
		 			 
		 		 }
		
		 		 }
		 		 catch(Exception ek)
		 		 {
		 			System.out.println(ek.toString()); 
		 		 }
		 		return eobj.mp; 
		 		 
	}
	
	public boolean validateuser(int empid,String pwd)
	{
		String ch="no",pw="";
		try
				{
		PreparedStatement psCert=c.prepareStatement("select password from employeemaster where emp_id=?" );
		
		psCert.setInt(1,empid);
		ResultSet rs=psCert.executeQuery();
		while  (rs.next())
		{
		pw=rs.getString("password");
		}
		
		if(pw.equals(pwd))
			
					ch="yes";
		else
			ch="no";
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
				
		if(ch=="yes")
			return true;
		else
			return false;
		
	}
	
}

