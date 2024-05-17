import org.openqa.selenium.chrome.ChromeDriver;
public class LaunchChromeWD {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nidhi\\BrowserDriverSelenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
driver.get("http://www.google.com");
	}

}
