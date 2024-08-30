/*WAP to automate https://grotechminds.com/registeration-form/*/
package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A136_AutoGrotech_RegistrationForm {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registeration-form/");
		driver.manage().window().maximize();
		WebElement first_name=driver.findElement(By.id("firstName")); //webelement for firstname
		first_name.sendKeys("Meera");
		WebElement last_name=driver.findElement(By.id("lastName")); //webelement for lastname
		last_name.sendKeys("Desai");
		WebElement email=driver.findElement(By.name("email")); //webelement for email
		email.sendKeys("Meera.desai10@xyz.com");
		WebElement contact_num=driver.findElement(By.xpath("//input[@name='phone']")); //xpath for phone
		contact_num.sendKeys("8547898945");
		WebElement aadhaar_num=driver.findElement(By.xpath("//input[@name='aadhaar']")); //xpath for aadhaar
		aadhaar_num.sendKeys("8547 8989 4510");
		WebElement pan=driver.findElement(By.xpath("//input[@name='pan']")); //xpath for pan
		pan.sendKeys("ABCDE8547K");
		WebElement terms_chkbox=driver.findElement(By.xpath("//input[@name='terms']")); //xpath for terms checkbox
		terms_chkbox.click();
		WebElement register_btn=driver.findElement(By.xpath("//button[@name='Submit']")); //xpath for register button
		register_btn.click();
	}

}
