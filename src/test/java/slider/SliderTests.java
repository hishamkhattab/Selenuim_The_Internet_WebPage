package slider;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SliderTests extends BaseTests {

    @Test
    public void testSlider(){
        var slider = homePage.clickHorizontalSlider();
        var result = slider.getResult();
        for (int i=0; i<8; i++){
            slider.enterValue();
        }
        assertEquals(slider.getResult(),"4");
    }
}
