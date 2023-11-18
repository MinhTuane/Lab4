
public class Property {
	public String id;
	public String describe;
	public String contractID;
	public String propertyOwnerID;
	public double rentalRate;
	
	Property(String id,String desc,String contr,String proper,double rent){
		this.id=id;
		this.describe=desc;
		this.contractID=contr;
		this.propertyOwnerID=proper;
		this.rentalRate=rent;
	}
	public String readProperty() {
		
		return "ID :"+this.getId()+" Describe: "+this.getDescribe()+" Contract ID: "+this.getContractID()
		+" Property Owner :"+this.getPropertyOwnerID()+" Rental Rate: "+Double.toString(this.getRentalRate()).toString();
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public String getContractID() {
		return contractID;
	}

	public void setContractID(String contractID) {
		this.contractID = contractID;
	}

	public String getPropertyOwnerID() {
		return propertyOwnerID;
	}

	public void setPropertyOwnerID(String propertyOwnerID) {
		this.propertyOwnerID = propertyOwnerID;
	}

	public double getRentalRate() {
		return rentalRate;
	}

	public void setRentalRate(double rentalRate) {
		this.rentalRate = rentalRate;
	}
	
}