package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {


    public LoginPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }
     @FindBy(xpath = "(//*[@class='Icon__StyledIcon-sc-psgqgs-0 etxBjy'])[1]")
    public WebElement UcCizgiButonu;
    @FindBy(xpath = "((//*[@class='orbit-button-primitive-content inline-block [justify-content:var(--button-content-align)] text-start flex-1'])[1]")
    public WebElement OturumAcButonu;
    @FindBy(xpath = "(//*[@class='orbit-button-primitive-content inline-block [justify-content:var(--button-content-align)] text-start flex-1 w-[var(--button-content-width)]'])[1]")
    public WebElement ePostaButonu;
    @FindBy(xpath = "(//*[@class='orbit-button-primitive-content inline-block [justify-content:var(--button-content-align)] text-start flex-1 w-[var(--button-content-width)]'])[2]")
    public WebElement facebookButonu;
    @FindBy(xpath = "(//*[@class='orbit-button-primitive-content inline-block [justify-content:var(--button-content-align)] text-start flex-1 w-[var(--button-content-width)]'])[3]")
    public WebElement googleButonu;
    @FindBy (xpath = "(//*[@class='orbit-button-primitive-content inline-block [justify-content:var(--button-content-align)] text-start flex-1 w-[var(--button-content-width)]'])[4]")
    public WebElement appleButonu;





}
