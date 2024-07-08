

Feature: Application Login
Background: 
Given Setup the entries in database
When launch the browser from config variables
And hit the home page url of banking site

@RegressionTest
Scenario: Admin Page default login
Given User is on NetBanking landing page
When User login into application with "admin" and password "1234"
Then Home Page is displayed
And Cards are displayed

@RegressionTest @SmokeTest
Scenario: User Page default login
Given User is on NetBanking landing page
When User login into application with user and password 4567
Then Home Page is displayed
And Cards are displayed

@SmokeTest
Scenario Outline: User Page default login
Given User is on NetBanking landing page
When User login into application with "<Username>" and password "<Password>" 
Then Home Page is displayed
And Cards are displayed
Examples:
| Username | Password |
| debituser| hello12 |
|credituser| alo123|

Scenario: User Page default Sign up
Given User is on Practice landing page
When User Signup into application
| rahul |
| shetty |
| contact@email.com  |
| 12332222|
Then Home Page is displayed
And Cards are displayed