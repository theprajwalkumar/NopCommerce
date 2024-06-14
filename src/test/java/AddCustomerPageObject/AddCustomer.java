package AddCustomerPageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddCustomer {
	WebDriver ldriver;
	
	public AddCustomer(WebDriver rdriver) {
		ldriver = rdriver;

		PageFactory.initElements(rdriver, this);
	}
	@FindBy(id = "Email")
	WebElement Email;
	@FindBy(id="Password")
	WebElement Password;
	@FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div[2]/div[1]/div/form/div[3]/button")
	WebElement Login;
	@FindBy(xpath = "/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/a")
	WebElement CustomerMenu;
	@FindBy(xpath = "/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/ul/li[1]/a/p")
	WebElement CustomerSection;
	@FindBy(xpath="/html/body/div[3]/div[1]/form[1]/div/div/a")
	WebElement AddNew;
	@FindBy(xpath="//*[@id=\"Email\"]")
	WebElement EmailID;
	@FindBy(xpath="//*[@id=\"Password\"]")
	WebElement Password1;
	@FindBy(xpath="//*[@id=\"FirstName\"]")
	WebElement FirstName;
	@FindBy(xpath = "//*[@id=\"LastName\"]")
	WebElement LastName;
	@FindBy(xpath="//*[@id=\"Gender_Male\"]")
	WebElement Gender;
	@FindBy(xpath="//*[@id=\"DateOfBirth\"]")
	WebElement DOB;
	@FindBy(xpath="//*[@id=\"Company\"]")
	WebElement CompanyName;
	@FindBy(xpath="//*[@id=\"IsTaxExempt\"]")
	WebElement Tax;
	@FindBy( xpath = "//*[@id=\"customer-info\"]/div[2]/div[9]/div[2]/div/div[1]/div/span/span[1]/span/ul")
	WebElement NewsLetter;
	@FindBy(xpath="//*[@id=\"VendorId\"]")
	WebElement ManagerofVendor;
	@FindBy(xpath="//*[@id=\"AdminComment\"]")
	WebElement AdminComment;
	@FindBy(xpath="/html/body/div[3]/div[1]/form/div[1]/div/button[1]")
	WebElement SaveButton;
	
	public void EnterEmail(String Mail) {
		Email.clear();
		Email.sendKeys(Mail);
		
	}
	public void EnterPassword(String Pwd) {
		Password.clear();
		Password.sendKeys(Pwd);
	}
	public void Login() {
		Login.click();
	}
	public void CustomerMenu() {
		CustomerMenu.click();
	}
	public void CustomerSection() {
		CustomerSection.click();
	}
	public void AddNew() {
		AddNew.click();
	}
	public void EmailId(String Mail1) {
		EmailID.sendKeys(Mail1);
	}
	public void Password1(String Pwd1) {
		Password1.sendKeys(Pwd1);
	}
	public void FirstName(String FName) {
		FirstName.sendKeys(FName);
	}
	public void LastName(String LName) {
		LastName.sendKeys(LName);
		
		
	}
	public void Gender() {
		Gender.click();
	}
	public void DOB(String db) {
		DOB.sendKeys(db);
	}
	public void CompanyName(String CName) {
		CompanyName.sendKeys(CName);
		
	}
	public void Tax() {
		Tax.click();
	}
	public void NewsLetter() {
		NewsLetter.click();
		List<WebElement>auto=ldriver.findElements(By.xpath("//ul[@class=\"select2-results__options\"]/li"));
		auto.size();
		int count=auto.size();
		System.out.println(count);
		auto.get(1).click();
	}
	public void ManagerofVendor() {
		ManagerofVendor.click();
		Select dropdown2=new Select(ManagerofVendor);
		dropdown2.selectByValue("2");
	}
	public void AdminComment(String cmnt) {
		AdminComment.sendKeys(cmnt);
	}
	public void SaveButton() {
		SaveButton.click();
	}
	
	

}
