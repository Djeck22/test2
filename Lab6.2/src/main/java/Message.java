
import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;

public class Message extends AbstractPage{

    @FindBy(xpath = "//*[@id=\"js\"]/body/div[1]/header/div/nav[1]/div/ul/li[3]/a")
    private WebElement top;



    public Message(WebDriver driver) {
        super(driver);
    }

    public Message clicktop(){
        top.click();
        return this;
    }


}
