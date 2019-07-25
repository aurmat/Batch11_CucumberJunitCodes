@back
Feature: google title verification
User Story: US44

  Background: Login to Google
    When User is on Google search page
  @google
  Scenario: google search verification
    When User is on Google search page
    And User searches for apples
    Then User should see inside of the title

    @new
    Scenario: Google title verification with preferred data
      When User is on Google search page
      And User searches for the word "iphone"
      Then User should see the word "iphone" inside of the title

      @dataType
    Scenario: Google Title Test
      Given User tests with words "apple" "pen" "paper"
      Then User checks numbers 12 and 55
