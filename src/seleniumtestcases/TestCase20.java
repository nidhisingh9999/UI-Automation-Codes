package seleniumtestcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase20 {

	public static void main(String[] args) throws AWTException {
		// launch browser
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nidhi\\BrowserDriverSelenium\\chromedriver_win32\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
//open url
driver.get("https://demoqa.com/upload-download");
//loacte webelment-choose file , Note - in html property if type = "File" given then only we can use sendKeys() method
//driver.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys("C:\\Users\\Nidhi\\Desktop\\NIDHI SINGH.docx");
WebElement wb = driver.findElement(By.xpath("//input[@id='uploadFile']"));
Actions act = new Actions(driver);
act.moveToElement(wb).click().build().perform();
Robot rb = new Robot();
rb.delay(2000);
//copy file path into clipboard
StringSelection ss = new StringSelection("C:\\Users\\Nidhi\\Desktop\\NIDHI SINGH.docx");
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//perform control + V action to paste file
//to press key
rb.keyPress(KeyEvent.VK_CONTROL);
rb.keyPress(KeyEvent.VK_V);

//to release key
rb.keyRelease(KeyEvent.VK_CONTROL);
rb.keyRelease(KeyEvent.VK_V);

//to press enter key
//to release enter key
rb.keyPress(KeyEvent.VK_ENTER);
rb.keyRelease(KeyEvent.VK_ENTER);

	}

}
