package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {

    private WebDriver driver;
    private By inputFile = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private By uploadedFiles = By.id("uploaded-files");



    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Provides path of file to the form then clicks upload button
     * @param absolutePathOfFile the complete path of the file to upload
     */
    public void uploadFile(String absolutePathOfFile){
        driver.findElement(inputFile).sendKeys(absolutePathOfFile);
        clickUploadButton();
    }

    public void clickUploadButton(){
        driver.findElement(uploadButton).click();
    }

    public String getUploadedFiles(){
        return driver.findElement(uploadedFiles).getText();
    }


}
