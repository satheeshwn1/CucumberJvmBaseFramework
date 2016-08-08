package support;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import utils.DriverUtils;

/**
 * Created by thivyalakshimi on 06/08/16.
 */
public class Hooks extends DriverUtils {
    private WebDriver driver;


    @Before
    public void beforeScenario() {
        System.out.println("Starting chrome driver");
        driver = new DriverUtils().getDriver();

    }

    @After
    public void afterScenario() {
        System.out.print("Quitting chrome driver");
        new DriverUtils().destroyDriver();

    }

}
