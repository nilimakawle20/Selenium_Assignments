/*WAP to automate https://grotechminds.com/registration/*/
package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A137_Autome_Registration {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement f_name=driver.findElement(By.id("fname")); //Webelement for firstname
		f_name.sendKeys("Maithili");
		WebElement l_name=driver.findElement(By.id("lname")); //Webelement for lastname
		l_name.sendKeys("Sharma");
		
		WebElement email=driver.findElement(By.xpath("//input[@name='email']")); //xpath for email
		email.sendKeys("mailthilisharma@xyz.com");
		WebElement pwd=driver.findElement(By.xpath("//input[@name='password']"));//xpath for password
		pwd.sendKeys("Msharma@123");
		
		//WebElement radio_btn1=driver.findElement(By.xpath("//input[@id='male']"));//xpath for radio button-male
		//radio_btn1.click();
		WebElement radio_btn2=driver.findElement(By.xpath("//input[@id='Female']"));//xpath for radio button-female
		radio_btn2.click();
		
		WebElement present_add= driver.findElement(By.id("Present-Address"));//WebElement for present address
		present_add.sendKeys("Nagar Parishad Colony, Choudhary ward, Hinganghat-442301");
		
		present_add.sendKeys(Keys.CONTROL+"A"); //Select all text
		present_add.sendKeys(Keys.CONTROL+"C"); //Copy text
		WebElement permanent_add= driver.findElement(By.id("Permanent-Address"));//WebElement for permanent address
		permanent_add.sendKeys(Keys.CONTROL+"V"); //paste present address into permanent address field
		
		WebElement pincode=driver.findElement(By.xpath("//input[@name='Pincode']")); //xpath for pincode
		pincode.sendKeys("442301");
		
		WebElement submit_btn=driver.findElement(By.xpath("//button[@name='Submit']")); //xpath for submit button
		submit_btn.click();

	}

}
