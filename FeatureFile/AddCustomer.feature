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

Feature: Add new Customer
@regression1
 Scenario: Verify that user is able to add new customer
    Given User Launch Chrome Browser 
    When User opens url "https://admin-demo.nopcommerce.com/login"
    And  User enter Email as "admin@yourstore.com" and Password as "admin"
    And  Click on Login
    Then The Page Title should be "Dashboard / nopCommerce administration"
    When User click on the Customer from the sidemenu
    And  User selects the Customer section
    When User clicks on Add NewButton
    When  User enters Email as "prajwalprakash002@gmail.com"
     And  User enters Password as "1234567890" 
     And  User enters Firstname as "Prajwal" 
     And User enters Lastname as "Kumar" 
     And  User enters Gender as Male 
     And User enters DateofBirth as "20061998"
     And User enters CompanyName as"Self" 
    And  User selects is Tax Exempt
    And  User selects newsletter from the DropDown
    And  User selects ManagerofVendor from the Dropdown
    And  User enter Admin Comments as "No Comments"
    When User clicks on the SaveButton
    And  User should wait
  