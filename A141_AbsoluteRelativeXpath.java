/*WAP to automate https://grotechminds.com/x-path/ using Absolute/Relative Xpath*/
package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A141_AbsoluteRelativeXpath {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/x-path/");
		driver.manage().window().maximize();
		WebElement f_name=driver.findElement(By.xpath("//input[@type='FirstName']"));//xpath for first name
		f_name.sendKeys("Shruti");
		
		WebElement l_name=driver.findElement(By.xpath("//input[@type='LastName']"));//xpath for last name
		l_name.sendKeys("Sharma");
		
		WebElement mid_name=driver.findElement(By.xpath("//input[@type='MiddleName']"));//xpath for middle name
		mid_name.sendKeys("Raman");
		
		WebElement work_add=driver.findElement(By.xpath("//textarea[@name='Work-Place-Address']"));//xpath for workplace address
		work_add.sendKeys("Rajendra Nagar,Delhi-1000231");
		
		WebElement home_add=driver.findElement(By.xpath("//textarea[@name='home-address']"));//xpath for home address
		home_add.sendKeys("Ekta Nagar,Pune-4070231");
		
		WebElement pers_email=driver.findElement(By.id("Personal-Email"));//Personal email field
		pers_email.sendKeys("sharma.shruti@xyz.com");
		
		WebElement corp_email=driver.findElement(By.id("Corporate-email"));//Corporate email field
		corp_email.sendKeys("sharma.shruti@corp.com");
		
		WebElement phn=driver.findElement(By.xpath("//input[@name='tel']"));//xpath for phone number
		phn.sendKeys("8645347654");
		
		WebElement submit_btn=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));//xpath for submit button
		submit_btn.click();
	}
}
