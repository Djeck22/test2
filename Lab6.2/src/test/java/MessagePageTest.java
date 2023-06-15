
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;

public class MessagePageTest extends AbstractTest{

    @Test
    void MessageTest(){
        Message mainMenu = new Message(getWebDriver());
        mainMenu
                .clicktop();
        Assertions.assertEquals("https://www.livejournal.com/",getWebDriver().getCurrentUrl());
    }
}
