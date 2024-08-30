/*WAP to launch google & click on gmail using linktext/partial linktext locator*/
package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A133_GmailLinkText_Partial {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	    Thread.sleep(1000);
	   //WebElement gmail_link=driver.findElement(By.linkText("Gmail")); //inspect link text "Gmail"
	    WebElement gmail_link=driver.findElement(By.partialLinkText("Gma")); //inspect partial link text "Gma"
	    gmail_link.click();

	}

}
