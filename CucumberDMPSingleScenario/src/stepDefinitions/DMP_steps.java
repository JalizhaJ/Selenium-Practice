package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import script.DMP_mainscript;

public class DMP_steps {
	
	DMP_mainscript func = new DMP_mainscript();

	@Given("^User enters the DMP URL$")
	public void user_enters_the_DMP_URL() throws Throwable {
		func.launchBrowser();
	}

	@When("^User clicks SignUp/Login button$")
	public void user_clicks_SignUp_Login_button() throws Throwable {
	    func.clicklogin();
	}

	@When("^User enters Email and Password$")
	public void user_enters_Email_and_Password() throws Throwable {
	    func.entercredentials();
	}

	@Then("^User should be taken to home page$")
	public void user_should_be_taken_to_home_page() throws Throwable {
	    func.homepage();
	}

	@When("^User clicks Deploy Tags tab$")
	public void user_clicks_Deploy_Tags_tab() throws Throwable {
	    func.deploytags();
	}

	@Then("^User should be taken to Deploy Tags section$")
	public void user_should_be_taken_to_Deploy_Tags_section() throws Throwable {
	    func.viewDeployTags();
	}

	@When("^User clicks Account Info tab$")
	public void user_clicks_Account_Info_tab() throws Throwable {
	    func.accountinfo();
	}

	@Then("^User should be taken to Account Info section$")
	public void user_should_be_taken_to_Account_Info_section() throws Throwable {
	    func.viewAccInfo();
	}

	@When("^User clicks Company Info tab$")
	public void user_clicks_Company_Info_tab() throws Throwable {
	    func.companyinfo();
	}

	@Then("^User should be taken to Company Info section$")
	public void user_should_be_taken_to_Company_Info_section() throws Throwable {
	    func.viewCompInfo();
	}

	@When("^User clicks Billing Info tab$")
	public void user_clicks_Billing_Info_tab() throws Throwable {
	    func.billinginfo();
	}

	@Then("^User should be taken to Billing Info section$")
	public void user_should_be_taken_to_Billing_Info_section() throws Throwable {
	    func.viewBillingInfo();
	}
	@Given("^User clicks user logo$")
	public void user_clicks_user_logo() throws Throwable {
	    func.clicklogo();
	}

	@Then("^User should view the menus$")
	public void user_should_view_the_menus() throws Throwable {
	    func.viewmenus();
	}

	@When("^User clicks My Segments$")
	public void user_clicks_My_Segments() throws Throwable {
		func.clickMySegments();
	}

	@Then("^User should be taken to My Segments$")
	public void user_should_be_taken_to_My_Segments() throws Throwable {
		func.viewMySegments();
	}

	@When("^User clicks Deploy Tags$")
	public void user_clicks_Deploy_Tags() throws Throwable {
	    func.clickDeployTags();
	}

	@Then("^User should be taken to Deploy Tags$")
	public void user_should_be_taken_to_Deploy_Tags() throws Throwable {
	    func.viewDeployTags();
	}

	@When("^User clicks Account Info$")
	public void user_clicks_Account_Info() throws Throwable {
	    func.clickAccInfo();
	}

	@Then("^User should be taken to Account Info$")
	public void user_should_be_taken_to_Account_Info() throws Throwable {
	    func.viewAccInfo();
	}

	@When("^User clicks Company Info$")
	public void user_clicks_Company_Info() throws Throwable {
	    func.clickCompInfo();
	}

	@Then("^User should be taken to Company Info$")
	public void user_should_be_taken_to_Company_Info() throws Throwable {
	    func.viewCompInfo();
	}

	@When("^User clicks Billing Info$")
	public void user_clicks_Billing_Info() throws Throwable {
	    func.clickBillingInfo();
	}

	@Then("^User should be taken to Billing Info$")
	public void user_should_be_taken_to_Billing_Info() throws Throwable {
	    func.viewBillingInfo();
	}
	@Given("^User clicks My Segments tab$")
	public void user_clicks_My_Segments_tab() throws Throwable {
	    func.clickMySegmentstab();
	}

	@When("^User clicks filters link$")
	public void user_clicks_filters_link() throws Throwable {
	    func.clickfilterslink();
	}

	@Then("^User should be redirected to filters page$")
	public void user_should_be_redirected_to_filters_page() throws Throwable {
	    func.viewfilterspage();
	}

	@When("^User clicks the top logo$")
	public void user_clicks_the_top_logo() throws Throwable {
	    func.clicktoplogo();
	}

	@When("^User clicks Segment link with zero records$")
	public void user_clicks_Segment_link_with_zero_records() throws Throwable {
	    func.clickzerorecordsegment();
	}

