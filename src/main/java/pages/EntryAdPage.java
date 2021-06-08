package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class EntryAdPage {

    private WebDriver driver;
    private By closeButton = By.cssSelector("div.modal-footer p");

    public EntryAdPage(WebDriver driver) {
        this.driver = driver;
    }


    public void closeAd() {
        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(closeButton));
        actions.moveToElement(driver.findElement(closeButton)).click().perform();
    }
}