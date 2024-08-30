/*Continue Assignment 142 after selecting books, search for book & press enter*/
package selenium.dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A143_SearchBookEnter {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();	
		WebElement e1=driver.findElement(By.id("searchDropdownBox"));
		Select s1=new Select(e1);
		s1.selectByVisibleText("Books"); //selectByVisibleText
		
		WebElement e2=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		e2.sendKeys("Wings of fire by Abdul Kalam");
		e2.sendKeys(Keys.ENTER);
		

	}

}
