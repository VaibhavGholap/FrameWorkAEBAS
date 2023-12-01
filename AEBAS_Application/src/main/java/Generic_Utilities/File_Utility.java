package Generic_Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class File_Utility {
	/**
	 * This method is used for the launching application
	 * @param key
	 * @return
	 * @throws IOException
	 * @author Vaibhav
	 */
	
	public String getKeyAndValue(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/comman.properties");
		Properties pro = new Properties();
		pro.load(fis);
		String Value =pro.getProperty(key);
		return Value;
		
	}
	
	
	

}
