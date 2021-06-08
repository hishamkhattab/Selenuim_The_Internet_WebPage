package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTests {

    @Test
    public void testAcceptAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(),"You successfully clicked an alert","Result text incorrect");
    }

    @Test
    public void testDismissAlert(){
        var alertPage = homePage.clickJavaScriptAlerts();
        alertPage.triggerConfirm();
        String text = alertPage.alert_getText();
        alertPage.alert_clickToDismiss();
        assertEquals(alertPage.getResult(),"You clicked: Cancel","Result text incorrect");
    }

    @Test
    public void testPromptAlert(){
        var alertPage = homePage.clickJavaScriptAlerts();
        alertPage.triggerPrompt();
        String text = "TAU Rocks";
        alertPage.alert_sentPromptText(text);
        alertPage.alert_confirmPrompt();
        assertEquals(alertPage.getResult(),"You entered: "+text,"Result text incorrect");
    }
}
