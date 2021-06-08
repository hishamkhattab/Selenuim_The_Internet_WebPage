package wysiwyg_editor;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WYSIWYGEditorTests extends BaseTests {

    @Test
    public void testWysiwyg(){
        var wysiwygEditor = homePage.clickWYSIWYGEditor();
        wysiwygEditor.clearTextArea();
        String text_1 = "Hello ";
        String text_2 = "World";
        wysiwygEditor.setTextArea(text_1);
        wysiwygEditor.clickIncreaseIndentButton();
        wysiwygEditor.setTextArea(text_2);

        assertEquals(wysiwygEditor.getTextArea(),text_1+text_2,"incorrect text");

    }
}
