import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager {
		Scanner sc= new Scanner(System.in);
		public List<RentalContract> listContract= new ArrayList<>();
		
		public void createContact(String contractID, String tenantID, String startDate, String endDate, double rentAmount ) {
			this.addList(new RentalContract(contractID,tenantID,startDate,endDate,rentAmount));
		}
		public void deleteContract(String id) {
			RentalContract t= this.findContract(id);
			this.listContract.remove(t);
		}
		public RentalContract findContract(String id) {
			for(RentalContract a:this.listContract) {
				if(a.contractID==id) {
					return a;
				}
			}
			return null;
		}
		public void upDateContract(String id) {
			RentalContract t= this.findContract(id);
			t.readContract();
			t.setContractID(sc.next());
			t.setTenantID(sc.next());
			t.setStartDate(sc.next());
			t.setEndDate(sc.next());
			t.setRentAmount(sc.nextDouble());
		}
		public void readContract(String id) {
			RentalContract t= this.findContract(id);
			t.readContract();
		}
		public void addList(RentalContract t){
			this.listContract.add(t);
		}
}
