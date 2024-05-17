package seleniumtestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.driver.chromedriver","C:\\Users\\Nidhi\\BrowserDriverSelenium\\chromedriver_win32\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.linkedin.com");
driver.findElement(By.linkText("Create Account")).click();
String url1 = driver.getCurrentUrl();
//System.out.println(url1);
if(url1.contains("wikipedia.org")) {
	System.out.println("1st Verification:" + "It is an Internal Link- Passed");
} else {
	System.out.println("1st Verification:" + "It is not an Internal Link - Failed");
}
driver.navigate().back();
//Thread.sleep(4000);
String url2 = driver.getCurrentUrl();
//System.out.println(url2);

if(url2.contains("selenium.dev")) {
	System.out.println("2nd Verification:"+ "It is not an External Link- Failed");
}
driver.close();
	}

}
