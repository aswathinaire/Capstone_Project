package AddNewAccount;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.corp.qa.PageLayer.HomePage;
import com.corp.qa.base.Base;
public class Add_New_Account extends Base {
	
	@FindBy(xpath="//input[@name='uid']")
	WebElement username;
	
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath="//*[contains(@type,'submit')]")
	WebElement LoginButton;
	
	@FindBy(xpath="//a[text()='New Account']")
	WebElement button;
	
	@FindBy(xpath="//input[@name='cusid']")
	WebElement customerid;
	
	@FindBy(xpath="//input[@name='selaccount']")
	WebElement selectaccount;
	
	@FindBy(xpath="//textarea[@name='inideposit']")
	WebElement initialdeposit;
	
	@FindBy(xpath="//input[@type='button2']")
	WebElement submit;
	
	@FindBy(xpath="//p[text()=' Account Generated Successfully']")
	WebElement sussmsg;
	
	
	
	//Initializing the Page Objects:
		public Add_New_Account() throws IOException {
		PageFactory.initElements(driver, this);
		}
		
		
		//Action - validate Login and action on Elements
		public Add_New_Account register(String un, String pwd){
			username.sendKeys(un);
			password.sendKeys(pwd);
			LoginButton.click();
			customerid.sendKeys("42725");
			initialdeposit.sendKeys("1000");
			submit.click();
			sussmsg.getText();
			System.out.println(sussmsg);
			return null;
	
		}
		
}
		
