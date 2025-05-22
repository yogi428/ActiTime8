package pkg1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/");

		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//below explicitly wait for logiout element, perticular element
		//use webdriverwait class for perticular element wait
		//WebDriverWait wait=new WebDriverWait(driver, 25);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
//		
//		//for clickable and drop down change above method
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink")));
		

	}

}
