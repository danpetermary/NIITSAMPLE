
package MyEntity;
import java.util.*;
import java.util.regex.*;


public class EmpMaster {
	int empid,mobile,super_id,exprnce;
	String emp_name,region,bUnit,work_ar,emailid,role,desig,country;
	 String dob,pwd;
   public static Map mp;
   public EmpMaster()
   {
	   mp=new HashMap();
   }
   	 public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		if(empid<=0)
			mp.put("empid","Empid can not be less than zero");
		else
		this.empid = empid;
	}
	public int getMobile() 
	{
		return mobile;
	}
	public void setMobile(int mobile) {
		Integer n=new Integer(mobile);
		String s=n.toString();
		if(s.length()<10)
		{
			mp.put("mobile","Mobile size should not be less than 10 digit");
		}
		else
		{
		this.mobile = mobile;
		}
	}
	public int getSuper_id() {
		return super_id;
	}
	public void setSuper_id(int super_id) {
		this.super_id = super_id;
	}
	public int getExprnce() {
		return exprnce;
	}
	public void setExprnce(int exprnce) {
		this.exprnce = exprnce;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getbUnit() {
		return bUnit;
	}
	public void setbUnit(String bUnit) {
		this.bUnit = bUnit;
	}
	public String getWork_ar() {
		return work_ar;
	}
	public void setWork_ar(String work_ar) {
		this.work_ar = work_ar;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		
		
		Pattern  regexPattern = Pattern.compile("^[(a-zA-Z-0-9-\\_\\+\\.)]+@[(a-z-A-z)]+\\.[(a-zA-z)]{2,3}$");
	    Matcher    regMatcher   = regexPattern.matcher(emailid);
	        if(regMatcher.matches()) {
	            this.emailid=emailid;
	        } else {
	             mp.put("mailid","Invalid mail id");
	             
	        }

	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
}
