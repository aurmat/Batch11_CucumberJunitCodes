@so
Feature: Wikipedia Search functionality Title verification

  Scenario Outline: Wikipedia Search Title verification
    Given User is on Wikipedia homepage
    When User types "<searchKey>" in the search box
    And User clicks search button
    Then User Sees "<title>" is in the title

    Examples: Test data for search functionality
    |searchKey     |title        |
    |Steve Jobs    |Steve Jobs   |
    |Ricky Martin  |Ricky Martin |
    |Lada Gaga     |Lady Gaga    |
    |Lionel Messi  |Lionel Messi |
    #this is for examples and 2 rows with 2 different data