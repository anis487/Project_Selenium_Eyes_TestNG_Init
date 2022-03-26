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

public class Test1 {

	
	private static WebDriver driver = TestRunner.driver;
	public static Eyes eyes = TestRunner.eyes;

	@Given("^I verify the graphic interface for test (\\d+)$")
	public void i_verify_the_graphic_interface_for_test(int arg1) throws Throwable {

		eyes.checkWindow("before test 1");
		
	}

	@When("^I enter an identifier for test (\\d+)$")
	public void i_enter_an_identifier_for_test(int arg1) throws Throwable {
	
		Thread.sleep(200);	
		eyes.checkWindow("after test 1");
		
	}
}

