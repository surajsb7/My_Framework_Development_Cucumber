package Base;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.Scenario;

public class TestBase {

	protected WebDriver driver;
	protected String Base_Url = "http://automationpractice.com/";
	protected int Wait_Time_Second = 20;
	protected Scenario scn;

}
