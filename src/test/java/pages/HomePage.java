package pages;


import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.plugin.event.Node;




import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;


import static org.junit.Assert.assertTrue;
import static utilities.ReusableMethods.bekle;
import static utilities.ReusableMethods.switchToWindow;


public class HomePage {
    Actions actions;
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();

    public HomePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//*[@data-test='Footer-IconInstagram']")
    public WebElement instagramIcon;

    @FindBy(xpath = "//*[@data-test='Footer-IconTwitter']")
    public WebElement twitterIcon;

    @FindBy(xpath = "//*[@data-test='Footer-IconLinkedin']")
    public WebElement linkedinIcon;
    @FindBy(xpath = "//*[@data-test='Footer-IconFacebook']")
    public WebElement facebookIcon;

    @FindBy(xpath = "//*[text()='Kabul et']")
    public WebElement acceptCookies;

    @FindBy(xpath = "(//img[@title='Kiwi.com ucuz uçuşlar sunar'])[1]")
    public WebElement kiviCom;

    @FindBy(xpath = "(//div[text()='Seyahat'])[2]")
    public WebElement seyahatElement;

    @FindBy(xpath = "(//div[text()='Araçlar'])[2]")
    public WebElement araclarElement;

    @FindBy(xpath = "(//div[text()='Konaklamalar'])[2]")
    public WebElement konaklamalarElement;

    @FindBy(xpath = "(//div[text()='Stories'])[2]")
    public WebElement storiesElement;

    @FindBy(xpath = "(//div[text()='Seyahat sırları'])[2]")
    public WebElement seyahatsirlariElement;

    @FindBy(xpath = "(//div[text()='Fırsatlar'])[2]")
    public WebElement firsatlarElement;


    @FindBy(xpath = "(//div[text()='Oturum aç'])[1]")
    public WebElement login;

    @FindBy(xpath = "//div[text()='Google']")
    public WebElement google;
    @FindBy(xpath = "//div[text()='E-posta']")
    public WebElement ePostaLink;

    @FindBy(xpath = "//input[@inputmode='email']")
    public WebElement eMail;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement devamlink;
    @FindBy(xpath = "//*[text()='Oturum açın']")
    public WebElement oturumAc;
    @FindBy(xpath = "//input[@type='email']")
    public WebElement emailsend;
    @FindBy(xpath = "//*[text()='Sonraki']")
    public WebElement sonrakibutton;

    @FindBy(xpath = "(//div[@role='presentation'])[1]")
    public WebElement oturumAcilamadi;



    public void acceptCookie() {

        acceptCookies.click();
    }

