/*WAP to launch flipkart & hoverover login & click on 'my profile'*/
package selenium.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A145_Flipkart_hover {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(500);
		WebElement login=driver.findElement(By.xpath("//span[.='Login']")); //writing xpath for text
        Actions a=new Actions(driver);
        a.moveToElement(login).perform(); //hovering
        WebElement my_profile=driver.findElement(By.linkText("My Profile")); 
        my_profile.click();  //click sign in button after hovering over account & list
	}

}
