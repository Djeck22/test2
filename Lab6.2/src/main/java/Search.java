import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search extends AbstractPage{

    @FindBy(xpath = "//*[@id=\"js\"]/body/div[1]/header/div[1]/nav[2]/ul/li[1]/div/form/button/span")
    private WebElement searchbutton;

    @FindBy(xpath = "/html/body/div[1]/header/div[1]/nav[2]/ul/li[1]/div/form/div/div/input")
    private WebElement inputsearch;

    @FindBy(xpath = "//*[@id=\"js\"]/body/div[1]/header/div[1]/nav[2]/ul/li[1]/div/form/button/span")
    private WebElement inputfinalsearch;



    public Search(WebDriver driver) {
        super(driver);
    }

    public Search clicksearchbutton(){
        searchbutton.click();
        return this;
    }

    public Search clickinputsearch(){
        inputsearch.sendKeys("TestGeekBrains");
        return this;
    }


    public Search clickinputfinalsearch(){
        inputfinalsearch.click();
        return this;
    }


}
