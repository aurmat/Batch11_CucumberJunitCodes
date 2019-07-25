Feature: Thunder_Phoenix verification
  @FreeRides
  Scenario: Thunder_Phoenix ride sharing verification
    When User is on ThunderPhoenix web application
    Then User clicks on Register Now button (Free Rides To North Sides)
    And User should be on the Free Rides To North Side page
    Then User should click on Buy Tickets button
    And User should be able to select quantity and Checkout
    Then User should be able to Register
    And User should be on the Thank You page
    Then User should add the event to the calendar choosing the calendar type
    And  User should get the email confirmation


