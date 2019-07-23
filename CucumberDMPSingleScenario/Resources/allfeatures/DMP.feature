Feature: Home Page
  In order to test Home Page of application
  As a Segment user
  I want to specify the features of home page

 Scenario: Home page verification
 Given User enters the DMP URL
 When User clicks SignUp/Login button
 And User enters Email and Password
 Then User should be taken to home page
 When User clicks Deploy Tags tab
 Then User should be taken to Deploy Tags section
 When User clicks Account Info tab
 Then User should be taken to Account Info section
 When User clicks Company Info tab
 Then User should be taken to Company Info section
 When User clicks Billing Info tab
 Then User should be taken to Billing Info section
 
 Scenario Outline: Logo menu verification
 Given User clicks user logo
 Then User should view the menus
 When User clicks <menu items>
 Then User should be taken to <section>
 Examples:
 
 | menu items   | section     |
 | My Segments  | My Segments |
 | Deploy Tags  | Deploy Tags |
 | Account Info | Account Info|
 | Company Info | Company Info|
 | Billing Info | Billing Info|
 
 Scenario: My Segments tab verification
 Given User clicks My Segments tab
 When User clicks filters link
 Then User should be redirected to filters page
 When User clicks the top logo
 And User clicks Segment link with zero records
 Then User should be redirected to filters page with prefilled data
 When User clicks the top logo
 And User clicks Segment link with any number of records
 Then User should be redirected to filters page with prefilled data
 
 Scenario: Deploy Tags tab verification
 Given User clicks the top logo
 When User clicks Deploy Tags tab in home page
 When User clicks Goodharvest link
 Then User should be redirected to Goodharvest page
 When User clicks General Parameters link
 Then User should be redirected to General Parameters page
 When User clicks Tracking Specific Events link
 Then User should be redirected to Tracking Specific Events page
 
 Scenario: Account Info tab verification
 Given User clicks Account Info tab in home page
 When User enters Password and Confirm Password
 And User clicks Save button in Account Info
 Then Success message should be displayed to the user
 
 Scenario: Company Info tab verification
 Given User clicks Company Info tab in home page
 When User select value from the company dropdown
 And User clicks Save button in Company Info
 Then Success message should be displayed to the user
 
 Scenario: Billing Info tab verification
 Given User clicks Billing Info tab in home page
 When User updates the zip code in zip field
 And User clicks Save button in Billing Info
 Then Success message should be displayed to the user
 
 Scenario: Filters page verification
 Given User clicks My Segments tab
 When User clicks filters link
 Then User should be redirected to filters page
 When User tries to save the segment without any options
 Then New Segment should be created with blank options
 When User tries to save the segment by selecting any of the options
 Then New Segment should be created with selected options
 When User selects any segment with zero records
 Then User should see corresponding segment without Export CTA
 When User selects any segment with records
 Then User should see corresponding segment with Export CTA
 When User clicks Export CTA
 Then User should be able to download the respective segment records in selected format
 When User clicks close icon in Segment record
 Then User should see blank filter page