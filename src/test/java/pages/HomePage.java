package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.ReusableMethods.bekle;
import static utilities.ReusableMethods.switchToWindow;

public class HomePage {
    Actions actions;

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "(//*[@class='Icon__StyledIcon-sc-psgqgs-0 etxBjy'])[28]")
    public WebElement instagramIcon;

    @FindBy(xpath = "(//*[@class='Icon__StyledIcon-sc-psgqgs-0 etxBjy'])[29]")
    public WebElement twitterIcon;

    @FindBy(xpath = "(//*[@class='Icon__StyledIcon-sc-psgqgs-0 etxBjy'])[30]")
    public WebElement linkedinIcon;
    @FindBy(xpath = "(//*[@class='Icon__StyledIcon-sc-psgqgs-0 etxBjy'])[31]")
    public WebElement facebookIcon;

    @FindBy(xpath = "//*[text()='Kabul et']")
    public WebElement acceptCookies;
    public void acceptCookie(){

        acceptCookies.click();
    }

    public void goToKiwiUrl(String url){
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    public void verifyKiwiPage(){
        String expectedTitle = "Kiwi.com";
        String actualTitle = Driver.getDriver().getTitle();
        assertTrue(actualTitle.contains(expectedTitle));
    }

    public void iconsDisplayTest(){
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
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
    public void iconsActiveTest(){
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

}
