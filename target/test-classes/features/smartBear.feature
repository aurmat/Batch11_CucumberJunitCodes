@sb
Feature: SmartBear order process
  #TC #27: SmartBear order process
  Scenario Outline: Smart Bear order process
  Given User is logged into SmartBear Tester account and on Order page
  When User fills out the form as followed from the table below
  And User selects "<product>" from product dropdown
  And User enters "<quantity>" to quantity
  And User enters "<customerName>" to costumer name
  And User enters "<street>" to street
  And User enters "<city>" to city
  And User enters "<state>" to state
  And User enters "<zip>" to zip
  And User selects "<cardType>" as card type
  And User enters "<cardNumber>" to card number
  And User enters "<expiration>" date”to expiration date
  And User clicks process button
  Then User verifies "<costumerName>" is in the list

    Examples: Filling out Order Page
    |product |quantity |customerName |street | city | state | zip | cardType | cardNumber | expiration | costumerName|
    |myMoney  |1       |Ken Adams    |Kinzie st| Chicago | IL | 60004 | Visa | 313313133315| 12/22     | Ken Adams   |

