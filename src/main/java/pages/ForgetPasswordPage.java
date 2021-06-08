package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Collection;

public class ForgetPasswordPage {
    private WebDriver driver;
    private By emailField = By.id("email");
    private By retrieveButton = By.id("form_submit");

    public ForgetPasswordPage(WebDriver driver){
        this.driver = driver;
    }

    public void setForgetPassword(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public void clickRetrieveButton(){
        driver.findElement(retrieveButton).click();
    }

    public String getAlertText() {
        return driver.findElement(By.tagName("h1")).getText();
    }
}
