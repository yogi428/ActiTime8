package pkg1;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//img[@alt='Mobiles']")).click();
		WebElement tv= driver.findElement(By.xpath("//span[text()='TVs & Appliances']"));
		Actions act=new Actions(driver);
		act.moveToElement(tv).perform();
		driver.findElement(By.xpath("//a[text()='Washing Machine']")).click();
		driver.findElement(By.xpath("//div[text()='BOSCH']")).click();
//		act.contextClick(fashion).perform();
//		//act.sendKeys(Keys.ARROW_DOWN).perform();
//		
		//driver.findElement(By.linkText("Men's Grooming")).click();
	}

}
