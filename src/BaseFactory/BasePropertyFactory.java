package BaseFactory;

import java.util.List;

import Model.Property;

public interface BasePropertyFactory {
    Property createProperty(int propertyID, String description, String rentalRate, List<Integer> ownerIds,
            List<Integer> contractIds);
}
