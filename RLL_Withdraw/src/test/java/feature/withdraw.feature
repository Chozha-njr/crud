
@tag
Feature: Login page

  Background:
    Given User navigates to the URL
    When User performs the login process
    
    
  Scenario Outline: user perform withdraw Test
    Given User clicks on withdraw link
    Then select DropDown button and test
    And check RestButton 
    Then check withdraw with no value in input
    Then check withdraw with invalid amount "<Amount>"
    And give valid amount and deposite
    
    
    
    Examples:
      | Amount            |
      |  0                |
      |1000000000000000.00|
      
    
   