package MoneyGamingRegistration.page;

import MoneyGamingRegistration.utils.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class RegistrationPage extends BrowserUtils {

    public RegistrationPage() {

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@href= '/sign-up.shtml']")
    WebElement JOIN_NOW_BTN;
    @FindBy(id = "title")
    WebElement TITLE;
    @FindBy(id = "forename")
    WebElement FIRST_NAME;
    @FindBy(xpath = "//input[@name='map(lastName)']")
    WebElement SURNAME;
    @FindBy(id= "dobDay")
    WebElement BIRTH_DAY;
    @FindBy(id = "dobMonth")
    WebElement BIRTH_MONTH;
    @FindBy(id = "dobYear")
    WebElement BIRTH_YEAR;
    @FindBy(name = "map(terms)")
    WebElement TICKBOX;
    @FindBy(id = "form")
    WebElement JOIN_BTN;
    @FindBy(xpath = "//label[@for='dob']")
    WebElement ERROR_LABEL;





    public void clickOnJoinNowButton() {

        clickWithJS(JOIN_NOW_BTN);

    }

    public void selectTitle() {
        Select select = new Select(TITLE);
        select.selectByVisibleText("Mr");
    }

    public void enterFirstName()  {
        enterText(FIRST_NAME, "Ali");
    }

    public void enterSurname() {
        enterText(SURNAME, "Pektemirli");
    }

    public void clickTickBoxButton () {
        clickWithWait(TICKBOX);
    }

    public void clickOnJoinButton () {
        clickWithWait(JOIN_BTN);
    }
    public void selectBirthDay() {
        Select select = new Select(BIRTH_DAY);
        select.selectByVisibleText("12");
    }
    public void selectBirthMonth() {
        Select select = new Select(BIRTH_MONTH);
        select.selectByVisibleText("July");
    }
    public void selectBirthYear() {
        Select select = new Select(BIRTH_YEAR);
        select.selectByVisibleText("1980");
    }



    public void getERROR_LABEL () {
        Assert.assertEquals("This field is required", ERROR_LABEL.getText());
    }

}


