import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.junit.Test;

public class SixTest extends AbstractTest{

    @Test
    public void test6()  throws InterruptedException {



        new WebDriverWait(getDriver(), Duration.ofSeconds(10).until(ExpectedConditions.urlContains("https://www.livejournal.com")));
        Assertions.assertTrue(getDriver().getTitle().contains("Живой журнал"), "страница входа не доступна");


        Actions search = new Actions(getDriver());

        search.click(getDriver().findElement(By.xpath("//*[@id=\"js\"]/body/div[3]/div[4]/div[1]/div[1]/div/div/ul/li[6]/a")))
                .click(getDriver().findElement(By.xpath("//*[@id=\"js\"]/body/div[1]/div[4]/div[1]/section[1]/div/div[1]/div[1]/div[1]/div/div/article/a")))
                .click(getDriver().findElement(By.xpath("/html/body/div/div/div[3]/div[8]/svg[1]/path")))
                .build()
                .perform();
        Thread.sleep(1000);


    }
}