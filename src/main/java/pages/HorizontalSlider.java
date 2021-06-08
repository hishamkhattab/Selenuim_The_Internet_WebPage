package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSlider {
    private WebDriver driver;
    private By slider = By.tagName("input");
    private By sliderResult = By.id("range");

    public HorizontalSlider(WebDriver driver) {
        this.driver = driver;
    }

    public void enterValue(){
        driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
    }

    public String getResult(){
        return driver.findElement(sliderResult).getText();
    }
}
