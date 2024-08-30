/*WAP to check whether radio button is selected or not https://grotechminds.com/is-selected/*/
package selenium.keysfunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A156_IsSelected {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/is-selected/");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		WebElement e1=driver.findElement(By.xpath("(//input[@id='vehicle2'])[1]"));
		Thread.sleep(500);		
	    e1.click();     //when clicked,true else false
		boolean b1=e1.isSelected();
		System.out.println(b1);
		Thread.sleep(1000);
		

		WebElement e2=driver.findElement(By.xpath("(//input[@id='vehicle2'])[2]"));
		Thread.sleep(500);		
	    e2.click();     //when clicked,true else false
		boolean b2=e2.isSelected();
		System.out.println(b2);
		

		WebElement e3=driver.findElement(By.xpath("(//input[@id='vehicle2'])[3]"));
		Thread.sleep(500);		
	    e3.click();     //when clicked,true else false
		boolean b3=e3.isSelected();
		System.out.println(b3);

		WebElement e4=driver.findElement(By.xpath("(//input[@id='vehicle2'])[4]"));
		Thread.sleep(500);		
	    e4.click();     //when clicked,true else false
		boolean b4=e4.isSelected();
		System.out.println(b4);

		WebElement e5=driver.findElement(By.xpath("(//input[@id='vehicle2'])[5]"));
		Thread.sleep(500);		
	    e5.click();     //when clicked,true else false
		boolean b5=e5.isSelected();
		System.out.println(b5);

		WebElement e6=driver.findElement(By.xpath("(//input[@id='vehicle2'])[6]"));
		Thread.sleep(500);		
	    e6.click();     //when clicked,true else false
		boolean b6=e6.isSelected();
		System.out.println(b6);

		WebElement e7=driver.findElement(By.xpath("(//input[@id='vehicle2'])[7]"));
		Thread.sleep(500);		
	    e7.click();     //when clicked,true else false
		boolean b7=e7.isSelected();
		System.out.println(b7);

		WebElement e8=driver.findElement(By.xpath("(//input[@id='vehicle2'])[8]"));
		Thread.sleep(500);		
	    e8.click();     //when clicked,true else false
		boolean b8=e8.isSelected();
		System.out.println(b8);

		WebElement e9=driver.findElement(By.xpath("(//input[@id='vehicle2'])[9]"));
		Thread.sleep(500);		
	    e9.click();     //when clicked,true else false
		boolean b9=e9.isSelected();
		System.out.println(b9);

		WebElement e10=driver.findElement(By.xpath("(//input[@id='vehicle2'])[10]"));
		Thread.sleep(500);		
	    e10.click();     //when clicked,true else false
		boolean b10=e10.isSelected();
		System.out.println(b10);

		WebElement e11=driver.findElement(By.xpath("(//input[@id='vehicle2'])[11]"));
		Thread.sleep(500);		
	    e11.click();     //when clicked,true else false
		boolean b11=e11.isSelected();
		System.out.println(b11);

		WebElement e12=driver.findElement(By.xpath("(//input[@id='vehicle2'])[12]"));
		Thread.sleep(500);		
	    e12.click();     //when clicked,true else false
		boolean b12=e12.isSelected();
		System.out.println(b12);

		WebElement e13=driver.findElement(By.xpath("(//input[@id='vehicle2'])[13]"));
		Thread.sleep(500);		
	    e13.click();     //when clicked,true else false
		boolean b13=e13.isSelected();
		System.out.println(b13);

		WebElement e14=driver.findElement(By.xpath("(//input[@id='vehicle2'])[14]"));
		Thread.sleep(500);		
	    e14.click();     //when clicked,true else false
		boolean b14=e14.isSelected();
		System.out.println(b14);
	}
}
