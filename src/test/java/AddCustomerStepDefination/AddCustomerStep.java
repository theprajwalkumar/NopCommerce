package AddCustomerStepDefination;
import org.openqa.selenium.WebDriver;
import AddCustomerPageObject.AddCustomer;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddCustomerStep {
	WebDriver driver;
	public AddCustomer ac;
	
	 @Given ("User Launch Chrome Browser") 
    public void User_Launch_Chrome_Browser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		ac=new AddCustomer(driver);
		
	}
	  @When ("User opens url {string}")
	  public void User_opens_url(String url) throws InterruptedException {
		  driver.get(url);
		  driver.manage().window().maximize();
		  Thread.sleep(3000);
	  }
	  
	 @And("User enter Email as {string} and Password as {string}")
	 public void  And_User_enter_Email_as_and_Password_as(String Mail, String Pwd) throws InterruptedException {
		 ac.EnterEmail(Mail);
		 Thread.sleep(3000);
		 ac.EnterPassword(Pwd);
		 Thread.sleep(3000);
		 
	 }
	 
	 @And("Click on Login")
	 public void And_Click_on_Login()  {
		 ac.Login();
		 
		 
	 }
	 @Then("The Page Title should be {string}")
	 public void the_page_title_should_be(String Expected_title) throws InterruptedException {
			String Actual_title=driver.getTitle();
			if (Expected_title.equals(Actual_title)) {
				System.out.println("True");
			}
			else {
				System.out.println("False");
			}
			Thread.sleep(2000);
			
		}
		
	 @When ("User click on the Customer from the sidemenu")
	    public void User_click_on_the_Customer_from_the_sidemenu() throws InterruptedException {
		 ac.CustomerMenu();
		 Thread.sleep(3000);
	 }
	 
	 
	    @And("User selects the Customer section")
	    public void User_selects_the_Customer_section() throws InterruptedException {
	    	ac.CustomerSection();
	    	Thread.sleep(3000);
	    }
	    @When("User clicks on Add NewButton")
	    public void User_clicks_on_Add_NewButton() throws InterruptedException {
	    	ac.AddNew();
	    	Thread.sleep(3000);
	    }
	    @When("User enters Email as {string}")
	    public void user_enters_email_as(String Mail1) throws InterruptedException {
	    	ac.EmailId(Mail1);
	    	Thread.sleep(3000);
	    	
	    	
	        
	    }

	    @And("User enters Password as {string}")
	    public void user_enters_password_as(String Pwd1) throws InterruptedException {
	    	ac.Password1(Pwd1);
	    	Thread.sleep(3000);
	    		        
	    }

	    @And("User enters Firstname as {string}")
	    public void user_enters_firstname_as(String FName) throws InterruptedException {
	    	ac.FirstName(FName);
	    	Thread.sleep(3000);
	    	

	        
	    }

	    @And("User enters Lastname as {string}")
	    public void user_enters_lastname_as(String LName) throws InterruptedException {
	    	ac.LastName(LName);
	    	Thread.sleep(3000);
	    	
	        
	    }

	    @And("User enters Gender as Male")
	    public void user_enters_gender_as_Male() throws InterruptedException {
	    	ac.Gender();
	    	Thread.sleep(3000);
	    	
	        
	    }

	    @And("User enters DateofBirth as {string}")
	    public void user_enters_dateof_birth_as(String db) throws InterruptedException {
	    	ac.DOB(db);
	    	Thread.sleep(3000);
	    	
	    }

	    @And("User enters CompanyName as{string}")
	    public void user_enters_company_name_as_self(String CName) throws InterruptedException {
	    	ac.CompanyName(CName);
	    	Thread.sleep(3000);
	        
	    }

	   
	    @And("User selects is Tax Exempt")
	    public void User_selects_is_Tax_Exempt() throws InterruptedException {
	    	ac.Tax();
	    	Thread.sleep(3000);
	    }
	    @And("User selects newsletter from the DropDown")
	    public void User_selects_newsletter_from_the_DropDown() throws InterruptedException {
	    	ac.NewsLetter();
	    	Thread.sleep(3000);
	    }
	    @And("User selects ManagerofVendor from the Dropdown")
	    public void User_selects_ManagerofVendor_from_the_Dropdown() throws InterruptedException {
	    	ac.ManagerofVendor();
	    	Thread.sleep(3000);
	    }
	    @And("User enter Admin Comments as {string}")
	    public void User_enter_Admin_Comments_as (String cmnt) throws InterruptedException {
	    	ac.AdminComment(cmnt);
	    	Thread.sleep(3000);
	    }
	    @When("User clicks on the SaveButton")
	    public void User_clicks_on_the_SaveButton() throws InterruptedException {
	    	ac.SaveButton();
	    	Thread.sleep(3000);
	    }
	    @And("User should wait")
	    public void User_should_wait() throws InterruptedException {
	    	Thread.sleep(3000);
	    }
	 
	 
	 

}
