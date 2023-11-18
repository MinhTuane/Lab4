package Factory;

import java.util.Date;

import BaseFactory.BaseContractFactory;
import Model.RentalContract;

public class ContractFactory implements BaseContractFactory {

    @Override
    public RentalContract createContract(int contractID, int tenantID, int propertyID, Date starDate, Date endDate) {
        return new RentalContract(0, tenantID, propertyID, starDate, endDate);
    }

}
