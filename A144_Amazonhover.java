/*WAP to launch amazon & hoverover account&list then click on signin*/
package selenium.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A144_Amazonhover {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
	    WebElement accountandlist=driver.findElement(By.xpath("//span[.='Hello, sign in']")); //writing xpath for text
        Actions a=new Actions(driver);
        a.moveToElement(accountandlist).perform(); //hovering
        WebElement signin_btn=driver.findElement(By.xpath("//span[.='Sign in']")); 
        signin_btn.click();  //click sign in button after hovering over account & list
	}

}
