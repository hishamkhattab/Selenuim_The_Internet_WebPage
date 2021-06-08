package file_upload;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload(){
        var fileUpload = homePage.clickFileUpload();
        fileUpload.uploadFile("D:\\WorkSpace\\TestAutomation\\webDriverSelenuim\\resources\\chromedriver.exe");
        assertEquals(fileUpload.getUploadedFiles(),"chromedriver.exe","incorrent text");
    }
}
