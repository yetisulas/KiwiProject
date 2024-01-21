package stepdefinition;

import io.cucumber.java.en.Given;
import pages.HomePage;

public class Kiwi {

























































































































HomePage homePage = new HomePage();







    @Given("Open the browser and go to {string}")
    public void open_the_browser_and_go_to(String url) {
        homePage.goTokiwiUrl(url);
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


}
