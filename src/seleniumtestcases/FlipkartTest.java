package seleniumtestcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nidhi\\BrowserDriverSelenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver Driver = new ChromeDriver();
		//navigate to website
		
Driver.get("https://www.flipkart.com/");
//maximize current window
Driver.manage().window().maximize();
//count total number of hyperlinks
List<WebElement> hyperLinksonPage = Driver.findElements(By.tagName("a"));
System.out.println("Total number of HyperLinks:" +hyperLinksonPage.size());
//to print all links 
for(WebElement eb:hyperLinksonPage ) {
	System.out.println(eb.getText());
//count total number of radio button

}

}
}
