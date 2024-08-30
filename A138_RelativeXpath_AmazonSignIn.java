/*WAP to Sign For Amazon.india  Using Relative Xpath*/
package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A138_RelativeXpath_AmazonSignIn {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        WebElement email=driver.findElement(By.xpath("(//input)[7]"));//email xpath
        email.sendKeys("nilimakawle@gmail.com");
        
        WebElement cont=driver.findElement(By.xpath("(//input)[10]"));//xpath for continue button
        cont.click();
        
        WebElement pwd=driver.findElement(By.xpath("(//input)[9]"));//password xpath
        pwd.sendKeys("Nilima@123");
        
        WebElement sign_in=driver.findElement(By.xpath("(//input)[10]"));//continue button xpath
        sign_in.click();   
	}

}
