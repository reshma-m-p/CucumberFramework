package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UtilityFetchProperty {
    public static String fetchPropertyValue(String key) throws IOException, FileNotFoundException {
        FileInputStream file = new FileInputStream("src/test/resources/properties/config.properties");//copy properties file path(content root)
        Properties property = new Properties();
        property.load(file);                       //loading property file
        return property.get(key).toString();
    }
}
