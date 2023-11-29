@all
Feature: Test Amazon page I want to use this template for my 
feature file
 Background: 
 Given I am on Amazon Homepage
 Scenario Outline: Testing of SignIn Page
 When I click on signin button
 Then I will be on Signin Page and Capture the title of the 
page
 And I entered email id as '<emailId>' on the page
 Then I clicked on Continue button
 And I entered password as '<password>' on the page
 And I click on submit button
 Examples: 
 | emailId | password |
 | demouser123@gmail.com | demouser@123 |
 Scenario: 
 Then I start searching item
 Then now i click on searched item
 And i add the item to wishlist for further booking
 Then i close the browser