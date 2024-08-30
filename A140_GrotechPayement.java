/*WAP to automate https://grotechminds.com/payments/ using Xpath by Attribute*/
package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A140_GrotechPayement {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/payments/");
		driver.manage().window().maximize();
		WebElement card_num=driver.findElement(By.xpath("//input[@name='cardNumber']"));//xpath for card number
		card_num.sendKeys("3452 4567 7823");
		
		WebElement exp_date=driver.findElement(By.xpath("//input[@name='expiryDate']"));//xpath for expiry date
		exp_date.sendKeys("05/2025");
		
		WebElement cvv=driver.findElement(By.xpath("//input[@name='cvv']"));//xpath for cvv
		cvv.sendKeys("456");
		
		WebElement amt=driver.findElement(By.xpath("//input[@name='amount']"));//xpath for amount
		amt.sendKeys("100");
		
		WebElement sv_card=driver.findElement(By.xpath("//input[@name='saveCard']"));//xpath for save card details
		sv_card.click();
		
		Thread.sleep(2000);
		
		WebElement make_pay=driver.findElement(By.xpath("//input[@value='Make Payment']"));//xpath for make payment
		make_pay.click();
	}
}
