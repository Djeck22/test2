import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Serf extends AbstractPage {

    @FindBy(xpath = "//*[@id=\"js\"]/body/div[1]/div[4]/div[1]/div[1]/div/div/ul/li[1]/a")
    private WebElement newpeople;

    @FindBy(xpath = "//*[@id=\"js\"]/body/div[1]/div[4]/div[1]/div[1]/div/div/ul/li[2]/a")
    private WebElement media;

    @FindBy(xpath = "//*[@id=\"js\"]/body/div[1]/div[4]/div[1]/div[1]/div/div/ul/li[3]/a")
    private WebElement summer;

    @FindBy(xpath = "//*[@id=\"js\"]/body/div[1]/div[4]/div[1]/div[1]/div/div/ul/li[4]/a")
    private WebElement beauty;



    public Serf(WebDriver driver) {
        super(driver);
    }



    public Serf clicknewpeople(){
        newpeople.click();
        return this;
    }

    public Serf clickmedia(){
        media.click();
        return this;
    }

    public Serf clicksummer(){
        summer.click();
        return this;
    }

    public Serf clickbeauty(){
        beauty.click();
        return this;
    }




}
