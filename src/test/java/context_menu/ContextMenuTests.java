package context_menu;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ContextMenuTests extends BaseTests {

    @Test
    public void testContextMenu(){
        var contextMenu = homePage.clickContextMenu();
        contextMenu.rightClickInBox();
        String text = contextMenu.alert_getPopUpText();
        contextMenu.alert_acceptPopUp();
        assertEquals(text,"You selected a context menu","Incorrect text");
    }
}
