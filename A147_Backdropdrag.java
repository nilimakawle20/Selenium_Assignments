/*Assignment 146 Continue WAP to revert it back the postman to its original place https://grotechminds.com/drag-and-drop/*/
package selenium.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A147_Backdropdrag {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		WebElement drag=driver.findElement(By.xpath("//div[@id='container-6']"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='div2']"));
		Actions a1=new Actions(driver);
		a1.dragAndDrop(drag, drop).perform();
		
		//drag and drop back to original position
		WebElement drag1=driver.findElement(By.xpath("//div[@id='div2']"));
		WebElement drop1=driver.findElement(By.xpath("//div[@id='container-6']"));
		a1.dragAndDrop(drag1, drop1).perform();

	}

}
