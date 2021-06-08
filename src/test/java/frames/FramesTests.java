package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class FramesTests extends BaseTests {

    @Test
    public void testFrames(){
        var frames = homePage.clickFrames();
        var nestedFrame = frames.clickNestedFrame();
        String text_1 = nestedFrame.switchToLeftFrame();
        assertEquals(text_1,"LEFT","incorrect text");
        String text_2 = nestedFrame.switchToBottomFrame();
        assertEquals(text_2,"BOTTOM","incorrect text");
    }
}
