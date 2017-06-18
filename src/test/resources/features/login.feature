#Keywords Summary : Login to Facebook
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@LoginTest
Feature: Logging in Facebook
  In order to see my account
  As a user
  I want to login

  @ValidLoginTest
  Scenario: Valid User
    Given I go to facebook on "FF"
    And I enter "username" as "cucumberpassword@gmail.com"
    And I enter "password" as "password@123"
    And I click on "LoginButton"
    Then login should be "success"

  @InvalidLoginTest
  Scenario Outline: Invalid User
    Given I go to facebook on "FF"
    And I enter username as "<username>"
    And I enter password as "<password>"
    And I click on "LoginButton"
    Then I verify the "<status>" in step

    Examples: 
      | username                  | password    | status  |
      | name1                     | password1   | Fail    |
      | name2                     | password2   | Fail    |
      | cucumberpassword@gmail.com | password@123 | success |
