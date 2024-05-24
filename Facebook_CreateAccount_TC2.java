package PageObjectModule_With_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_CreateAccount_TC2 {

	
	WebDriver driver;
	//1.DM or Variabels
	
	@FindBy(name = "firstname")
	WebElement Firstname;
	
	@FindBy(name = "lastname")
	WebElement Lastname;
	
	@FindBy(name = "reg_passwd__")
	WebElement RegNo;

	@FindBy(xpath = "//input[@value=\"1\"]")
	WebElement Gender;
	
	@FindBy(name = "websubmit")
	WebElement SignUp;
	
	//2.
	
	public Facebook_CreateAccount_TC2(WebDriver driver) {
		
		this.driver= driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	//3.
	
	public void FN(String Name) {
		
		Firstname.sendKeys(Name);
	}
	
	public void LN(String Lastname1) {
		
		Lastname.sendKeys(Lastname1);
	}
	
	public void RN(String RegNumber) {
		
		RegNo.sendKeys(RegNumber);
	}
	
	public void GN() {
		
		Gender.click();
	}
	public void Sign() {
		
		SignUp.click();
	}
}
