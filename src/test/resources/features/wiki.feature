@wikipedia
Feature: Wikipedia Search functionality Title verification

Background: Wikipedia page
  When User is on Wikipedia page

  @wiki
  Scenario: Wikipedia Search Title verification
    When User types "Steve Jobs" in the search box
    And User clicks search button
    Then User Sees "Steve Jobs" is in the title

    @wiki1
    Scenario: Wikipedia Search Header Verification
      When User types "Steve Jobs" in the search box
      And User clicks search button
      Then User sees "Steve Jobs" is in the main header

      @wiki2
      Scenario: Wikipedia Search Image header Verification
        When User types "Steve Jobs" in the search box
        And User clicks search button
        Then User sees "Steve Jobs" is in the image header