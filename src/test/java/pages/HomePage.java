package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class HomePage {


    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    public void goTokiwiUrl(String url){
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }
}
