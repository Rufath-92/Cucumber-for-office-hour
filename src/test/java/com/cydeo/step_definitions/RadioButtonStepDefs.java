package com.cydeo.step_definitions;

import com.cydeo.pages.HomePage;
import com.cydeo.pages.RadioButtonPage;
import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RadioButtonStepDefs {

   // RadioButtonPage radioButtonPage = new RadioButtonPage(); --> we did it public, create object
    @Given("The users go to web page")
    public void the_users_go_to_web_page() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @When("The users click the Radio Buttons")
    public void the_users_click_the_radio_buttons() {
        HomePage.click("Radio Buttons");

    }
    @When("The users click the Hockey")
    public void the_users_click_the_hockey() {
        // radioButtonPage.radioButtonHockey.click();
        new RadioButtonPage().radioButtonHockey.click();


    }
    @Then("The users verify the hockey is checked")
    public void the_users_verify_the_hockey_is_checked() {
        //Assert.assertTrue(new RadioButtonPage().radioButtonHockey.isSelected());
        Assert.assertTrue(new RadioButtonPage().radioButtonHockey.isSelected());
    }

}
