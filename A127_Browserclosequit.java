/*WAP using close or quit*/
package selenium.basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class A127_Browserclosequit {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.close();
		driver.quit();
	}

}
