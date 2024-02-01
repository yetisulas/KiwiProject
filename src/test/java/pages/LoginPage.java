package pages;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {


    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//*[@class='orbit-button-primitive-content inline-block [justify-content:var(--button-content-align)] text-start flex-1'])[1]")
    public WebElement oturumAcButonu;

    @FindBy (xpath = "(//*[@class='orbit-button-primitive-content inline-block [justify-content:var(--button-content-align)] text-start flex-1 w-[var(--button-content-width)]'])[1]")
    public WebElement epostaButonu;

    @FindBy (xpath = "(//*[@class='orbit-button-primitive-content inline-block [justify-content:var(--button-content-align)] text-start flex-1 w-[var(--button-content-width)]'])[2]")
    public WebElement facebookButonu;

    @FindBy (xpath = "(//*[@class='orbit-button-primitive-content inline-block [justify-content:var(--button-content-align)] text-start flex-1 w-[var(--button-content-width)]'])[3]")
    public WebElement googleButonu;

    @FindBy (xpath = "(//*[@class='orbit-button-primitive-content inline-block [justify-content:var(--button-content-align)] text-start flex-1 w-[var(--button-content-width)]'])[4]")
    public WebElement appleButonu;

    @FindBy (xpath = "//*[@data-test='feedbackButton']")
    public WebElement feedbackButton;

    @FindBy (xpath = "//*[text()='1 – Tamamen olumsuz']")
    public WebElement olumsuzPuanlama;

    @FindBy (xpath = "(//*[text()='1'])[3]")
    public WebElement puanlama1;

    @FindBy (xpath = "//*[text()='2']")
    public WebElement puanlama2;

    @FindBy (xpath = "//*[text()='3']")
    public WebElement puanlama3;

    @FindBy (xpath = "//*[text()='4']")
    public WebElement puanlama4;

    @FindBy (xpath = "//*[text()='5']")
    public WebElement puanlama5;

    @FindBy (xpath = "//*[text()='5 – Tamamen olumlu']")
    public WebElement olumluPuanlama;

    @FindBy (xpath = "(//*[@class='orbit-button-primitive-content inline-block [justify-content:var(--button-content-align)] flex-1'])[19]")
    public WebElement puanlamayigonderButonu;

    @FindBy (xpath = "(//*[text()='Teşekkürler! Kabul ederseniz gelecekteki anketlerimizden biri için sizinle irtibata geçebiliriz.'])[1]")
    public WebElement tesekkurlerYazisi;










     @FindBy(xpath = "(//*[@class='Icon__StyledIcon-sc-psgqgs-0 etxBjy'])[1]")
    public WebElement UcCizgiButonu;
    @FindBy(xpath = "((//*[@class='orbit-button-primitive-content inline-block [justify-content:var(--button-content-align)] text-start flex-1'])[1]")
    public WebElement OturumAcButonu;
    @FindBy(xpath = "(//*[@class='orbit-button-primitive-content inline-block [justify-content:var(--button-content-align)] text-start flex-1 w-[var(--button-content-width)]'])[1]")
    public WebElement ePostaButonu;
    @FindBy(xpath = "(//*[@class='orbit-button-primitive-content inline-block [justify-content:var(--button-content-align)] text-start flex-1 w-[var(--button-content-width)]'])[2]")
    public WebElement facebookButonu2;
    @FindBy(xpath = "(//*[@class='orbit-button-primitive-content inline-block [justify-content:var(--button-content-align)] text-start flex-1 w-[var(--button-content-width)]'])[3]")
    public WebElement googleButonu2;
    @FindBy (xpath = "(//*[@class='orbit-button-primitive-content inline-block [justify-content:var(--button-content-align)] text-start flex-1 w-[var(--button-content-width)]'])[4]")
    public WebElement appleButonu2;






}


