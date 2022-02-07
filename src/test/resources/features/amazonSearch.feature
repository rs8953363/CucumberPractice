Feature: Amazon Search
  @amazonSearch
  Scenario: TC01_user searches a product on Amazon website
    Given user goes to Amazon webpage
    And user types iphone in the search box
    Then user results are shown on the screen