package Generic_Utilities;

import java.util.Random;

public class Java_Utility {
	/**
	 * This method is used to avoid the Duplicates
	 * @return
	 * @author Vaibhav
	 */

	public int getrandamNum() {
		Random r = new Random();
		int ranNum = r.nextInt(1000);
		return ranNum;

	}

}
