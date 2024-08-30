/*WAP to launch any Browser along with launch any Website*/
package selenium.basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class A125_LaunchingWebsite {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");	//launches amazon
	}

}
