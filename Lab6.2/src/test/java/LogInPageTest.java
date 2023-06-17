import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;

public class LogInPageTest extends AbstractTest{

    @Test
    void LogInTest(){
        LogIn mainMenu = new LogIn(getWebDriver());
        mainMenu
                .clickenter()
                .clicklogin()
                .clickpassword()
                .clickbutton();
        Assertions.assertEquals("https://www.livejournal.com/",getWebDriver().getCurrentUrl());
    }
}
