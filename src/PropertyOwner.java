import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PropertyOwner extends User{
	
	public Scanner sc = new Scanner(System.in);
	User user;
	String OwnerID;
	Property ppt;
	List<Property> listProperty= new ArrayList<>();
	
	public void select() {
		
		int n= 0;
		while(n!=5) {
			this.sysout("Select your option :\n1.Create Property\n2.Read Property\n3.Update Property\n4.Delete Property\n5.Exit");
			n= sc.nextInt();
			switch (n){
			case 1:
				sysout("Property Id :");
				String id = this.InputString();
				sysout("Describe :");
				String des= this.InputString();
				sysout("Contract ID: ");
				String contr= this.InputString();
				sysout("Property Owner ID: ");
				String propertyOnwer = this.InputString();
				sysout("Rental Rate :");
				double rental= sc.nextDouble();
				this.createProperty(id, des, contr, propertyOnwer, rental);
				break;
			case 2:
				sysout("ID :");
				String idr= this.InputString();
				this.readProperty(idr);
				break;
				
			case 3:
				sysout("ID :");
				String idu= this.InputString();
				this.updateProperty(idu);
				break;
			case 4:
				sysout("ID :");
				String idd= this.InputString();
				this.deleteProperty(idd);
				break;
			}
		}
	}
	public void createProperty(String id,String desc,String contr,String propertyOwner,double rent) {
		Property p=new Property(id,desc,contr,propertyOwner, rent);
		this.addListProperty(p);
		
	}
	public void readProperty(String id) {
		Property p=this.findProperty(id);
		sysout(p.readProperty());
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
		p.setRentalRate(sc.nextDouble());
		
	}
	public void addListProperty(Property property) {
		
		 this.listProperty.add(property);
	}
	public Property findProperty(String id) {
		for(Property a:listProperty) {
			if(a.getId().equals(id)) {
				
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
