import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountHyperlinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nidhi\\BrowserDriverSelenium\\chromedriver_win32\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.calculator.net/");
//locate total hyperlinks on web page and count
List<WebElement> linkElements = driver.findElements(By.tagName("a"));
System.out.println("Total links on WebPage:" +linkElements.size());
//to print all links - use for each loop
for(WebElement el:linkElements )
{
	System.out.println(el.getText());
}

driver.close();
	}

}
