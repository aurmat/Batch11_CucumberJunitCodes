Feature: MVN repository verification
  @mvn
  Scenario: MVN repository verification
    When User is on MVN home page
    And User searches for "cucumber java"
    Then User verifies "cucumber java" is first text