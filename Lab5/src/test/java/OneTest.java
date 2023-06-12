import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.junit.Test;

public class OneTest extends AbstractTest{

    @Test
    public void test1()  throws InterruptedException {



        new WebDriverWait(getDriver(), Duration.ofSeconds(10).until(ExpectedConditions.urlContains("https://www.livejournal.com")));
        Assertions.assertTrue(getDriver().getTitle().contains("Живой журнал"), "страница входа не доступна");


        Actions search = new Actions(getDriver());

        search.click(getDriver().findElement(By.xpath("//*[@id=\"js\"]/body/div[1]/header/div[1]/nav[2]/ul/li[2]/a")))
                .findElement(By.xpath("//*[@id=\"user\"]"))
                .sendKeys("Anton_Paly")
                .findElement(By.xpath("//*[@id=\"lj_loginwidget_password\"]"))
                .sendKeys("Anton734218100299")
                .click(getDriver().findElement(By.xpath("//*[@id=\"js\"]/body/div[1]/div[3]/div/div[2]/form[1]/button")))
                .build()
                .perform();
        Thread.sleep(1000);

    }
}
