package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenu {

    private WebDriver driver;
    private By hotSpotBox = By.id("hot-spot");

    public ContextMenu(WebDriver driver) {
        this.driver = driver;
    }


    public void rightClickInBox(){
        WebElement contextBox = driver.findElement(hotSpotBox);
        Actions actions = new Actions(driver);
        actions.moveToElement(contextBox).contextClick().perform();
    }

    public String alert_getPopUpText(){
        return driver.switchTo().alert().getText();
    }

    public void alert_acceptPopUp(){
        driver.switchTo().alert().accept();
    }

}
