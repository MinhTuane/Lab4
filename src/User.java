import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class User {
	String UserID;
	String firstName;
	String lastName;
	String Email;
	String password;
	PropertyOwner po;
	public Scanner sc= new Scanner(System.in);
	List<User> listUser= new ArrayList<>();
	
	public User(String UserID,String firsName,String lastName,String email, String passWord){
		this.UserID=UserID;
		this.firstName=firsName;
		this.lastName= lastName;
		this.Email= email;
		this.password=passWord;
		
	}
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
	public boolean update() {
		this.sysout("ID want to change");
		String id= this.InputString();
		int userPosition = this.findUserID(id);
		if(userPosition==-1) {
			return false;
		}else {
			this.listUser.remove(userPosition);
			po.register();
			return true;
		}
	}
	public String InputString() {
		return sc.next();
	}
	public void sysout(String a) {
		System.out.println("a");
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
