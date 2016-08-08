package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverUtils;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * Created by thivyalakshimi on 06/08/16.
 */
public class HomePage {
    private final WebDriver driver;

    @FindBy(id = "pageTitle")
    private WebElement pageTitle;


    public HomePage() {
        driver = DriverUtils.getDriver();

        PageFactory.initElements(driver, this);
    }

    public void verifyPageTitle() {
        assertThat("Stringeerw").isEqualTo("Recipes");



    }
}


