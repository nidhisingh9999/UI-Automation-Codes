package seleniumtestcases;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase11 {

	

	
	public static void main(String[] args) {
		//How to find broken links/dead links on a web page
		//launch chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nidhi\\BrowserDriverSelenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//maximize browser
		driver.manage().window().maximize();
		//for load time of webpage use wait for 10 sec
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.deadlinkcity.com/");
		
		//find hyperlinks
		List<WebElement> Linklist = driver.findElements(By.tagName("a"));
		
		int resCode = 200;
		int brokenLinkCount = 0; //to main no of brokenlink initialise variable
		System.out.println("Total Links on Page:" +Linklist.size());
		//to capture url of all links - we get url by using href attribute
		for(WebElement wb:Linklist ) {
			String url = wb.getAttribute("href");
			//now url variable use to create object of url class
			try
			{
			URL urlLink = new URL(url);	
			//URLConnection huc = urlLink.openConnection();
			HttpURLConnection huc = (HttpURLConnection)urlLink.openConnection();
			//after opening all links , send request to that then connect connect
			huc.setRequestMethod("HEAD");
			huc.connect();
			resCode = huc.getResponseCode(); //by using this method we store ResponseCode into resCode variable and then check into if condition  
			//after conncet the connect whatever response code we get to store into variable
			if(resCode>=400) {
				System.out.println(url + "BrokenLink");
				brokenLinkCount++;
			}
			
			} 
			catch(MalformedURLException e) {
				
			}
			catch(Exception e)
			{
				
			}
		}
		System.out.println("Total Broken Links: " +brokenLinkCount);
	}

}
