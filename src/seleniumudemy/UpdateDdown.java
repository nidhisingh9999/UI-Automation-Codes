package seleniumudemy;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdateDdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nidhi\\BrowserDriverSelenium\\chromedriver_win32\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
driver.manage().window().maximize();
driver.findElement(By.id("divpaxinfo")).click();
Thread.sleep(2000);

/*int i = 1;
while(i<5)
{
	driver.findElement(By.id("hrefIncAdt")).click(); //4 times
	i++;
}*/
for(int i=1;i<5;i++)
{
	driver.findElement(By.id("hrefIncAdt")).click();
}
driver.findElement(By.id("btnclosepaxoption")).click();
System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}

}
