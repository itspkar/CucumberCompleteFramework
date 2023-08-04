Feature: Access a Product via Search

  Scenario: Access a Product via Search
  
    Given I am navigating to the Ebay website
    When I type "MacBook" in the search bar
    And I change the Search category to "Computers/Tablets & Networking"
    And I click the Search button
    Then the page should load completely
    And the first result name should match "MacBook"