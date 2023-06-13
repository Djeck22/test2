import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.junit.Test;

public class TwoTest extends AbstractTest{

    @Test
    public void test2()  throws InterruptedException {



        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("https://www.livejournal.com"));
        Assertions.assertTrue(getDriver().getTitle().contains("Живой журнал"), "страница входа не доступна");


        Actions search = new Actions(getDriver());

        search.click(getDriver().findElement(By.xpath("//*[@id=\\\"js\\\"]/body/div[1]/header/div[1]/nav[2]/ul/li[1]/div/form/button/span")))
                .click((WebElement) By.xpath("/html/body/div[1]/header/div[1]/nav[2]/ul/li[1]/div/form/div/div/input")).sendKeys("TestGeekBrains")
                .click(getDriver().findElement(By.xpath("//*[@id=\\\"js\\\"]/body/div[1]/header/div[1]/nav[2]/ul/li[1]/div/form/button/span")))
                .build()
                .perform();
        Thread.sleep(1000);

    }
}