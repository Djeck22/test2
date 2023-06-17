import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SearchPageTest extends AbstractTest{

    @Test
    void SearchTest(){
        Search mainMenu = new Search(getWebDriver());
        mainMenu
                .clicksearchbutton()
                .clickinputsearch()
                .clickinputfinalsearch();
        Assertions.assertEquals("https://www.livejournal.com/",getWebDriver().getCurrentUrl());
    }
}