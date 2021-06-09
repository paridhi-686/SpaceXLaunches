package comSpaceX.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestSpaceXBase {
	
	public static Properties prop;
	
public TestSpaceXBase() {
		
		
		try
		{
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\AutomationExpert\\eclipse-workspace\\restAssuredFramework\\src\\main\\java\\com\\SpaceX\\config\\spacexconfig.properties");
			prop.load(ip);
			
		} catch(FileNotFoundException e) {
		  	e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
