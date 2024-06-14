package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pageobject.LoginPage;

public class StepDefination {
	WebDriver driver;
	public LoginPage l;
	
	@Given("user Launch Chrome Browser")
	public void user_launch_chrome_browser() {
	    WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    l=new LoginPage(driver);
	    
	    
	    
	}

	@When("The User opens url {string}")
	public void the_user_opens_url(String url) throws InterruptedException {
		driver.get(url);
		Thread.sleep(3000);
		driver.manage().window().maximize();
	    
	}

	@When("The User enter Email as {string} and Password as {string}")
	public void the_user_enter_email_as_and_password_as(String Mail, String pwd) {
		l.enter_email(Mail);
		
		l.enter_password(pwd);
	    
	    
	}

	@When("Click on LoginButton")
	public void click_on_loginbutton() throws InterruptedException {
		Thread.sleep(3000);
	    l.click_login();
	    
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String ExpTitle) {
		String ActTitle=driver.getTitle();
		if (ExpTitle.equals(ActTitle)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	  
	   
	}

	@When("User click on the log out link")
	public void user_click_on_the_log_out_link() throws InterruptedException {
		Thread.sleep(3000);
	    l.click_logout();
	    
	    
	}

	@When("Close the Browser")
	public void close_the_browser() throws InterruptedException {
		Thread.sleep(3000);
	    driver.close();
	 
	}
	
	
	




}
