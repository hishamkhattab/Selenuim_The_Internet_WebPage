package hover;

import base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.HoversPage;

import static org.testng.Assert.*;


public class HoverTests extends BaseTests {

    @Test
    public void testHoverUser1(){
        var hoversPage = homePage.clickHover();
        var caption = hoversPage.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisplayed(),"Caption not displayed");
        assertEquals(caption.getTitle(),"name: user1", "Caption title incorrect");
        assertEquals(caption.getLinkText(),"View profile", "Caption link text incorrect");
        assertTrue(caption.getLink().endsWith("/users/1"),"Caption link text incorrect");
    }

    @Test
    public void testHoverUser2(){
        var hoversPage = homePage.clickHover();
        var caption = hoversPage.hoverOverFigure(2);
        assertTrue(caption.isCaptionDisplayed(),"Caption not displayed");
        assertEquals(caption.getTitle(),"name: user2", "Caption title incorrect");
        assertEquals(caption.getLinkText(),"View profile", "Caption link text incorrect");
        assertTrue(caption.getLink().endsWith("/users/2"),"Caption link text incorrect");
    }

    @Test
    public void testHoverUser3(){
        var hoversPage = homePage.clickHover();
        var caption = hoversPage.hoverOverFigure(3);
        assertTrue(caption.isCaptionDisplayed(),"Caption not displayed");
        assertEquals(caption.getTitle(),"name: user3", "Caption title incorrect");
        assertEquals(caption.getLinkText(),"View profile", "Caption link text incorrect");
        assertTrue(caption.getLink().endsWith("/users/3"),"Caption link text incorrect");


    }
}
