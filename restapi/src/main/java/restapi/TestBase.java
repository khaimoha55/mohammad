package restapi;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
	
	
	
	public Properties prop;
	
	
	public TestBase() {
		// This prop will be initialize when we call this constructor 
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream ("C:/Users/khaiyum.mohammad/eclipse-workspace/restapi/src/main/java/com/qa/configuration/config.properties");
			prop.load(ip);
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
			}
	}

}


