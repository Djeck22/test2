import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.junit.Test;

public class ThreeTest extends AbstractTest{

    @Test
    public void test3()  throws InterruptedException {



        new WebDriverWait(getDriver(), Duration.ofSeconds(10).until(ExpectedConditions.urlContains("https://www.livejournal.com")));
        Assertions.assertTrue(getDriver().getTitle().contains("Живой журнал"), "страница входа не доступна");


        Actions search = new Actions(getDriver());

        search.click(getDriver().findElement(By.xpath("//*[@id=\"js\"]/body/div[1]/header/div[1]/nav[2]/ul/li[2]/a")))
                .findElement(By.xpath("//*[@id=\"user\"]"))
                .sendKeys("Anton_Paly")
                .findElement(By.xpath("//*[@id=\"lj_loginwidget_password\"]"))
                .sendKeys("Anton734218100299")
                .click(getDriver().findElement(By.xpath("//*[@id=\"js\"]/body/div[1]/div[3]/div/div[2]/form[1]/button")))
                .click(getDriver().findElement(By.xpath("//*[@id=\\\"js\\\"]/body/div[2]/header/div[1]/nav[2]/ul/li[4]/a/span[1]")))
                .findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/textarea"))
                .sendKeys("Test1")
                .findElement(By.xpath("//*[@id=\\\"editorWrapper\\\"]/div[1]/div[2]/div/div/div[2]/div"))
                .sendKeys("abcd")
                .click(getDriver().findElement(By.xpath("/html/body/div[6]/footer/div/div/div[2]/div[2]/button/span")))
                .build()
                .perform();
        Thread.sleep(1000);

    }
}