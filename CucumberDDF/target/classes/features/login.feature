#LoginWithExamples
Feature: Home Page

Scenario Outline: Successful Login with Valid Credentials

Given User enters the Academy URL
When User clicks Login button
Then User enters "<username>" and "<password>"
Then User clicks Submit button
Then User should be taken to homepage
Then Closes the browser

Examples:
	
	| username | password |
	| admin    | fl33t    |
	| jalizha  | test123  |
	| admin    | fl33t    |


#Scenario: Verification of header menus

#Given User clicks About menu
#Then User should be taken to About page
#Given User clicks Our Network menu
#Then User should be taken to Our Network page
#Given User clicks Calendar menu
#Then User should be taken to Events pages*/