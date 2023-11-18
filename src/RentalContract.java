
public class RentalContract {
	public String contractID;
	public String tenantID;
	public String startDate;
	public String endDate;
	public double rentAmount;
	public RentalContract(String contractID, String tenantID, String startDate, String endDate, double rentAmount) {
		this.contractID = contractID;
		this.tenantID = tenantID;
		this.startDate = startDate;
		this.endDate = endDate;
		this.rentAmount = rentAmount;
	}
	public String readContract() {
		return this.getContractID()+" "+this.getTenantID()+" "+this.getStartDate()+" "+this.getEndDate()+" "+Double.toString(this.getRentAmount()).toString();
	}
	public String getContractID() {
		return contractID;
	}
	public void setContractID(String contractID) {
		this.contractID = contractID;
	}
	public String getTenantID() {
		return tenantID;
	}
	public void setTenantID(String tenantID) {
		this.tenantID = tenantID;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public double getRentAmount() {
		return rentAmount;
	}
	public void setRentAmount(double rentAmount) {
		this.rentAmount = rentAmount;
	}
	
}
