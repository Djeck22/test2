import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Media extends AbstractPage{

    @FindBy(xpath = "//*[@id=\"js\"]/body/div[1]/div[4]/div[1]/div[1]/div/div/ul/li[6]/a")
    private WebElement video;

    @FindBy(xpath = "/html/body/div[4]/div[3]/div[1]/section[1]/div/div[1]/div[1]/div[1]/div/div/article/a")
    private WebElement onevideo;

    @FindBy(xpath = "/html/body/div/div/div[3]/div[8]")
    private WebElement videoplay;


    public Media(WebDriver driver) {
        super(driver);
    }

    public Media clickvideo(){
        video.click();
        return this;
    }

    public Media clickonevideon(){
        onevideo.click();
        return this;
    }

    public Media clickvideoplay(){
        videoplay.click();
        return this;
    }


}
