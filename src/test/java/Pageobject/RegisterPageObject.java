package Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPageObject {
	WebDriver ldriver;
	
	public RegisterPageObject(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver , this);
	}

	
	@FindBy(xpath="/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")
	WebElement Register;
	
	
	
	//Your Personal Details
	
	
	@FindBy(xpath = "//*[@id=\"gender-male\"]")
	WebElement RadioButton;
	
	
	@FindBy(xpath ="//*[@id=\"FirstName\"]")
	WebElement FirstName;

	
	@FindBy(xpath="//*[@id=\"LastName\"]")
	WebElement LastName;
	
	
	//DateofBirth
	@FindBy (xpath="//*[@id=\"main\"]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]")
	WebElement DOB;
	
	@FindBy(xpath="//*[@id=\"main\"]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]")
	WebElement Month;
	
	@FindBy(xpath="//*[@id=\"main\"]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]")
	WebElement Year;
	
	@FindBy(xpath="//*[@id=\"Email\"]")
	WebElement Email;
	
	
	//CompanyDetails
	
	@FindBy(xpath="//*[@id=\"Company\"]")
	WebElement CompanyDetails;
	
	//Your Password
	
	@FindBy(xpath="//*[@id=\"Password\"]")
	WebElement Password;
	
	@FindBy(xpath="//*[@id=\"ConfirmPassword\"]")
	WebElement ConfirmPassword;
	
	@FindBy(xpath="//*[@id=\"register-button\"]")
	WebElement Register1;
	
	public void click_register() {
		Register.click();
	}
	public void enter_gender() {
		RadioButton.click();
	}
	public void enter_firstname(String Fname) {
		FirstName.sendKeys(Fname);
	}
	
	public void enter_lastname(String Lname) {
		LastName.sendKeys(Lname);
	}
	
	public void enter_date(String day) {
		DOB.sendKeys(day);
	}
	public void enter_month(String month) {
		Month.sendKeys(month);
	}
	public void enter_year(String year) {
		Year.sendKeys(year);
	}
	public void enter_email(String mail) {
		Email.sendKeys(mail);
	}
	public void enter_companyname(String Companyname) {
		CompanyDetails.sendKeys(Companyname);
	}
	public void enter_password(String pass) {
		Password.sendKeys(pass);
	}
	public void enter_confirmpass(String cpass) {
		ConfirmPassword.sendKeys(cpass);
	}
	public void register_butt() {
		Register1.click();
	}

}
