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

    @FindBy(className = "newUser green")
    WebElement JOIN_NOW_BTN;
    @FindBy(className = "title required")
    WebElement TITLE;
    @FindBy(id = "forename")
    WebElement FIRST_NAME;
    @FindBy(xpath = "//input[@name='map(lastName)']")
    WebElement SURNAME;
    @FindBy(className = "dobDay inline required")
    WebElement BIRTH_DAY;
    @FindBy(className = "dobMonth inline required")
    WebElement BIRTH_MONTH;
    @FindBy(className = "dobYear inline required")
    WebElement BIRTH_YEAR;
    @FindBy(xpath = "/html/body/noscript/text()")
    WebElement TICKBOX;
    @FindBy(className = "promoReg green")
    WebElement JOIN_BTN;
    @FindBy(css = "[for='dob']")
    WebElement ERROR_LABEL;


    WebElement iframe;


    public void clickOnJoinNowButton() {

        clickWithWait(JOIN_NOW_BTN);

    }

    public void selectTitle() {
        Select select = new Select(TITLE);
        select.selectByVisibleText("Ms");
    }

    public void enterFirstName() {
        enterText(FIRST_NAME, "Ali");
    }

    public void enterSurname() {
        enterText(SURNAME, "Pek");
    }

    public void clickTickBoxButton () {
        clickWithWait(TICKBOX);
    }

    public void clickOnJoinButton () {
        clickWithWait(JOIN_BTN);
    }

    public void BirthYear() {
        Select select = new Select(BIRTH_YEAR);
        select.selectByVisibleText("1980");
    }

    public void BirthMonth() {
        Select select = new Select(BIRTH_MONTH);
        select.selectByVisibleText("10");
    }
    public void selectBirthDay() {
        Select select = new Select(BIRTH_DAY);
        select.selectByVisibleText("12");
    }
    public void getERROR_LABEL () {
        Assert.assertEquals("This field is required", ERROR_LABEL.getText());
    }

}


