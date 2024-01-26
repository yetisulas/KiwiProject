package stepdefinition;

import io.cucumber.java.en.Given;
import pages.HomePage;
import utilities.Driver;

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

































































































































    @Given("Click on the feedback button")
    public void click_on_the_feedback_button() {

    }
    @Given("Verify that give a rating")
    public void verify_that_give_a_rating() {

    }





}
