package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverUtils;

/**
 * Created by thivyalakshimi on 06/08/16.
 */
public class OKTALoginPage {
    private final WebDriver driver;

    @FindBy(id = "user-signin")
    private WebElement userNameTxtBox;

    @FindBy(id = "pass-signin")
    private WebElement passwordTextBox;

    @FindBy(id = "signin-button")
    private WebElement signInBtn;

    public OKTALoginPage() {
        driver = DriverUtils.getDriver();

        PageFactory.initElements(driver, this);
    }


    public void navigateToLoginPage() {
        driver.get("https://bcgmspcatalyst.oktapreview.com/");
    }

    public void enterOktaUsername(String userName) {
        this.userNameTxtBox.sendKeys(userName);
    }

    public void enterOktaPassword(String password) {
        this.passwordTextBox.sendKeys(password);
    }

    public void clickOnSignIn() {
        this.signInBtn.click();
    }
}