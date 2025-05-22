package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserActions {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		driver.findElement(By.xpath("//span[text()='Downloads']")).click();
		//Thread.sleep(3000); // wait for 3 second
	
		//click on back button
		driver.navigate().back();
		//click on forward button
		driver.navigate().forward();
		//click on refresh button
		driver.navigate().refresh();
		//close the browser
		driver.close();

	}

}
