package seleniumtestcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase1 {

	@Test
	public void TestCase() throws InterruptedException {
		
		//here testcase could be hit url on the browser and print title of the page on console
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nidhi\\BrowserDriverSelenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //used for waiting the object to show on the page, if they are not shown will be wait for the shown
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		//System.out.println("This is just a simple run");
		//driver.close();
		
		//test case for invalid credential and go to forgot password page
		
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000); // something to get into stable state
		//driver.findElement(By.xpath("//input[@placeholder = 'Name']")).sendKeys("john");
		//driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");
		//driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
		//driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");
		//driver.findElement(By.xpath("//form/input[3]")).sendKeys("9855656369");			
		//driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	    //System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		//test case for entering valid credential and sucessful login
	    driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
	    driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy"); //place *after input coz it show regular expression , paas is static and word is dynamic
	    driver.findElement(By.id("chkboxOne")).click();   //click on check box
        //click on submit button in this case in html code we have class and type attribute so this time use regular expression using xpath
	    //driver.findElement(By.xpath("//button[@type='submit signInBtn']")).click();
	    driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
	}

}
