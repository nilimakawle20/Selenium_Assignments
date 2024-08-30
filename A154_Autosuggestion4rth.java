/*WAP to launch google, type India, select 4th auto suggestion from drop*/
package selenium.keysfunction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A154_Autosuggestion4rth {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();	
		WebElement e1= driver.findElement(By.name("q"));
		e1.sendKeys("India");
		
		e1.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(500);
		e1.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(500);
		e1.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(500);
		e1.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(500);
		e1.sendKeys(Keys.ENTER);
		
	}

}
