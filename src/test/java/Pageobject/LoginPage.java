package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;

		PageFactory.initElements(rdriver, this);
	}
	

	@FindBy (id="Email")
	WebElement Email;
	@FindBy(id="Password")
	WebElement Password;
	@FindBy(xpath = "//button[@class='button-1 login-button']")
	WebElement Login;
	@FindBy(xpath="//*[@id=\"navbarText\"]/ul/li[3]/a")
	WebElement Logout;
	
	//WebElement Password = ldriver.findElement(By.id("Password"));
	//WebElement Login = ldriver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div[1]/div/form/div[3]/button"));
	//WebElement Logout = ldriver.findElement(By.xpath("//*[@id=\"navbarText\"]/ul/li[3]/a"));

	public void enter_email(String Mail) {

		Email.clear();
		Email.sendKeys(Mail);

	}

	public void enter_password(String pwd) {
		Password.clear();
		Password.sendKeys(pwd);

	}

	public void click_login() {
		Login.click();
	}
	public void click_logout() {
		Logout.click();
		
	}

}
