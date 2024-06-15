package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pageobject.RegisterPageObject;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterStepDef {
	WebDriver driver;
	RegisterPageObject r;
	
	
	@Given("User launches the Chrome browser")
	public void user_launches_the_chrome_browser() {
	    WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    r=new RegisterPageObject(driver);
	    
	  
	}

	@When("User opens the url {string}")
	public void user_opens_the_url(String url) {
	    driver.get(url);
	}

	@And("User clicks on the RegisterButton")
	public void user_clicks_on_the_register_button() throws InterruptedException {
		Thread.sleep(3000);
	    r.click_register();
	}

	@Then("User selects the Gender")
	public void user_selects_the_gender() throws InterruptedException {
		Thread.sleep(3000);
	    r.enter_gender();
	}

	@And("The user enter FirstName as {string}")
	public void the_user_enter_first_name_as(String Fname) throws InterruptedException {
		Thread.sleep(3000);
	    r.enter_firstname(Fname);
	}

	@And("The user enter LastName as {string}")
	public void the_user_enter_last_name_as(String Lname) throws InterruptedException {
		Thread.sleep(3000);
		r.enter_lastname(Lname);
	    
	}

	@And("User selects the day as {string}")
	public void user_selects_the_day_as(String day) throws InterruptedException {
		Thread.sleep(3000);
	    r.enter_date(day);
	}

	@And("User selects the month as {string}")
	public void user_selects_the_month_as(String month) throws InterruptedException {
		Thread.sleep(3000);
	    r.enter_month(month);
	}

	@And("User selects the year as {string}")
	public void user_selects_the_year_as(String year) throws InterruptedException {
		Thread.sleep(3000);
	    r.enter_year(year);
	}

	@And("The user enters email as {string}")
	public void the_user_enters_email_as(String mail) throws InterruptedException {
		Thread.sleep(3000);
	    r.enter_email(mail);
	}

	@And("The user enter CompanyName as {string}")
	public void the_user_enter_company_name_as(String Companyname) throws InterruptedException {
		Thread.sleep(3000);
	    r.enter_companyname(Companyname);
	}

	@And("The user enter Password as {string}")
	public void the_user_enter_password_as(String pass) throws InterruptedException {
		Thread.sleep(3000);
	    r.enter_password(pass);
	}

	@And("The user enter ConfirmPassword as {string}")
	public void the_user_enter_confirm_password_as(String cpass) throws InterruptedException {
		Thread.sleep(3000);
	    r.enter_confirmpass(cpass);
	}

	@Then("The User clicks on the RegisterButton")
	public void the_user_clicks_on_the_register_button() throws InterruptedException {
		Thread.sleep(3000);
	    r.register_butt();
	}

	@And("User wait for sometime")
	public void user_wait_for_sometime() throws InterruptedException {
	    Thread.sleep(3000);
	}


}
