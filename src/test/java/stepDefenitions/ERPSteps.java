package stepDefenitions;

import org.openqa.selenium.WebDriver;

import commonFunctions.FunctionLibrary;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ERPSteps {

	WebDriver driver;
	@Given("Launch browser as")
	public void launch_browser_as() throws Throwable {
	    driver = FunctionLibrary.startBrowser();
	}

	@When("launch url")
	public void launch_url() {
	   FunctionLibrary.openUrl();
	}

	@When("wait for username with {string} and {string} and {string}")
	public void wait_for_username_with_and_and(String Ltype, String Lvalue, String mywait) {
	    FunctionLibrary.waitForElement(Ltype, Lvalue, mywait);
	}

	@When("Enter user name with {string} and {string} and {string}")
	public void enter_user_name_with_and_and(String Ltype, String Lvalue, String TestData) {
	    FunctionLibrary.typeAction(Ltype, Lvalue, TestData);
	}

	@When("Enter password with {string}  and {string} and {string}")
	public void enter_password_with_and_and(String Ltype, String Lvalue, String TestData) {
		FunctionLibrary.typeAction(Ltype, Lvalue, TestData);
	}

	@When("click login button with {string} and {string}")
	public void click_login_button_with_and(String Ltype, String Lvalue) {
		 FunctionLibrary.clickAction(Ltype, Lvalue);
	}

	@When("wait for Supplier link with {string} and {string} and {string}")
	public void wait_for_Supplier_link_with_and_and(String Ltype, String Lvalue, String mywait) {
		FunctionLibrary.waitForElement(Ltype, Lvalue, mywait);
	}

	@When("click Supplier link with {string} and {string}")
	public void click_Supplier_link_with_and(String Ltype, String Lvalue) {
		 FunctionLibrary.clickAction(Ltype, Lvalue); 
	}

	@When("Wait for AddIcon with {string} and {string} and {string}")
	public void wait_for_AddIcon_with_and_and(String Ltype, String Lvalue, String mywait) {
		FunctionLibrary.waitForElement(Ltype, Lvalue, mywait);
	}

	@When("Click Addicon button with {string} and {string}")
	public void click_Addicon_button_with_and(String Ltype, String Lvalue) {
		 FunctionLibrary.clickAction(Ltype, Lvalue);
	}

	@When("wait for supplier number with {string} and {string} and {string}")
	public void wait_for_supplier_number_with_and_and(String Ltype, String Lvalue, String mywait) {
		FunctionLibrary.waitForElement(Ltype, Lvalue, mywait);
	}

	@When("Capture Supplier number with {string} and {string}")
	public void capture_Supplier_number_with_and(String Ltype, String Lvalue) throws Throwable {
	    FunctionLibrary.capturesupp(Ltype, Lvalue);
	}

	@When("Enter in {string} with {string} and {string}")
	public void enter_in_with_and(String TestData, String Ltype, String Lvalue) {
	   FunctionLibrary.typeAction(Ltype, Lvalue, TestData);
	}

	@When("Click Add button with {string} and {string}")
	public void click_Add_button_with_and(String Ltype, String Lvalue) {
		 FunctionLibrary.clickAction(Ltype, Lvalue);
	}

	@When("wait for ConfirmOk button with {string} and {string} and {string}")
	public void wait_for_ConfirmOk_button_with_and_and(String Ltype, String Lvalue, String mywait) {
		FunctionLibrary.waitForElement(Ltype, Lvalue, mywait);
	}

	@When("click Confirm ok button with {string} and {string}")
	public void click_Confirm_ok_button_with_and(String Ltype, String Lvalue) {
		 FunctionLibrary.clickAction(Ltype, Lvalue);
	}

	@When("Wait for Alert ok button with {string} and {string} and {string}")
	public void wait_for_Alert_ok_button_with_and_and(String Ltype, String Lvalue, String mywait) {
		FunctionLibrary.waitForElement(Ltype, Lvalue, mywait);
	}

	@When("Click Alert ok button with {string} and {string}")
	public void click_Alert_ok_button_with_and(String Ltype, String Lvalue) {
	    FunctionLibrary.clickAction(Ltype, Lvalue);
	}

	@When("Verify SupplierNumber")
	public void verify_SupplierNumber() throws Throwable {
	   FunctionLibrary.supplierTable(); 
	}

	@When("Click Logout link with {string} and {string}")
	public void click_Logout_link_with_and(String Ltype, String Lvalue) {
	    FunctionLibrary.clickAction(Ltype, Lvalue);
	}

	@When("close browser")
	public void close_browser() {
	    FunctionLibrary.closeBrowser();
	}

	@When("wait for customer link with {string} and {string} and {string}")
	public void wait_for_customer_link_with_and_and(String LocatorType, String LocatorValue, String mywait) {
		FunctionLibrary.waitForElement(LocatorType, LocatorValue, mywait);
	}
	    
	@When("click customer link with {string} and {string}")
	public void click_customer_link_with_and(String LocatorType, String LocatorValue) {
	    FunctionLibrary.clickAction(LocatorType, LocatorValue);
	}
	@When("wait for customer number with {string} and {string} and {string}")
	public void wait_for_customer_number_with_and_and(String LocatorType, String LocatorValue, String mywait) {
	    FunctionLibrary.waitForElement(LocatorType, LocatorValue, mywait);
	}
	@When("Capture customer number with {string} and {string}")
	public void capture_customer_number_with_and(String LocatorType, String LocatorValue) throws Throwable {
	    FunctionLibrary.capturecus(LocatorType, LocatorValue);
	    
	}
	@When("Verify CustomerNumber")
	public void verify_customer_number() throws Throwable {
	   FunctionLibrary.customerTable(); 
	}



}
