Feature: Searching of various product categories should be possible along with product search

Scenario: User should be able to search for the products under books category
 Given I visit the website as a guest user
 When I select books option from the dropdown
 And I click on search icon option
 Then I should see the page with books search results
 But I should not see other product category
 
 Scenario: User should be able to search for the products under baby category
 Given I visit the website as a guest user
 When I select baby option from the dropdown
 And I click on search icon option
 Then I should see the page having heading as offers on baby products
 But I should not see other product category
 
 