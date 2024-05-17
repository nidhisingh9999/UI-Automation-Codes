import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestRegForm {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nidhi\\BrowserDriverSelenium\\chromedriver_win32\\chromedriver.exe");
 ChromeDriver driver = new ChromeDriver();
 driver.get("https://in.mailermagix.com/users/register");
 //maximize browser
 driver.manage().window().maximize();
 driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
 driver.findElement(By.id("first_name")).sendKeys("Nidhi");
 driver.findElement(By.id("last_name")).sendKeys("Singh");
 driver.findElement(By.name("password")).sendKeys("abc@123");
//Find and click the dropdown element to expand-timezone
 driver.findElement(By.xpath("//span[@class='selection']")).click();
 List <WebElement> options = driver.findElements(By.xpath("//span[@role='combobox']"));
 
 for(WebElement ele: options) {
	 
	 String value = ele.getText();
	 System.out.println(value);
	 
	 if(value.equalsIgnoreCase("contact us")) {
		 ele.click();
		 break;
	 }
 }

Thread.sleep(2000);
//driver.close();
 
	}

}
