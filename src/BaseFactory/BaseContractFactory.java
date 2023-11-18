package BaseFactory;

import java.util.Date;

import Model.RentalContract;

public interface BaseContractFactory {
    RentalContract createContract(int contractID, int tenantID, int propertyID, Date starDate, Date endDate);
}
