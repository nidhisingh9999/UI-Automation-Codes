import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class LaunchEdgeWD {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Nidhi\\BrowserDriverSelenium\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.youtube.com/");
		


	}

}
