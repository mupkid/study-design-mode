package org.ohx.studyfacade.webpage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author mudkip
 * @date 2023/7/16
 */
public class Database {
    private Database() {
    }

    public static Properties getProperties(String dbName) {
        String filename = dbName + ".txt";
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(filename));
        } catch (IOException e) {
            System.out.println("Warning: " + filename + " is not found.");
        }
        return properties;
    }
}
