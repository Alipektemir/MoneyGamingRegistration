$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/registration.feature");
formatter.feature({
  "line": 1,
  "name": "User Registration on MoneyGaming",
  "description": "",
  "id": "user-registration-on-moneygaming",
  "keyword": "Feature"
});
formatter.before({
  "duration": 28540673800,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User should validate required field message under the date of birth box",
  "description": "",
  "id": "user-registration-on-moneygaming;user-should-validate-required-field-message-under-the-date-of-birth-box",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@UserRegistration"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is on the MoneyGaming main page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user clicks on Join Now button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "clicks on Job Title from the dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "enters required fields",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "checks the over the age of 18 text",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "clicks on JOIN NOW button to submit the form",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user should see \"This field is required\" message",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationSteps.user_is_on_the_MoneyGaming_main_page()"
});
formatter.result({
  "duration": 219641900,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.user_clicks_on_Join_Now_button()"
});
formatter.result({
  "duration": 21500073200,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.clicks_on_Job_Title_from_the_dropdown()"
});
formatter.result({
  "duration": 127354200,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.enters_required_fields()"
});
formatter.result({
  "duration": 2510393900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "18",
      "offset": 27
    }
  ],
  "location": "RegistrationSteps.checks_the_over_the_age_of_text(int)"
});
formatter.result({
  "duration": 117965300,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.clicks_on_JOIN_NOW_button_to_submit_the_form()"
});
formatter.result({
  "duration": 138410700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "This field is required",
      "offset": 17
    }
  ],
  "location": "RegistrationSteps.user_should_see_message(String)"
});
formatter.result({
  "duration": 46247000,
  "status": "passed"
});
formatter.after({
  "duration": 1222141700,
  "status": "passed"
});
});