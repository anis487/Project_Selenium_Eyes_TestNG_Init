package Com.Cristal.StepDefinitions;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;

import com.applitools.eyes.BatchInfo;
import com.applitools.eyes.EyesRunner;

import com.applitools.eyes.config.Configuration;
import com.applitools.eyes.selenium.Eyes;

import Com.Cristal.Runner.TestRunner;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LoginSteps {

	private static WebDriver driver = TestRunner.driver;
	public static Eyes eyes = TestRunner.eyes;
		
	@Given("^I access the Cristal site$")
	public void i_access_the_Cristal_site() throws Throwable {

		
		Assert.assertTrue(true);

	}

	@Given("^I verify the graphic interface$")
	public void i_verify_the_graphic_interface() throws Throwable {
		
		
		eyes.checkWindow("before login");
		 	
	}
	@When("^I enter an identifier anis$")
	public void i_enter_an_identifier_anis() throws Throwable {
	
		Thread.sleep(2000);
		eyes.checkWindow("after login");
		
		Assert.assertTrue(true);		
	}

	@Before
 	public void setUpScenario(Scenario scenario) {
		
		System.out.println("============================="+scenario.getName()+"===========================");
		
		Configuration suiteConfig = eyes.getConfiguration();
		suiteConfig.setTestName("login manage");	
		eyes.setConfiguration(suiteConfig);
		driver = eyes.open(driver);	
			
		
	}

	@After
	public void afterStep(Scenario scenario) {
		System.out.println("...............................after..............................................");
		
		if (scenario.isFailed()) {

			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");
			// stick it in the report

			System.out.println("...............................after..............................................");
			//System.out.println("============================="+step.getName()+"==========================="+ step.getKeyword());
		}
		
		eyes.close();

	}

	/*@After
	public void afterStepEyes(ITestResult result) {
        // check if an exception was thrown
        boolean testPassed = result.getStatus() != ITestResult.FAILURE;
        if (testPassed) {
            // Close the Eyes instance, no need to wait for results, we'll get those at the end in afterTestSuite
            eyes.closeAsync();
        } else {
            // There was an exception so the test may be incomplete - abort the test
            eyes.abortAsync();
        }
       
	}*/
	
	
}

