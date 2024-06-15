#Author: your.email@your.domain.com
#Keywords Summary :
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
Feature: Register

  @tag1
  Scenario: Verify that user is able to register
    Given User launches the Chrome browser
    When  User opens the url "https://demo.nopcommerce.com/"
    And User clicks on the RegisterButton
    Then User selects the Gender
    And The user enter FirstName as "Prajwal"
    And The user enter LastName as "Kumar"
    And User selects the day as "20"
    And User selects the month as "June"
    And User selects the year as "1998"
    And The user enters email as "prajwalprakash20@gmail.com"
    And The user enter CompanyName as "Self"
    And The user enter Password as "1234567890"
    And The user enter ConfirmPassword as "1234567890"
    Then The User clicks on the RegisterButton
    And  User wait for sometime
    
   

  
