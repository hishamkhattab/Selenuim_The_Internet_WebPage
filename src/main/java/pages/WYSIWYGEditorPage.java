package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WYSIWYGEditorPage {

    private WebDriver driver;
    private String editorIframeID = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By increaseIndentButton = By.cssSelector("[title = \"Increase indent\"]");

    public WYSIWYGEditorPage(WebDriver driver) {
        this.driver = driver;
    }

    private void switchToEditArea(){
        driver.switchTo().frame(editorIframeID);

    }

    private void switchToMainArea(){
        driver.switchTo().parentFrame();
    }

    public void clearTextArea(){
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }


    public void setTextArea(String text){
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }

    public String getTextArea(){
        switchToEditArea();
        String text = driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }

    public void clickIncreaseIndentButton(){
        driver.findElement(increaseIndentButton).click();
    }
}
