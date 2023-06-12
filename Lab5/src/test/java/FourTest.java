import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.junit.Test;

public class FourTest extends AbstractTest{

    @Test
    public void test4()  throws InterruptedException {



        new WebDriverWait(getDriver(), Duration.ofSeconds(10).until(ExpectedConditions.urlContains("https://www.livejournal.com")));
        Assertions.assertTrue(getDriver().getTitle().contains("Живой журнал"), "страница входа не доступна");


        Actions search = new Actions(getDriver());

        search.click(getDriver().findElement(By.xpath("//*[@id=\\\"js\\\"]/body/div[1]/div[4]/div[1]/div[1]/div/div/ul/li[1]/a")))
                .click(getDriver().findElement(By.xpath("//*[@id=\\\"js\\\"]/body/div[1]/div[4]/div[1]/div[1]/div/div/ul/li[2]/a")))
                .click(getDriver().findElement(By.xpath("//*[@id=\\\"js\\\"]/body/div[1]/div[4]/div[1]/div[1]/div/div/ul/li[3]/a")))
                .click(getDriver().findElement(By.xpath("//*[@id=\\\"js\\\"]/body/div[1]/div[4]/div[1]/div[1]/div/div/ul/li[4]/a")))
                .build()
                .perform();
        Thread.sleep(1000);


    }
}
