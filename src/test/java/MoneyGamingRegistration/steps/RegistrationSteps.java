package MoneyGamingRegistration.steps;

import MoneyGamingRegistration.page.RegistrationPage;

import cucumber.api.java.en.*;

public class RegistrationSteps {

    RegistrationPage registration = new RegistrationPage();

    @Given("^user is on the MoneyGaming main page$")
    public void user_is_on_the_MoneyGaming_main_page() {

    }

    @When("^user clicks on Join Now button$")
    public void user_clicks_on_Join_Now_button()  {
        registration.clickOnJoinNowButton();

    }

    @When("^clicks on Job Title from the dropdown$")
    public void clicks_on_Job_Title_from_the_dropdown() {
        registration.selectTitle();

    }
    @When("^enters required fields$")
    public void enters_required_fields(){
        registration.enterFirstName();
        registration.enterSurname();
        registration.BirthYear();
        registration.BirthMonth();

    }
    @When("^checks the over the age of (\\d+) text$")
    public void checks_the_over_the_age_of_text(int arg1) {
        registration.clickTickBoxButton();

       registration.selectBirthDay();

    }

    @When("^clicks on JOIN NOW button to submit the form$")
    public void clicks_on_JOIN_NOW_button_to_submit_the_form() {
        registration.clickOnJoinButton();
    }

    @Then("^user should see \"([^\"]*)\" message$")
    public void user_should_see_message(String arg1){
        registration.getERROR_LABEL();
    }

}
