package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class myHook {
	
	@Before
	public void browserLaunch(Scenario scenario) {
		
		System.out.println("+++++Browser gets launched+++++" );
		System.out.println("+++++Browser is maximized++++++");
		System.out.println("++++Execution Started for scenario : " + scenario.getName());
	}
	
	@After
	public void tearDown(Scenario scenario) {
		System.out.println("+++++ logged out from the application +++++");
		System.out.println("+++++ Broswer is closed +++++");
		System.out.println("++++Execution ended for scenario : " + scenario.getName());
	}

}
