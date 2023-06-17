import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class News extends AbstractPage{

    @FindBy(xpath = "//*[@id=\"js\"]/body/div[1]/header/div[1]/nav[2]/ul/li[2]")
    private WebElement enter;

    @FindBy(xpath = "//*[@id=\"user\"]")
    private WebElement login;

    @FindBy(xpath = "//*[@id=\"lj_loginwidget_password\"]")
    private WebElement password;

    @FindBy(xpath = "//*[@id=\"js\"]/body/div[1]/div[3]/div/div[2]/form[1]/button")
    private WebElement button;

    @FindBy(xpath = "//*[@id=\"js\"]/body/div[4]/div[3]/div[1]/section[1]/div/div/div/div[1]/div[1]/div[1]/div/div/div/div/div/ul/li[1]/button")
    private WebElement newnews;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div[2]/textarea")
    private WebElement Zag;

    @FindBy(xpath = "//*[@id=\"editorWrapper\"]/div[1]/div[2]/div/div/div[2]/div")
    private WebElement word;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div[4]/div[2]/div/button/span")
    private WebElement opb;

    public News(WebDriver driver) {
        super(driver);
    }

    public News clickenter(){
        enter.click();
        return this;
    }

    public News clicklogin(){
        login.sendKeys("Anton_Paly");
        return this;
    }

    public News clickpassword(){
        password.sendKeys("Anton734218100299");
        return this;
    }

    public News clickbutton(){
        button.click();
        return this;
    }

    public News clicknewnews(){
        newnews.click();
        return this;
    }

    public News clickZag(){
        Zag.sendKeys("GeekBrains");
        return this;
    }

    public News clickword(){
        word.sendKeys("AABBCCDD");
        return this;
    }

    public News clickopb(){
        opb.click();
        return this;
    }

}
