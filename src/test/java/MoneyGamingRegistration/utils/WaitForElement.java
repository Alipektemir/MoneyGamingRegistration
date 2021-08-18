package MoneyGamingRegistration.utils;

import com.google.common.base.Preconditions;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class WaitForElement {

    public static final By MODAL_POP_UP = By.cssSelector("div.modal-dialog");
    private final By SPINNER = By.cssSelector("[data-test='spinner']");
    private final By LOADING_DIALOG = By.cssSelector("[data-test='loading-dialog']");
    private final int DEFAULT_TIMEOUT = 30;

    private WebDriver driver;
    private WebDriverWait wait;

    public WaitForElement(WebDriver driver) {
        this.driver = Preconditions.checkNotNull(driver);
        wait = new WebDriverWait(driver, DEFAULT_TIMEOUT);
    }

    public WaitForElement sleepFor(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this;
    }

    public WaitForElement waitForPageToLoad() {
        new WebDriverWait(driver, DEFAULT_TIMEOUT).until(
                webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
        return this;
    }

    public WaitForElement waitForTextToBePresent(By location, String text) {
        wait.until(ExpectedConditions.textToBePresentInElementLocated(location, text));
        return this;
    }

    public WaitForElement waitForTextToBePresent(WebElement element, String text) {
        wait.until(ExpectedConditions.textToBePresentInElement(element, text));
        return this;
    }

    public WaitForElement waitForElementToBePresent(By location) {
        wait.until(ExpectedConditions.presenceOfElementLocated(location));
        return this;
    }

    public WaitForElement waitForElementToBeInvisible(By location) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(location));
        return this;
    }

    public WaitForElement waitForElementToBeInvisible(WebElement location) {
        wait.until(ExpectedConditions.not(ExpectedConditions.visibilityOf(location)));
        return this;
    }

    public WaitForElement waitForProcessingModalToDisappear() {
        wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(MODAL_POP_UP));
        return this;
    }

    public WaitForElement waitForElementToBeVisible(By location) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(location));
        return this;
    }

    public WaitForElement waitForElementToBeVisible(WebElement location) {
        wait.until(ExpectedConditions.visibilityOf(location));
        return this;
    }

    public WaitForElement waitForAttributeToContain(By location, String attribute, String text) {
        wait.until(ExpectedConditions.attributeContains(location, attribute, text));
        return this;
    }

    public WaitForElement waitForAttributeToContain(WebElement location, String attribute, String text) {
        wait.until(ExpectedConditions.attributeContains(location, attribute, text));
        return this;
    }

    public WaitForElement waitForAttributeNotToContain(WebElement location, String attribute, String text) {
        wait.until(ExpectedConditions.not(ExpectedConditions.attributeContains(location, attribute, text)));
        return this;
    }

    public WaitForElement waitForElementToBeClickable(By location) {
        wait.until(ExpectedConditions.elementToBeClickable(location));
        return this;
    }

    public WaitForElement waitForElementToBeClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        return this;
    }

    public WaitForElement waitForElementNotToBeClickable(WebElement element) {
        wait.until(ExpectedConditions.not(ExpectedConditions.elementToBeClickable(element)));
        return this;
    }

    public WaitForElement waitForTiles() {
        List<WebElement> listOfElements = driver.findElements(By.cssSelector("main.dash > div > div > div.col-md-12"));

        for (int i = 0; i < listOfElements.size(); i++) {
            wait.until(ExpectedConditions.elementToBeClickable(listOfElements.get(i)));
        }
        return this;
    }

    public WaitForElement waitForVisibilityOfAllElements(List<WebElement> location) {
        wait.until(ExpectedConditions.visibilityOfAllElements(location));
        return this;
    }

    public WaitForElement waitForImagesToLoad(WebElement container) {
        boolean loaded = false;
        int count = 0;
        JavascriptExecutor js = (JavascriptExecutor) driver;

        while (!loaded || !container.isDisplayed()) {
            List<WebElement> listOfElements = container.findElements(By.cssSelector("button:first-of-type img"));

            for (WebElement element : listOfElements) {
                //Checks if the image is actually loaded by looking at if it is complete and if the naturalWidth of the image is greater than 0.
                if (!(Boolean) js.executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", element)) {
                    loaded = false;
                    sleepFor(500);
                    count++;
                    break;
                } else {
                    loaded = true;
                }
            }

            if (count == 90) {
                throw new TimeoutException("Images are not loaded!");
            }
        }
        return this;
    }

    public WaitForElement waitForSingleImageToLoad(By selector) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        int count = 0;
        //Checks if the image is actually loaded by looking at if it is complete and if the naturalWidth of the image is greater than 0.
        while (!(Boolean) js.executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0",
                driver.findElement(selector))) {
            if (count == 20) {
                throw new TimeoutException("Image is not loaded!");
            }

            sleepFor(500);
            count++;
        }
        return this;
    }

    public WaitForElement waitForSingleImageToLoad(WebElement element) {
        waitForSpinner();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        int count = 0;

        //Checks if the image is actually loaded by looking at if it is complete and if the naturalWidth of the image is greater than 0.
        while (!(Boolean) js.executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0",
                element)) {
            if (count == 20) {
                throw new TimeoutException("Image is not loaded!");
            }

            sleepFor(500);
            count++;
        }
        return this;
    }

    public WaitForElement waitForPrintPagesToLoad(By selector) {
        int count = 0;

        while (driver.findElements(selector).size() <= 1) {
            if (count == 20) {
                throw new TimeoutException("Additional print pages loaded");
            }

            sleepFor(500);
            count++;
        }

        return this;
    }

    public WaitForElement waitUntilConsumerLeadAppears(String quoteName) {
        int count = 0;

        while (driver.findElements(By.cssSelector("div.ContractorBids table > tbody")).stream().noneMatch(customer -> customer.findElement(By.cssSelector("tr > td:nth-child(3)")).getText().equals(quoteName))) {
            if (count == 20) {
                throw new TimeoutException("Consumer Lead [" + quoteName + "] not found!");
            }

            driver.navigate().refresh();
            sleepFor(1000);
            count++;
        }
        return this;
    }

    public WaitForElement waitUntilQuoteNameAppears(String quoteName) {
        int count = 0;

        while (driver.findElements(By.cssSelector("div.MyOrders table > tbody > tr")).stream().noneMatch(customer ->
                customer.findElements(By.cssSelector("td:nth-child(1) > a")).size() > 0
                        ? customer.findElement(By.cssSelector("td:nth-child(1) > a")).getText().contains(quoteName)
                        && (!customer.findElement(By.cssSelector("td.currency > span")).getText().equals("$0.00"))
                        : customer.findElement(By.cssSelector("td:nth-child(1)")).getText().contains(quoteName)
                        && (!customer.findElement(By.cssSelector("td.currency > span")).getText().equals("$0.00")))) {
            if (count == 20) {
                throw new TimeoutException("Quote Name [" + quoteName + "] not found!");
            }

            driver.navigate().refresh();
            sleepFor(1000);
            count++;
        }
        return this;
    }

    public WaitForElement waitForSpinner() {
        sleepFor(200);
        List<WebElement> spinners = driver.findElements(SPINNER);
        if (spinners.isEmpty()) {
            return this;
        }

        new WebDriverWait(driver, 120).until(ExpectedConditions.invisibilityOfElementLocated(SPINNER));

        return this;
    }

    public WaitForElement waitForLoadingDialog() {
        sleepFor(200);
        List<WebElement> spinners = driver.findElements(LOADING_DIALOG);
        if (spinners.isEmpty()) {
            return this;
        }

        new WebDriverWait(driver, 30).until(ExpectedConditions.invisibilityOfElementLocated(LOADING_DIALOG));

        return this;
    }

    public WaitForElement waitUntilConsumerBidAppears(String bidName) {
        int count = 0;

        while (driver.findElements(By.cssSelector("div.ConsumerBids table > tbody")).stream().noneMatch(customer -> customer.findElement(By.cssSelector("tr > td:nth-child(1)")).getText().equals(bidName))) {
            if (count == 20) {
                throw new TimeoutException("Consumer Bid [" + bidName + "] not found!");
            }

            driver.navigate().refresh();
            sleepFor(1000);
            count++;
        }
        return this;
    }

    public WaitForElement waitUntilAvailableCalendarDate() {
        int count = 0;

        do {
            sleepFor(500);
            List<WebElement> listOfWeeks = driver.findElements(By.cssSelector("div.DayPicker div.CalendarMonth[data-visible='true'] tbody > tr"));

            for (WebElement week : listOfWeeks) {
                List<WebElement> listOfDays = week.findElements(By.tagName("td"));

                for (WebElement day : listOfDays) {
                    if (!day.getAttribute("class").contains("blocked")) {
                        return this;
                    }
                }
            }

            count++;
        } while (count < 20);

        throw new TimeoutException("Available dates are not displayed!");
    }

    public WaitForElement waitForTheModalToDisappear() {
        int count = 0;

        while (driver.findElements(By.cssSelector("body.modal-open")).size() > 0
                || driver.findElements(By.cssSelector("div.fade.in.modal")).size() > 0
                || driver.findElements(By.cssSelector("div.fade.modal-backdrop.in")).size() > 0
                || driver.findElements(By.cssSelector("div.fade.adv-warning.in.modal")).size() > 0
                || driver.findElements(By.cssSelector("div[role='dialog']")).size() > 0
                || driver.findElements(By.cssSelector("[data-test='loading-dialog']")).size() > 0) {
            if (count == 120) {
                throw new TimeoutException("Modal did not disappear!");
            }

            sleepFor(500);
            count++;
        }
        sleepFor(500);
        return this;
    }

    public WaitForElement waitForPurchaseDialogToDisappear() {
        int count = 0;

        while (driver.findElements(By.cssSelector("[data-test='executing-purchase-dialog']")).size() > 0) {
            if (count == 120) {
                throw new TimeoutException("Modal did not disappear!");
            }

            sleepFor(500);
            count++;
        }
        sleepFor(500);
        return this;
    }

    public WaitForElement waitForTheModalToAppear() {
        int count = 0;

        do {
            if (count == 20) {
                throw new TimeoutException("Modal did not appear!");
            }
            sleepFor(500);
            count++;
        } while (driver.findElements(By.cssSelector("body.modal-open")).isEmpty()
                || driver.findElements(By.cssSelector("div.modal-dialog")).isEmpty()
                || driver.findElements(By.cssSelector("div.fade.modal-backdrop.in")).isEmpty());
        return this;
    }

    public WaitForElement waitForTheCoreModalToAppear() {
        int count = 0;

        do {
            if (count == 20) {
                throw new TimeoutException("Modal did not appear!");
            }
            sleepFor(500);
            count++;
        } while (driver.findElements(By.cssSelector("div.MuiDialog-root")).isEmpty() || driver.findElements(By.cssSelector("div[class^='MuiPaper-root']")).isEmpty());
        return this;
    }

    public boolean didTheModalToAppear() {
        int count = 0;

        while (driver.findElements(By.cssSelector("body.modal-open")).size() == 0
                || driver.findElements(By.cssSelector("div.modal-dialog")).size() == 0
                || driver.findElements(By.cssSelector("div.fade.modal-backdrop.in")).size() == 0
                || driver.findElements(By.cssSelector("div[role='dialog']")).size() == 0) {
            if (count == 5) {
                return false;
            }

            sleepFor(500);
            count++;
        }
        return true;
    }

    public WaitForElement waitForOptions(By location) {
        int count = 0;

        while (driver.findElements(location).size() == 0) {
            if (count == 20) {
                throw new NotFoundException("List of elements are empty!");
            }

            sleepFor(1000);
            count++;
        }
        return this;
    }

    public WaitForElement waitForFrameToBeAvailable(WebElement location) {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(location));
        return this;
    }

}
