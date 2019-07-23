#LoginWithoutExamples
Feature: Home Page

Scenario: Successful Login with Valid Credentials

Given User enters the Academy URL
When User clicks Login button
Then User enters username and password
Then User clicks Submit button
Then User should be taken to homepage
Then Closes the browser