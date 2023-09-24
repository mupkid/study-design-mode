package org.ohx.studyprototype.framework;

/**
 * @author mudkip
 * @date 2022/7/18
 */
public interface Product extends Cloneable {
    void use(String s);

    Product createClone();
}
