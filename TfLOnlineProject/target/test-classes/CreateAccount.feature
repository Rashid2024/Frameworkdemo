Feature: Title of your feature
  I want to use this template for my feature file

Scenario: Account Creation workflow for Personal or Business Account

Given I am on the RUC Landing Page
When I follow create account workflow for "<accounttype>"
Then I should see account created confirmation

    Examples: 
      | accounttype  | value | status  |
      | Personal |     5 | success |
      | Business |     7 | Fail    |
