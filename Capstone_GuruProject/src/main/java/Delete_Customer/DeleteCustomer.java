package Delete_Customer;

import java.io.IOException;



import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.corp.qa.base.Base;


public class DeleteCustomer extends Base {

// @FindBy(xpath = "//input[@name='uid']")
// WebElement usernameBox;
// @FindBy(xpath = "//input[@name='password']")
// WebElement pwdBox;
// @FindBy(xpath = "//input[@name='btnLogin']")
// WebElement submit_button;
@FindBy(xpath = "/html/body/div[3]/div/ul/li[4]/a")
WebElement deletelink;
@FindBy(xpath = "//input[@name='cusid']")
WebElement customerFeild;
@FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/input[1]")
WebElement submit_btn;
@FindBy(xpath = "/html/body/div[3]/div/ul/li[15]/a")
WebElement logoutbutton;
public DeleteCustomer() throws IOException {
//initialization();
PageFactory.initElements(driver, this);
}
public void deleteOperation(String cid) throws IOException {
// usernameBox.sendKeys(un);
// pwdBox.sendKeys(pwd);
// submit_button.click();
deletelink.click();
customerFeild.click();
customerFeild.sendKeys(cid);
submit_btn.click();
Alert alert = driver.switchTo().alert();
String alertmsg = alert.getText();
Assert.assertEquals(alertmsg, "Do you really want to delete this Customer?");
alert.accept();
String alertmsg1 = alert.getText();
Assert.assertEquals(alertmsg1, "You are not authorize to delete this customer!!");

alert.accept();
logoutbutton.click();
Alert alert1 = driver.switchTo().alert();
String alertmsg2 = alert1.getText();
Assert.assertEquals(alertmsg2, "You Have Succesfully Logged Out!!");
alert1.accept();
}
}
