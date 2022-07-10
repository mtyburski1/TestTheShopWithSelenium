package models.propety_load;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesLoad {
    public static String loadAPropetyFile(String propety) {
        try (InputStream input = new FileInputStream("src/main/resources/PagesData.properties")) {

            Properties prop = new Properties();

            prop.load(input);

                String getDriverFromFile = prop.getProperty(propety);
                return getDriverFromFile;

        } catch (IOException ex) {
            System.out.println("Cannot find properties file");
        }
        return null;
    }

}
