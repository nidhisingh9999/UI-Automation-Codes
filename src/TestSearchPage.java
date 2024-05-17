import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSearchPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nidhi\\BrowserDriverSelenium\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("www.smcinsurance.com/search");
//check if the searchpage is displayed correctly or not
if(isSearchPagePageDisplayed(driver)) {
	System.out.println("Search Page is displayed correctly");
}else {
	System.out.println("Search Page is not displayed correctly");
}
	driver.quit();
	}

	// Define a method to check if the search page is displayed correctly
	public static boolean isSearchPagePageDisplayed(WebDriver driver) {
		By searchBoxLocator = By.id("search-box");
		By searchButtonLocator = By.id("search-button");
		
		try {
			WebElement searchBox = driver.findElement(searchBoxLocator);
			WebElement searchButton = driver.findElement(searchButtonLocator);
			return searchBox.isDisplayed()&& searchButton.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}
}
