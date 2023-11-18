package BaseFactory;

import Model.Property;

public interface BasePropertyFactory {
    Property createProperty(int propertyID, String description, double rentalRate, int ownerIds, int contractIds);
}
