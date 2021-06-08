package wait;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTests {

    @Test
    public void testWaitUntilHidden(){
        var loadingPage = homePage.clickDynamicLoading().clickExample1();
        loadingPage.clickStart();
        assertEquals(loadingPage.getLoadedText(),"Hello World!","incorrect text");
    }

    @Test
    public void testWaitUntilAppear(){
        var loadingPage = homePage.clickDynamicLoading().clickExample2();
        loadingPage.clickStartExample2();
        assertEquals(loadingPage.getLoadedText(),"Hello World!","incorrect text");
    }

    @Test
    public void testRightClick(){
        var loadedPage = homePage.clickDynamicLoading().rightClickExample2();
        getWindowManager().goTo("https://the-internet.herokuapp.com/dynamic_loading/2");
        assertEquals(loadedPage.getStartButtonText(),"Start","Incorrect text");
    }
}
