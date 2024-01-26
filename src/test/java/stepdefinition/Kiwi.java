package stepdefinition;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Kiwi {
    HomePage homePage = new HomePage();

    @Given("Open the browser and go to {string}")
    public void open_the_browser_and_go_to(String url) {
        homePage.goToKiwiUrl(url);

    }
    @Given("Verify that the Kiwi page is opened.")
    public void verify_that_the_kiwi_page_is_opened() {
        homePage.verifyKiwiPage();
    }
    @Given("Close the browser")
    public void close_the_browser() {
        Driver.quitDriver();
    }
    @Given("Accept the cookies")
    public void accept_the_cookies() {
        homePage.acceptCookie();
    }


    @Given("It is tested whether {string}, {string}, {string}, {string} in the Footer section are displayed.")
    public void it_is_tested_whether_in_the_footer_section_are_displayed(String instagram, String twitter, String linkedin, String facebook) {
        homePage.iconsDisplayTest();

    }
    @Given("It is tested whether {string}, {string}, {string}, {string} in the Footer section are active.")
    public void it_is_tested_whether_in_the_footer_section_are_active(String instagram, String twitter, String linkedin, String facebook) {
        homePage.iconsActiveTest();
    }

    //Gulsah =>US_04
    @Given("Choose where to go from where")
    public void choose_where_to_go_from_where() {
     homePage.FromCityButton.clear();
        ReusableMethods.bekle(1);
     homePage.FromCityButton.sendKeys(ConfigReader.getProperty("toCity")+ Keys.ENTER);
        ReusableMethods.bekle(1);
       // homePage.ToCityButton.clear();
       // ReusableMethods.bekle(1);
       // homePage.ToCityButton.sendKeys("Manchester"+Keys.ENTER);
       // ReusableMethods.bekle(1);
    }
    @Given("Click on the Search button")
    public void click_on_the_search_button() {
     homePage.SearchButton.click();
    }
    @Given("Verify that the best,chepest and fastest button are visible")
    public void verify_that_the_best_chepest_and_fastest_button_are_visible() {

    }
    //US_06
    @Given("It is tested {string}, {string}, {string}, {string} in the Footer section are displayed.")
    public void it_is_tested_in_the_footer_section_are_displayed(String Company, String Platform, String Help, String Discover) {
        homePage.footerDisplayTest();
    }

}
