package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage {

    private WebDriver driver;
    private By nestedFramesLink = By.linkText("Nested Frames");

    //frame_left
    public FramesPage(WebDriver driver) {
        this.driver = driver;
    }

    public NestedFramesPage clickNestedFrame(){
        driver.findElement(nestedFramesLink).click();
        return new NestedFramesPage(driver);
    }
/*





    public String getLeftFrameText(){
        switchToLeftFrame();
        String text = driver.findElement(leftFrameText).getText();
        switchToMainParent();
        return text;
    }
    */

}
