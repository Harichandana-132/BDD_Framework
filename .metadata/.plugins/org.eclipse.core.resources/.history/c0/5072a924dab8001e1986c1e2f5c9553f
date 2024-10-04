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
@tag
Feature: Login
 
  @tag1
  Scenario: Sucessful login with valid credentials
    Given User launch chrome browser
    And user opens URL "https://admin-demo.nopcommerce.com/login"
    When user Enter Email as "admin@yourstore.com" and password as "admin"
    And Click on login
    Then Page Title should be "Dashboard / nopCommerce administration"
    When User click on logout
    And close browser
Scenario Outline: Login Data driven
 Given User launch chrome browser
    And user opens URL "https://admin-demo.nopcommerce.com/login"
    When user Enter Email as "<email>" and password as "<password>"
    And Click on login
    Then Page Title should be "Dashboard / nopCommerce administration"
    When User click on logout
    Then Page Title should be "Your store. Login"
    And close browser

  Examples:
     | email               | password |
     | admin@yourstore.com | Admin    |
     |admin@yourstoe.com   | Admin     |
