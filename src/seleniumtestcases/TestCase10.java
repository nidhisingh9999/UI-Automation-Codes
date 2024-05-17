package seleniumtestcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase10 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nidhi\\BrowserDriverSelenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://spectrum.avanceglobal.in/home/health-Insurance");
		WebElement element = driver.findElement(By.id("select-default"));
		Select DropDown = new Select(element);
		DropDown.selectByIndex(3);
		//to select multiple options in dropdown
		if(DropDown.isMultiple()==true) {
			System.out.println("dropdown is multiple");
		}
		else
		{
			System.out.println("drop down is not multiple");
		}
		//if wants to print all options of dropdown
		List<WebElement> alldropdownoptions = DropDown.getOptions();
		System.out.println("All options: " +alldropdownoptions.size());
		for(WebElement el:alldropdownoptions ) {
			System.out.println(el.getText());
		}
		driver.close();
	}
	

}
