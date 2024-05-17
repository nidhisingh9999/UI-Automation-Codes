package seleniumtestcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase9 {

	public static void main(String[] args) {
		// Handling of Dropdown using select class
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nidhi\\BrowserDriverSelenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
driver.get("https://www.opencart.com/index.php?route=account/register");
WebElement element = driver.findElement(By.id("input-country"));
//here need to intract with dropdown and that dropdown created on webpage using select tag
//so here use select class and create variable of select class
Select dropdown = new Select(element);
//now have to select options from dropdown
dropdown.selectByVisibleText("American Samoa");
//dropdown.selectByValue("30");
//dropdown.selectByIndex(1);
//to select multiple options in dropdown
if(dropdown.isMultiple()== true) {
	System.out.println("drop down is multiple");
}
else {
	System.out.println("drop down is not multiple");
}
	
	//if wants to print all options of dropdown
	List<WebElement> alldropdownoptions = dropdown.getOptions();
	System.out.println("Total options: " + alldropdownoptions.size());
	for(WebElement el:alldropdownoptions ) {
		System.out.println(el.getText());
	}
	}

}
