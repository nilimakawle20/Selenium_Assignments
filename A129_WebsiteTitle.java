/*WAP to get the title of any website*/
package selenium.basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class A129_WebsiteTitle {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/");
		System.out.println(driver.getTitle());
	}

}
