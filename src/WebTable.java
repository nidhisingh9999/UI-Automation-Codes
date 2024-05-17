import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launch chrome 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nidhi\\BrowserDriverSelenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//open url
		driver.get("C:\\Users\\Nidhi\\eclipse-workspace\\WebUISelenium2\\sampletable.html");
		//print the data of second cell
		//String text = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();
		//System.out.println(text);
		// total number of rows and columns on webtable
		List <WebElement> rowlist = driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println("rows:" +rowlist.size());
		List <WebElement> columnlist = driver.findElements(By.xpath("//table/tbody/tr[1]/th"));
		System.out.println("colums:" +columnlist.size());
		//print data to all cell - we use loop 
		//first forloop use for row and second for loop use for column
        for(int r=2; r<=rowlist.size();r++) {
        	for(int c=1; c<=columnlist.size();c++) {
        		//read web element or find web element
        		String data = driver.findElement(By.xpath("//table/tbody/tr["+ r +"]/td["+ c +"]")).getText();	
        	System.out.println(data);
        	}
        }
	}

}
