/*WAP to launch google, then click on gmail only when it is enabled & displayed*/
package selenium.keysfunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A157_IsEnabledDisplayed {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	    Thread.sleep(1000);
	    WebElement e1=driver.findElement(By.linkText("Gmail")); //inspect link text "Gmail"
	    if(e1.isEnabled() && e1.isDisplayed())
	    {
	    e1.click();
	    }
	}
}
