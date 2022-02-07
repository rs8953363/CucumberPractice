package utilities;

import java.io.*;
import java.util.*;

//This class has to be public so you can access anywhere
public class ConfigurationReader {

    //If you want to access properties file you need to create an object. To avoid to create an object, you need to use
    // static keyword.
    static Properties properties; //Object creation from Properties class. This object will read configuration.properties class.
    // Since it's static it's created in the memory.

    static{//static block runs as soon as program runs
        String path = "configuration.properties";
        FileInputStream file = null;//this line reads the configuratio.properties class
        try {
            file = new FileInputStream(path);
            properties = new Properties();
            properties.load(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key){//You can give this method a different name. public static means you can access this method everywhere
        return properties.getProperty(key);
    }
}