
@tag
Feature: Testing SignUp Page Of FaceBook
  
 
  Scenario Outline: User Filling Details
    Given user is on HomePage
    Then validate the button create new account is enable
    Then user click on button create new account
    Then Validate the SignUp Page title
    Then User Entering "<First_Name>" and "<Surname>"
    Then User Wrighting "<Mobile_No>" and "<New_Password>"
    Then User giving Date Of Birth
    Then User Giving Gender
    
    Examples:
   |First_Name| Surname | Mobile_No  | New_Password  |
   |Prasad    | Arewar  | 7588590402 | prasad123     |
   |Sharad    | Arewar  | 7588590401 | prasad1234    |
   |Sadhana   | Arewar  | 7588590400 | prasad234     |
   