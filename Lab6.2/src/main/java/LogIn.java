import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogIn extends AbstractPage{

    @FindBy(xpath = "//*[@id=\"js\"]/body/div[1]/header/div[1]/nav[2]/ul/li[2]")
    private WebElement enter;

    @FindBy(xpath = "//*[@id=\"user\"]")
    private WebElement login;

    @FindBy(xpath = "//*[@id=\"lj_loginwidget_password\"]")
    private WebElement password;

    @FindBy(xpath = "//*[@id=\"js\"]/body/div[1]/div[3]/div/div[2]/form[1]/button")
    private WebElement button;



    public LogIn(WebDriver driver) {
        super(driver);
    }

    public LogIn clickenter(){
        enter.click();
        return this;
    }

    public LogIn clicklogin(){
        login.sendKeys("Anton_Paly");
        return this;
    }

    public LogIn clickpassword(){
        password.sendKeys("Anton734218100299");
        return this;
    }

    public LogIn clickbutton(){
        button.click();
        return this;
    }


}
