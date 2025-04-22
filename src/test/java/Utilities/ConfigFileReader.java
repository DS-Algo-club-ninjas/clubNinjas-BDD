package Utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
	
private static Properties properties;
	
	public ConfigFileReader()  {
		Properties properties = new Properties();
		try {
			
		FileReader reader = new FileReader("src/test/resources/ConfigFIle/config.properties");
			try {
				properties.load(reader);
				//System.out.println("config file load");
			}
			catch (IOException e){
				e.printStackTrace();
			}
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		this.properties = properties;
		//System.out.println(properties.getProperty("browser"));
	}
	
	public static String getDSAlgoURL() {
		String url = properties.getProperty("url");
		if (url != null) {
			return url;
		} else {
			throw new RuntimeException("URL not specified in the Configuration property file.");
		}
	}
	
	public static String getBrowser() {
		String browser = properties.getProperty("browser");
		if (browser != null) {
			return browser;
		} else {
			throw new RuntimeException("Browser not specified in the Configuration property file.");
		}
	}

}