	@Then("^User should be redirected to filters page with prefilled data$")
	public void user_should_be_redirected_to_filters_page_with_prefilled_data() throws Throwable {
		func.viewfilterspage();
	}

	@When("^User clicks Segment link with any number of records$")
	public void user_clicks_Segment_link_with_any_number_of_records() throws Throwable {
	    func.clicknumrecordsegment();
	}
	@When("^User clicks Deploy Tags tab in home page$")
	public void user_clicks_Deploy_Tags_tab_in_home_page() throws Throwable {
	    func.clickDeployTagstab();
	}
	@When("^User clicks Goodharvest link$")
	public void user_clicks_Goodharvest_link() throws Throwable {
	    func.clickGoodharvestlink();
	}

	@Then("^User should be redirected to Goodharvest page$")
	public void user_should_be_redirected_to_Goodharvest_page() throws Throwable {
	    func.viewGoodharvestpage();
	}

	@When("^User clicks General Parameters link$")
	public void user_clicks_General_Parameters_link() throws Throwable {
	    func.clickGeneralParameterslink();
	}

	@Then("^User should be redirected to General Parameters page$")
	public void user_should_be_redirected_to_General_Parameters_page() throws Throwable {
	    func.viewGeneralParameterspage();
	}

	@When("^User clicks Tracking Specific Events link$")
	public void user_clicks_Tracking_Specific_Events_link() throws Throwable {
	    func.clickTrackingSpecificEventslink();
	}

	@Then("^User should be redirected to Tracking Specific Events page$")
	public void user_should_be_redirected_to_Tracking_Specific_Events_page() throws Throwable {
	    func.viewTrackingSpecificEventspage();
	}
	@Given("^User clicks Account Info tab in home page$")
	public void user_clicks_Account_Info_tab_in_home_page() throws Throwable {
		func.clickAccInfotab();
	}

	@When("^User enters Password and Confirm Password$")
	public void user_enters_Password_and_Confirm_Password() throws Throwable {
	    func.enterPassword();
	}

	@When("^User clicks Save button in Account Info$")
	public void user_clicks_Save_button() throws Throwable {
	    func.clickSaveInAccntTab();
	}    

	@Then("^Success message should be displayed to the user$")
	public void success_message_should_be_displayed_to_the_user() throws Throwable {
	    func.viewSuccessMessage();
	}
	
	@Given("^User clicks Company Info tab in home page$")
	public void user_clicks_Company_Info_tab_in_home_page() throws Throwable {
	    func.clickCompInfotab();
	}

	@When("^User select value from the company dropdown$")
	public void user_select_value_from_the_company_dropdown() throws Throwable {
	    func.selectdropdown();
	}

	@When("^User clicks Save button in Company Info$")
	public void user_clicks_Save_button_in_Company_Info() throws Throwable {
	    func.clickSaveInCompTab();
	}
	@Given("^User clicks Billing Info tab in home page$")
	public void user_clicks_Billing_Info_tab_in_home_page() throws Throwable {
	    func.clickBillInfotab();
	}

	@When("^User updates the zip code in zip field$")
	public void user_updates_the_zip_code_in_zip_field() throws Throwable {
	    func.updatezip();
	}

	@When("^User clicks Save button in Billing Info$")
	public void user_clicks_Save_button_in_Billing_Info() throws Throwable {
	    func.clickSaveInBillTab();
	}
	
	/*@When("^User tries to save the segment without any options$")
	public void user_tries_to_save_the_segment_without_any_options() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^New Segment should be created with blank options$")
	public void new_Segment_should_be_created_with_blank_options() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^User tries to save the segment by selecting any of the options$")
	public void user_tries_to_save_the_segment_by_selecting_any_of_the_options() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^New Segment should be created with selected options$")
	public void new_Segment_should_be_created_with_selected_options() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^User selects any segment with zero records$")
	public void user_selects_any_segment_with_zero_records() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^User should see corresponding segment without Export CTA$")
	public void user_should_see_corresponding_segment_without_Export_CTA() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^User selects any segment with records$")
	public void user_selects_any_segment_with_records() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^User should see corresponding segment with Export CTA$")
	public void user_should_see_corresponding_segment_with_Export_CTA() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^User clicks Export CTA$")
	public void user_clicks_Export_CTA() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^User should be able to download the respective segment records in selected format$")
	public void user_should_be_able_to_download_the_respective_segment_records_in_selected_format() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^User clicks close icon in Segment record$")
	public void user_clicks_close_icon_in_Segment_record() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^User should see blank filter page$")
	public void user_should_see_blank_filter_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}*/
}