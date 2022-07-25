
@tag
Feature: Testing Facebook Website
 
  Scenario: Testing HomePage Of Facebook
    Given User is on Homepage of facebook
    Then User Typing UserName
    And  User Typing Password
    Then Validating LogIn Button is Enable
    Then Clicking on LogIn Button
    Then Validating LogIn Page Title
    Then Validating UserName 
   
