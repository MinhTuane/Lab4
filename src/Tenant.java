import java.util.ArrayList;
import java.util.List;

public class Tenant extends User {
	String tenantID;
	List<User> tenantList= new ArrayList<>();
	@Override
	public void register() {
		// TODO Auto-generated method stub
		super.register();
	}
	
}
