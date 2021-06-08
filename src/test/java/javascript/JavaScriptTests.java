package javascript;

import base.BaseTests;
import org.testng.annotations.Test;

public class JavaScriptTests extends BaseTests {

    @Test
    public void testScrollToTable(){
        var largeDom = homePage.clickLargeAndDeepDoom();
        largeDom.scrollToTable();
    }

    @Test
    public void testScrollToFifthParagraph(){
        var infiniteScroll = homePage.clickInfiniteScroll();
        infiniteScroll.scrollToParagraph(5);
    }
}
