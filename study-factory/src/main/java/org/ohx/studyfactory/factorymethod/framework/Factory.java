package org.ohx.studyfactory.factorymethod.framework;

/**
 * @author mudkip
 * @date 2023/6/26
 */
public abstract class Factory {
    public final Product create(String owner) {
        Product product = createProduct(owner);
        registerProduct(product);
        return product;
    }

    protected abstract Product createProduct(String owner);

    protected abstract void registerProduct(Product product);
}
