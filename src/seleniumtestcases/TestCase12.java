package seleniumtestcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase12 {

	public static void main(String[] args) {
		//to count radio buttons on web page
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nidhi\\BrowserDriverSelenium\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://udyamregistration.gov.in/Udyam_Login.aspx");
        //find radio buttons web element on web page
        List <WebElement> radioButtonList = driver.findElements(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_rblUamOtp_0']"));
        
        //total number of radiobutton on web page
        System.out.println("Total number of radio button: " +radioButtonList.size());
        driver.close();
	}

}
