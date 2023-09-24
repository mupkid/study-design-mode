package org.ohx.studyprototype.framework;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mudkip
 * @date 2022/7/18
 */
public class Manager {
    /**
     * 保存了实例的“名字”和“实例”之间的对应关系
     */
    private final Map<String, Product> showcase = new HashMap<>();

    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }

    public Product create(String protoName) {
        Product product = showcase.get(protoName);
        return product.createClone();
    }
}
