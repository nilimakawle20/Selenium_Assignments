/*WAP to maximize & minimize any Browser*/
package selenium.basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class A126_MaxMinBrowser {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize(); //maximize browser
		Thread.sleep(2000);
		driver.manage().window().minimize(); //minimize browser
	}

}
