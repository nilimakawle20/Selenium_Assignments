/*WAP to launch amazon & click on customer service & mobile using linktext/partiallinktext locator*/
package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A134_AmazonLinkText {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement mobile_link=driver.findElement(By.linkText("Mobiles")); //inspect link text "Mobiles"
	    mobile_link.click();
		WebElement cust_service_link=driver.findElement(By.partialLinkText("Service")); //inspect partial link text "Service"
	    cust_service_link.click();
	}

}
