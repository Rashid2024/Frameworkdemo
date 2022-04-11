Feature: Login into Sauce application

  Scenario Outline: User should only be able to login with valid credentials
    Given I navigate to appliction URL
    When I enter user as "<username>" and password as "<password>"
    And I click login button
    Then User should be able to login based "<expected>" status

    Examples: 
      | username        | password     | expected |
      | standard_user   | secret_sauce | success  |
      | standarduser    | adamsecret   | Fail     |
      | locked_out_user | secret_sauce | Fail     |
