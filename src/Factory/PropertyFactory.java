package Factory;

import BaseFactory.BasePropertyFactory;
import Model.Property;

public class PropertyFactory implements BasePropertyFactory {

    @Override
    public Property createProperty(int propertyID, String description, double rentalRate, int ownerId, int contractId) {
        return new Property(propertyID, description, rentalRate, ownerId, contractId);
    }

}
