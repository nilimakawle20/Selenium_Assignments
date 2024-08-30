/*WAP to login to facebook with Id and Name locators*/
package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class A132_LoginFacebook_IdName {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("nilimakawle@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Nilima@123");
		driver.findElement(By.name("login")).click();
	}
}
