package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelnLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		WebElement login=driver.findElement(By.xpath("//a[text()=' LOGIN ']"));
		login.click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//a[text()=' LOGIN ']")).click();

	}

}
