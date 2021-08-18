Feature: User Registration on MoneyGaming

  @UserRegistration
  Scenario: User should validate required field message under the date of birth box
    Given user is on the MoneyGaming main page
    When user clicks on Join Now button
    And clicks on Job Title from the dropdown
    And enters required fields
    And checks the over the age of 18 text
    And clicks on JOIN NOW button to submit the form
    Then user should see "This field is required" message
