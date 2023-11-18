import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class User {
	String UserID;
	String firstName;
	String lastName;
	String Email;
	String password;
	public Scanner sc= new Scanner(System.in);
	List<User> listUser= new ArrayList<>();
	
	public String getUserID() {
		return UserID;
	}

	public void setUserID(String userID) {
		UserID = userID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return password;
	}

	public abstract void addAttribute();
	
	public void register() {
		
		
	}
	public boolean login() {
		this.sysout("Email");
		 String tEmail=  this.InputString();
		this.sysout("Password");
		String tPassWord= this.InputString();
		if(findUser(tEmail,tPassWord)==-1)
			return false;
		return true;
	}
	public String InputString() {
		return sc.next();
	}
	public void sysout(String a) {
		System.out.println(a);
	}
	public int findUser(String tEmail,String tPassWord) {
		
		int i=0;
		for(User a:this.listUser) {
			if(a.Email.equalsIgnoreCase(tEmail)&& a.password.equals(tPassWord));
			 	return i;
		}
		return -1;
	}
	public boolean resetPassword() {
		this.sysout("ID want to change");
		String id= this.InputString();
		int userPosition = this.findUserID(id);
		if(userPosition==-1) {
			return false;
		}else {
			this.sysout("New Password:");
			this.setPassword(this.InputString());
			return true;
		}
	}
	public int findUserID(String id) {
		
		int i=0;
		for(User a:this.listUser) {
			if(a.UserID.equalsIgnoreCase(id));
			 	return i;
		}
		return -1;
	}
	public void setPassword(String a) {
		this.password= a;
	}
}
