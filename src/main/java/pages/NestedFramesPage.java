package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {

    private WebDriver driver;

    private String topFrame = "frame-top";
    private String leftFrame = "frame-left";
    private String bottomFrame = "frame-bottom";
    private By frameText = By.tagName("body");

    public NestedFramesPage(WebDriver driver){
        this.driver = driver;
    }

    public void switchToMainParent(){
        driver.switchTo().parentFrame();
    }

    public String switchToLeftFrame(){
        driver.switchTo().frame(topFrame);
        driver.switchTo().frame(leftFrame);
        String text = getLeftFrameText();
        switchToMainParent();
        switchToMainParent();
        return text;
    }

    public String switchToBottomFrame(){
        driver.switchTo().frame(bottomFrame);
        String text = getLeftFrameText();
        switchToMainParent();
        return text;
    }

    public String getLeftFrameText(){
        return driver.findElement(frameText).getText();
    }

}
