package locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorPractice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.geckodriver", "C:\\Users\\Nidhi\\BrowserDriverSelenium.geckodriver.exe");
WebDriver driver = new FirefoxDriver();
driver.get("https://testautomationpractice.blogspot.com/");
driver.manage().window().maximize();
//find total number of rows and column on webpage
List<WebElement> rowlist = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
System.out.println("rows:" +rowlist.size());
List<WebElement> columnlist = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[1]/th"));
System.out.println("column:" +columnlist.size());
for(int r=2;r<=rowlist.size();r++) {
	for(int c=1;c<=columnlist.size();c++) {
		String Data = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+ r +"]/td["+ c +"]")).getText();
		System.out.println(Data);
	}
}
	}

}
