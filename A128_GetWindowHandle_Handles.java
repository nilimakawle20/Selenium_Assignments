/*WAP using getWindowHandle & getWindowHandles*/
package selenium.basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class A128_GetWindowHandle_Handles {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
	}

}
