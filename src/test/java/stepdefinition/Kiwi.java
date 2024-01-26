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
    @Given("Tests whether the titles are visible and active")
    public void tests_whether_the_titles_are_visible_and_active() {
     homePage.visibleAndActiveTest();
    }
    @Given("Click on login link and  the Google and verify that account not opened")
    public void click_on_the_login_link() {
    homePage.profileActiveTesting();
    }








































































































    @Given("Verify that I have reached the Kiwi home page by logging in")
    public void verify_that_i_have_reached_the_kiwi_home_page_by_logging_in() {

    }
    @Given("Verify whether a new account can be opened.")
    public void verify_whether_a_new_account_can_be_opened() {

    }
    @Given("As a visitor I should be able to verify that I am login")
    public void as_a_visitor_i_should_be_able_to_verify_that_i_am_login() {

    }
    @Given("After logging in, I should be able to verify that I can click on the feedback button and give a rating")
    public void after_logging_in_i_should_be_able_to_verify_that_i_can_click_on_the_feedback_button_and_give_a_rating() {

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
