package Steps;

import com.Innocrm.base.base;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends base{
	@Before
	public void beforerun()
	{
		System.out.println("Runs before any scenario");
	}
	@After
	public void afterrun()
	{
		driver.quit();
      	}


}
