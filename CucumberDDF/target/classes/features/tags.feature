Feature: Cucumber Tags

@SmokeTest @RegressionTest
Scenario: Open the browser
Given User enters the Academy URL

@SmokeTest @RegressionTest
Scenario: Login with valid credentials
Given User clicks Login button

@RegressionTest
Scenario: User enters credentials
Given User enters username and password

@RegressionTest
Scenario: User submits the form
Given User clicks Submit button

@RegressionTest
Scenario: User enters homepage
Given User should be taken to homepage

@SmokeTest @RegressionTest
Scenario: User clicks About menu
Given User should be taken to About page

@SmokeTest
Scenario: User clicks Network menu
Given User should be taken to Network page


Scenario: User closes the browser
Given Closes the browser