package stepdefinition;


import io.cucumber.java.en.Given;

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

    @Given("Click on the feedback button")
    public void click_on_the_feedback_button() {
      homePage.feedbackButtonClick();
    }
    @Given("Verify that give a rating")
    public void verify_that_give_a_rating() {
      homePage.pointCheck();
    }

    //Gulsah =>US_04
    @Given("Verify that the go-return and economy button is visible")
    public void verify_that_the_go_return_and_economy_button_is_visible() {
        homePage.GoReturnButton.isDisplayed();
        homePage.EconomyButton.isDisplayed();
    }

    //US_06
    @Given("It is tested {string}, {string}, {string}, {string} in the Footer section are displayed.")
    public void it_is_tested_in_the_footer_section_are_displayed(String Company, String Platform, String Help, String Discover) {
        homePage.footerDisplayTest();
    }


}
