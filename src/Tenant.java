import java.util.ArrayList;
import java.util.List;

public class Tenant extends User {
	String tenantID;
	List<User> tenantList= new ArrayList<>();
	public Tenant() {
		
	}
	@Override
	public void register() {
		// TODO Auto-generated method stub
		super.register();
	}
	@Override
	public void addAttribute() {
		// TODO Auto-generated method stub
		
	}
	
}