    public void goToKiwiUrl(String url) {

        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    public void verifyKiwiPage() {
        String expectedTitle = "Kiwi.com";
        String actualTitle = Driver.getDriver().getTitle();
        assertTrue(actualTitle.contains(expectedTitle));
    }

    public void iconsDisplayTest() {

        bekle(1);

        jse.executeScript("arguments[0].scrollIntoView(true);", instagramIcon);
        bekle(2);
        assertTrue(instagramIcon.isDisplayed());
        bekle(1);
        assertTrue(twitterIcon.isDisplayed());
        bekle(1);
        assertTrue(linkedinIcon.isDisplayed());
        bekle(1);
        assertTrue(facebookIcon.isDisplayed());
        bekle(1);

    }

    public void iconsActiveTest() {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        bekle(1);


        jse.executeScript("arguments[0].scrollIntoView(true);", instagramIcon);
        bekle(1);
        instagramIcon.click();
        bekle(1);
        switchToWindow("instagram.com");
        bekle(1);
        Driver.getDriver().navigate().back();
        bekle(1);

        jse.executeScript("arguments[0].scrollIntoView(true);", twitterIcon);
        bekle(1);
        twitterIcon.click();
        bekle(1);
        switchToWindow("twitter.com");
        bekle(1);
        Driver.getDriver().navigate().back();
        bekle(1);

        jse.executeScript("arguments[0].scrollIntoView(true);", linkedinIcon);
        bekle(1);
        linkedinIcon.click();
        bekle(1);
        switchToWindow("linkedin.com");
        bekle(1);
        Driver.getDriver().navigate().back();
        bekle(1);

        jse.executeScript("arguments[0].scrollIntoView(true);", facebookIcon);
        bekle(1);
        facebookIcon.click();
        bekle(1);
        switchToWindow("facebook.com");
        bekle(1);


    }





    @FindBy(xpath = "//h2[text()='Teşekkürler! Kabul ederseniz gelecekteki anketlerimizden biri için sizinle irtibata geçebiliriz.']")
    public WebElement thanksText;
    @FindBy (xpath = "//*[@data-test='feedbackButton']")
    public WebElement feedbackButton;
    @FindBy (xpath = "//*[text()='3']")
    public WebElement threePoint;
    @FindBy(xpath ="//*[text()='Gönder']")
    public  WebElement submitButton;

    public void feedbackButtonClick(){
        feedbackButton.click();
        bekle(1);
    }
    public void pointCheck(){
        threePoint.click();
        submitButton.click();
        bekle(1);
        System.out.println(thanksText.getText());
        bekle(1);
        String actualText = thanksText.getText();
        assertTrue(actualText.contains("Teşekkürler! Kabul ederseniz gelecekteki anketlerimizden biri için sizinle irtibata geçebiliriz."));
    }

    //Gulsah
//US_04
    @FindBy(xpath = "(//*[text()='Gidiş Dönüş'])[1]")
    public WebElement GoReturnButton;

    @FindBy(xpath = "(//*[text()='Ekonomi'])[2]")
    public WebElement EconomyButton;

//US_06
    @FindBy(xpath = "//h4[normalize-space()='Şirket']")
    public  WebElement CompanyButton;

    @FindBy(xpath = "//h4[normalize-space()='Platform']")
    public  WebElement PlatformButton;

    @FindBy(xpath = "//h4[normalize-space()='Yardım ve destek']")
    public  WebElement YardimveDestekButton;

    @FindBy(xpath = "//h4[normalize-space()='Keşfet']")
    public  WebElement KesfetButton;

    public void footerDisplayTest(){
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        bekle(1);

        jse.executeScript("arguments[0].scrollIntoView(true);", instagramIcon);
        bekle(2);
        assertTrue(CompanyButton.isDisplayed());
        bekle(1);
        assertTrue(PlatformButton.isDisplayed());
        bekle(1);
        assertTrue(YardimveDestekButton.isDisplayed());
        bekle(1);
        assertTrue(KesfetButton.isDisplayed());
        bekle(1);}




    public void visibleAndActiveTest() {
        System.out.println(kiviCom.getText());
        assertTrue(kiviCom.isEnabled());
        System.out.println(seyahatElement.getText());
        assertTrue(seyahatElement.isEnabled());
        System.out.println(araclarElement.getText());
        assertTrue(araclarElement.isEnabled());
        System.out.println(konaklamalarElement.getText());
        assertTrue(konaklamalarElement.isEnabled());
        System.out.println(storiesElement.getText());
        assertTrue(storiesElement.isEnabled());
        System.out.println(seyahatsirlariElement.getText());
        assertTrue(seyahatsirlariElement.isEnabled());
        System.out.println(firsatlarElement.getText());
        assertTrue(firsatlarElement.isEnabled());

    }

    public void profileActiveTesting() {
          bekle(2);
          login.click();
          bekle(2);
          jse.executeScript("arguments[0].scrollIntoView(true);", google);
          bekle(2);
          google.click();
          bekle(1);
          Driver.getDriver().switchTo().newWindow(WindowType.TAB);
          Driver.getDriver().get("https://mail.google.com/mail/u/2/?ogbl#inbox");
          bekle(1);
          emailsend.click();
          emailsend.sendKeys("askfedakarlikister@gmail.com");
          sonrakibutton.click();
          assertTrue(oturumAcilamadi.isDisplayed());
          bekle(3);
          System.out.println(oturumAcilamadi.getText());
    }

   @FindBy(xpath = "//*[text()='Kabul et']")
   public WebElement cerezKabul;


    @FindBy(xpath = "//*[text()='Tek aramada tüm uçuşlar']")
    public WebElement tekAramadaTumUcuslar;

    @FindBy(xpath = "//*[text()='Daha fazla seyahat edin, daha az harcayın']")
    public WebElement dahaFazlaSeyahatEdin;
    @FindBy(xpath = "//*[text()='Milyonlarca kullanıcının güvendiği platform']")
    public WebElement milyonlarcaKullanici;
    @FindBy(xpath = "(//h2[@class='orbit-heading font-base m-0 text-heading-foreground text-heading-title2 leading-heading-title2 font-heading-title2 text-start mb-xs'])[1]")
    public WebElement ankaracikisli;
    @FindBy(xpath = "//h2[@class='orbit-heading font-base m-0 text-heading-foreground text-heading-title1 leading-heading-title1 font-heading-title1 text-start mb-md']")
    public WebElement mobilUygulamamiz;

    @FindBy(xpath = "(//h2[@class='orbit-heading font-base m-0 text-heading-foreground text-heading-title2 leading-heading-title2 font-heading-title2 text-start mb-xs'])[2]")
    public WebElement populerUcuslar;

    @FindBy(xpath = "//h2[@class='orbit-heading font-base m-0 text-heading-foreground text-heading-title2 leading-heading-title2 font-heading-title2 text-start mb-sm']")
    public WebElement ucuzUcuslar;

    @FindBy(xpath = "(//img[@class='absolute m-auto block h-0 max-h-full min-h-full w-0 min-w-full max-w-full border-none p-0 safe-inset-0'])[1]")
    public WebElement tekAramaResim;
    public void tekAramadaTumUcuslar() {
        cerezKabul.click();
        jse.executeScript("arguments[0].scrollIntoView(true);", tekAramaResim);
        bekle(2);
        assertTrue(tekAramadaTumUcuslar.isDisplayed());
        System.out.println(tekAramadaTumUcuslar.getText());

    }
    public void dahaFazlaSeyahatEdin() {

        assertTrue(dahaFazlaSeyahatEdin.isDisplayed());

    }
    public void milyonlarcaKullanici() {

        assertTrue(milyonlarcaKullanici.isDisplayed());
    }
    public void ankaracikisli() {

        assertTrue(ankaracikisli.isDisplayed());
    }
    public void mobilUygulamamiz() {

        assertTrue(mobilUygulamamiz.isDisplayed());
    }
    public void populerUcuslar() {
        bekle(2);
        jse.executeScript("arguments[0].scrollIntoView(true);", populerUcuslar);
        bekle(2);
        assertTrue(populerUcuslar.isDisplayed());
    }
    public void ucuzUcuslar() {
        bekle(2);
        jse.executeScript("arguments[0].scrollIntoView(true);", ucuzUcuslar);
        bekle(2);
        assertTrue(ucuzUcuslar.isDisplayed());
    }
    @FindBy(xpath = "(//div[@class='absolute safe-inset-0 de:translate-y-0 de:transition-transform de:duration-normal de:group-hover:-translate-y-1/4'])[1]")
    public WebElement istanbulBodyElementi;

    @FindBy(xpath = "(//div[@class='absolute bg-gradient-to-b from-[rgba(0,0,0,0)] via-[rgba(0,0,0,0.2)] via-45% to-[rgba(0,0,0,0.6)] safe-inset-0'])[2]")
    public WebElement abüDabiBodyElementi;
    @FindBy(xpath = "(//div[@class='absolute bg-gradient-to-b from-[rgba(0,0,0,0)] via-[rgba(0,0,0,0.2)] via-45% to-[rgba(0,0,0,0.6)] safe-inset-0'])[3]")
    public WebElement podgoricaBodyElementi;
    @FindBy(xpath = "(//div[@class='orbit-button-primitive-content inline-block [justify-content:var(--button-content-align)] flex-1'])[11]")
    public WebElement dahaFazlasiniOkuBodyElementi;

    public void istanbulBodyElementi() {
        cerezKabul.click();
        jse.executeScript("arguments[0].scrollIntoView(true);", istanbulBodyElementi);
        assertTrue(istanbulBodyElementi.isEnabled());
        System.out.println(istanbulBodyElementi.getText());
    }

    public void abüDabiBodyElementi() {
        assertTrue(abüDabiBodyElementi.isEnabled());
    }

    public void podgoricaBodyElementi() {

        assertTrue(podgoricaBodyElementi.isEnabled());
    }

    public void dahaFazlasiniOkuBodyElementi()
    {
        assertTrue(dahaFazlasiniOkuBodyElementi.isEnabled());
    }


    public void goTokiwiUrl(String url){
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }


}

