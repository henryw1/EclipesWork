Feature: register and login
As a User
I want to create an account 
So that I can login to the system

   Scenario Outline: Search bing for google
   Given I created urser using  "<username>"  and "<password>" 
   When I navigate to the login page
   Then I login using "<username>" and "<password>" 
   
Examples:
    | username   | password |
    | John | Doe |
    | Say |MyName |
    | Djay |Khalid |
    | You | Smart |