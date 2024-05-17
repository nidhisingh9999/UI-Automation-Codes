import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToolTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launch browser
		System.setProperty("webdriver.geckodriver","C:\\Users\\Nidhi\\BrowserDriverSelenium.geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//maximize browser
		driver.manage().window().maximize();
		//open url
		driver.get("https://www.facebook.com/");
		
		//find web element signup 
		//read title attribute value by using getAttribute()method 
		//verify actual tooptip match with expected tooltip or not
		String tooltipActual = driver.findElement(By.xpath("//a[@href='/reg/']")).getAttribute("title");
		String tooltipExpected = "Sign up for Facebook";
		if(tooltipActual.equals(tooltipExpected)) {
			System.out.println("Test pass");
		} else {
			System.out.println("test fail");
		}
	}
	}


