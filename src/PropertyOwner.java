import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PropertyOwner extends User{
	public PropertyOwner(String UserID, String firsName, String lastName, String email, String passWord) {
		super(UserID, firsName, lastName, email, passWord);
		// TODO Auto-generated constructor stub
		this.OwnerID= UserID;
	}
	public Scanner sc = new Scanner(System.in);
	User user;
	String OwnerID;
	public List<User> listProperty= new ArrayList<>();
	public List<String> listOwner= new ArrayList<>();
	@Override
	public void register() {
		this.sysout("ID :");
		String User = this.InputString();
		this.sysout("First Name");
		String firsNam= this.InputString();
		this.sysout("Last Name: ");
		String lastNam= this.InputString();
		this.sysout("Email: ");
		String emai= this.InputString();
		this.sysout("Password: ");
		String passWor= this.InputString();
		User use = new PropertyOwner(User,firsNam,lastNam,emai,passWor);
		this.listUser.add( use );
	}
	
}
