import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PropertyOwner extends User{
	
	public Scanner sc = new Scanner(System.in);
	User user;
	String OwnerID;
	public List<Property> listProperty= new ArrayList<>();
	public List<String> listOwner= new ArrayList<>();
	
	public void createProperty(String id,String desc,String contr,double rent) {
		Property p= new Property(id,desc,this.OwnerID,contr,rent);
		listProperty.add(p);
	}
	public void readProperty() {
		
	}
	public void deleteProperty(String id) {
		
	}
	public void readRentalContract() {
		
	}
	@Override
	public void addAttribute() {
		// TODO Auto-generated method stub
		
	}
		
	
}
