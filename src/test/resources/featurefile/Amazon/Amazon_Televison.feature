@Amazon
Feature: verify Add card for Amazon

Scenario: Verify the Add card for Amazon
    Given open the valid url in Amazon application
    Then  click the dropdown icon in search field
    Then  Select the Product name is department "Electronics"
    Then  Search for products by DepartMent Name "Electronics, Computers and Office"
    Then  click the search icon
    Then  click  Televisions & Video 
    Then  click the search icon
    Then  click the Televison Menu
    Then  Select television that are under inches in screen size 
    Then  Select the Price High to Low
    Then  Select the Model Year 2017
    Then  Click on the product link for the first product in search result
    Then  click the Add link icon
    Then  Verify the sigin_screen is visible or not
    Then  Enter the Username in username field "Test100"
    
    