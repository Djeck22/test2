import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;

public class SerfPageTest extends AbstractTest{

    @Test
    void SerfTest(){
        Serf mainMenu = new Serf(getWebDriver());
        mainMenu
                .clicknewpeople()
                .clickmedia()
                .clicksummer()
                .clickbeauty();
        Assertions.assertEquals("https://www.livejournal.com/",getWebDriver().getCurrentUrl());
    }
}
