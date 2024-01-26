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



    //aysegul


    //@Given("Verify whether a new account can be opened.")
    //public void verify_whether_a_new_account_can_be_opened() {


    //}
   /*
    @Given("After logging in, I should be able to verify that I can click on the feedback button and give a rating")
    public void after_logging_in_ı_should_be_able_to_verify_that_ı_can_click_on_the_feedback_button_and_give_a_rating() {
       loginPage.feedbackButton.click();
       loginPage.olumsuzPuanlama.click();
       loginPage.puanlama1.click();
       loginPage.puanlama2.click();
       loginPage.puanlama3.click();
       loginPage.puanlama4.click();
       loginPage.puanlama5.click();
       loginPage.olumluPuanlama.click();
       loginPage.puanlamayigonderButonu.click();

    }*/
    LoginPage loginPage= new LoginPage();
    private WebDriver driver;



    @When("The user provides a positive rating")
    public void userProvidesPositiveRating() {
        // Sayfa üzerindeki rating elementine pozitif bir değer atayın
        // Örneğin, elementin ID'sini kullanarak:
        // WebElement ratingElement = driver.findElement(By.id("rating"));

         loginPage.olumluPuanlama.sendKeys("olumlu");
    }

    @When("the user provides a negative rating")
    public void userProvidesNegativeRating() {
        // Sayfa üzerindeki rating elementine negatif bir değer atayın
        loginPage.olumsuzPuanlama.sendKeys("olumsuz");
    }

    @When("the user provides a numeric rating")
    public void userProvidesNumericRating() {
        // Sayfa üzerindeki rating elementine numeric bir değer atayın
    }

    @Then("the page rating should be positive")
    public void pageRatingShouldBePositive() {
        // Sayfa üzerindeki rating'i kontrol edin ve olumlu olup olmadığını doğrulayın
        // Örneğin, assert kullanarak:
        // assertEquals("Positive", ratingElement.getText());
    }

    @Then("the page rating should be negative")
    public void pageRatingShouldBeNegative() {
        // Sayfa üzerindeki rating'i kontrol edin ve olumsuz olup olmadığını doğrulayın
    }

    @Then("the page rating should be numeric")
    public void pageRatingShouldBeNumeric() {
        // Sayfa üzerindeki rating'i kontrol edin ve numerik olup olmadığını doğrulayın
    }
}


