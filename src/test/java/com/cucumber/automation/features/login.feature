Feature: Login
    
@login    
Scenario: Login
    Given user is on Application login Page
    When user enters username and password
    Then I verify that login was successful
     