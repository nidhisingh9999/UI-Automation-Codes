package seleniumtestcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
public class TestCase2 {

	public static void main(String[] args) {
		// Load the website homepage, click on the “login” link, 
		//verify that the Login screen appears and the “username” and “password” fields are visible
      System.setProperty("webdriver.chrome.driver","C:\\Users\\Nidhi\\BrowserDriverSelenium\\chromedriver_win32\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https://spectrum.avanceglobal.in/");
      //click on the login link
      WebElement loginLink = driver.findElement(By.linkText("login"));
      //verify that login screen appears
      WebElement loginScreen = driver.findElement(By.id("login-screen"));
      if(loginScreen.isDisplayed()) {
    	  System.out.println("Login screen is Displayed");
    	  // Verify that the "username" and "password" fields are visible
    	  WebElement usernameField = driver.findElement(By.id("username"));
    	  WebElement passwordField = driver.findElement(By.id("password"));
    	  if(usernameField.isDisplayed() && passwordField.isDisplayed()) {
    		  System.out.println("Username and password are visible");
    	  }else {
    		  System.out.println("Username and Password are not visible");
    	  }
      }else {
    	  System.out.println("login screen is not visible");
      }
      driver.quit();
	}
	

}
