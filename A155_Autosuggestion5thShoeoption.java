/*WAP to launch amazon, search shoes then select 5th option*/
package selenium.keysfunction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A155_Autosuggestion5thShoeoption {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();	
		WebElement e1= driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("Shoes");
		Thread.sleep(500);
		e1.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(500);
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
