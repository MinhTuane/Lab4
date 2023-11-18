package Factory;

import java.util.List;

import BaseFactory.BasePropertyFactory;
import Model.Property;

public class PropertyFactory implements BasePropertyFactory {

    @Override
    public Property createProperty(int propertyID, String description, String rentalRate, List<Integer> ownerIds,
            List<Integer> contractIds) {
        return new Property(propertyID, description, rentalRate, ownerIds, contractIds);
    }

}
