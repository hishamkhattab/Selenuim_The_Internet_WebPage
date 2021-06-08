package forget_password;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ForgetPasswordPage;

import static org.testng.Assert.assertTrue;

public class ForgetPasswordTests extends BaseTests {

    @Test
    public void testSuccessfulRetrievingPassword(){
        ForgetPasswordPage forgetPasswordPage = homePage.clickForgetPassword();
        forgetPasswordPage.setForgetPassword("tau@example.com");
        forgetPasswordPage.clickRetrieveButton();
        assertTrue(forgetPasswordPage.getAlertText().contains("Internal Server Error"),"\"Alert text is incorrect\"");
    }
}
