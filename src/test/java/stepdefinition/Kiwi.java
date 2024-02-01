package stepdefinition;


import io.cucumber.java.en.Given;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.w3c.dom.html.HTMLInputElement;

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

    @Then("It should be verified that the heading All flights in one search appears at the bottom of the home page.")
    public void ıt_should_be_verified_that_the_heading_all_flights_in_one_search_appears_at_the_bottom_of_the_home_page() {
        homePage.tekAramadaTumUcuslar();
    }


    @Then("It should be verified that the heading Travel more, spend less appears at the bottom of the home page.")
    public void ıt_should_be_verified_that_the_heading_travel_more_spend_less_appears_at_the_bottom_of_the_home_page() {
        homePage.dahaFazlaSeyahatEdin();
    }

    @Then("It should be verified that the title Platform trusted by millions of users appears at the bottom of the home page.")
    public void ıt_should_be_verified_that_the_title_platform_trusted_by_millions_of_users_appears_at_the_bottom_of_the_home_page() {
        homePage.milyonlarcaKullanici();
    }

    @Then("Verify that the heading Popular destinations from Ankara appears at the bottom of the home page.")
    public void verify_that_the_heading_popular_destinations_from_ankara_appears_at_the_bottom_of_the_home_page() {
        homePage.ankaracikisli();
    }

    @When("It should be verified that the title Get better from Kiwi.com with our mobile app appears at the bottom of the homepage.")
    public void ıt_should_be_verified_that_the_title_get_better_from_kiwi_com_with_our_mobile_app_appears_at_the_bottom_of_the_homepage() {
        homePage.mobilUygulamamiz();
    }

    @When("It should be verified that the Popular flights” heading appears at the bottom of the home page.")
    public void ıt_should_be_verified_that_the_popular_flights_heading_appears_at_the_bottom_of_the_home_page() {
        homePage.populerUcuslar();
    }

    @When("Verify that the Cheap flights heading appears at the bottom of the homepage.")
    public void verify_that_the_cheap_flights_heading_appears_at_the_bottom_of_the_homepage() {
        homePage.ucuzUcuslar();
    }

    @Then("The user must verify the activation of the İstanbul body element on the home page.")
    public void the_user_must_verify_the_activation_of_the_istanbul_body_element_on_the_home_page() {
        homePage.istanbulBodyElementi();
    }

    @Then("User must verify the activation of the Abu Dabi body element on the home page")
    public void user_must_verify_the_activation_of_the_abu_dabi_body_element_on_the_home_page() {
        homePage.abüDabiBodyElementi();
    }

    @Then("User must verify the activation of the Podgorica body element on the home page")
    public void user_must_verify_the_activation_of_the_podgorica_body_element_on_the_home_page() {
        homePage.podgoricaBodyElementi();
    }

  //  @When("User must verify the activation of the Bakü body element on the home page")
    //public void user_must_verify_the_activation_of_the_bakü_body_element_on_the_home_page() {
      //  homePage.bakuBodyElementi();
    //}


    @When("User must verify the activation of the Daha fazlasini oku body element on the home page")
    public void user_must_verify_the_activation_of_the_daha_fazlasini_oku_body_element_on_the_home_page() {
     homePage.dahaFazlasiniOkuBodyElementi();


    @Given("Click on the feedback button")
    public void click_on_the_feedback_button() {
      homePage.feedbackButtonClick();
    }
    @Given("Verify that give a rating")
    public void verify_that_give_a_rating() {
      homePage.pointCheck();

    }
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
