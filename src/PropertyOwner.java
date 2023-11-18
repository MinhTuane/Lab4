import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PropertyOwner extends User{
	
	public Scanner sc = new Scanner(System.in);
	User user;
	String OwnerID;
	Property ppt;
	public List<Property> listProperty= new ArrayList<>();
	
	
	public void createProperty(String id,String desc,String contr,String propertyOwner,double rent) {
		this.addListProperty(ppt.createProperty(id, desc, contr,propertyOwner, rent));
	}
	public void readProperty(String id) {
		Property p=this.findProperty(id);
		ppt.readProperty(p);
	}
	public void deleteProperty(String id) {
		Property p=this.findProperty(id);
		this.listProperty.remove(p);
	}
	public void updateProperty(String id) {
		Property p= this.findProperty(id);
		sysout(p.getId()+" "+p.getDescribe()+" "+p.getContractID()+" "+p.getPropertyOwnerID()+" "+p.rentalRate);
		p.setId(sc.next());
		p.setDescribe(sc.next());
		p.setContractID(sc.next());
		p.setPropertyOwnerID(sc.next());
		p.setPropertyOwnerID(sc.next());
		p.setRentalRate(sc.nextDouble());
		
	}
	public void addListProperty(Property property) {
		this.listProperty.add(property);
	}
	public Property findProperty(String id) {
		for(Property a:listProperty) {
			if(a.getId()==id) {
				return a;
			}
		}
		return null;
	}
	public void readRentalContract() {
		
	}
	@Override
	public void addAttribute() {
		// TODO Auto-generated method stub
		
	}
		
	
}
