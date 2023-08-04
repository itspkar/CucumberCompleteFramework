 Feature: Visit Ebay and apply filter tags
 
 Scenario: Applying filters on Cell Phones & Smartphones category
 
 
    Given I am on the eBay homepage
    When I navigate to Electronics > Cell Phones & Accessories
    And I click on "Cell Phones & Smartphones"
    And I click on "See All" under "Shop by brand" or "Shop by Network"
    And I apply filters for screen size, Price, and Item location
    Then I should see the filter tags applied