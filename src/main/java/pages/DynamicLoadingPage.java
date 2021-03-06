package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicLoadingPage {

    private WebDriver driver;
    private String linkXpath_Format = ".//a[contains(text(), '%s')]";
    private By link_Example1 = By.xpath(String.format(linkXpath_Format, "Example 1"));
    private By link_Example2 = By.xpath(String.format(linkXpath_Format, "Example 2"));

    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public DynamicallyLoadedPage clickExample1(){
        driver.findElement(link_Example1).click();
        return new DynamicallyLoadedPage(driver);
    }

    public DynamicallyLoadedPage clickExample2(){
        driver.findElement(link_Example2).click();
        return new DynamicallyLoadedPage(driver);
    }

    public DynamicallyLoadedPage rightClickExample2(){
        //Actions actions = new Actions(driver);
        //actions.moveToElement(driver.findElement(link_Example2)).sendKeys(Keys.chord(Keys.CONTROL));
        driver.findElement(link_Example2).sendKeys(Keys.CONTROL, Keys.ENTER);
        //driver.findElement(link_Example2).click();
        return new DynamicallyLoadedPage(driver);
    }

}
