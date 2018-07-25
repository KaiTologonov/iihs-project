package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {

	//whole purpose of this class is to read properties file
	
	public static Properties properties;
	//loading will happen only once thats why we are surrounding with static block
	static {
		//String path = "/Users/admin/eclipse-workspace/cucumberEsens/configuration.properties";
		String path = "/Users/kairattologonov/eclipse-workspace/iihs-project/configuration.properties";
		
		try {
			
			File file = new File(path);
			FileInputStream fs = new FileInputStream(file);
			properties = new Properties();
			properties.load(fs);
			fs.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//it will return property value
	public static String getProperty(String key) {
		return properties.getProperty(key);
	}
}
