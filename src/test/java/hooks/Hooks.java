package hooks;

import Utility.Seleniumutility;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Seleniumutility{

	@Before
	public void preCondition(){
		
	}
	
	@After ("@Regression or @Smoke")
	public void postCondition(){
		tearDown();
	}
}
