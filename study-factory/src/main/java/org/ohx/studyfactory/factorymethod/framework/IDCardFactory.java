package org.ohx.studyfactory.factorymethod.framework;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mudkip
 * @date 2023/6/26
 */
public class IDCardFactory extends Factory {
    private List<String> owners = new ArrayList<>();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard) product).getOwner());
    }

    public List<String> getOwners() {
        return owners;
    }
}
