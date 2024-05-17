package seleniumtestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase18 {

	public static void main(String[] args) {
		// to perform drag and drop action
		//launch chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nidhi\\BrowserDriverSelenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//open url
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		//find source and target web element
		WebElement source = driver.findElement(By.id("box6"));//rome
		WebElement target = driver.findElement(By.id("box106"));//italy
		//for mouse action need to create object of Actions class
		Actions act = new Actions(driver);
		//perform drag and drop action--> dragAndDrop(sourceElement , targetElement);
		act.dragAndDrop(source, target).build().perform();
		
		
		
	}

}
