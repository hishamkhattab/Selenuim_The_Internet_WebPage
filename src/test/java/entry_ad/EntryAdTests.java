package entry_ad;

import base.BaseTests;
import org.testng.annotations.Test;

public class EntryAdTests extends BaseTests {

    @Test
    public void closeAd(){
        var entryAd = homePage.clickEntryAd();
        entryAd.closeAd();
    }
}
