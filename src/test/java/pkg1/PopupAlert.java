package pkg1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupAlert {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\chromedriver.exe");
		System.setProperty("webdriver.firefox.driver", "E:\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.krninformatix.com/selenium/testing");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[text()='Generate Alert Box']")).click();
		
		//Thread.sleep(3000);
		driver.switchTo().alert().accept();
		String alrt=driver.switchTo().alert().getText();
		System.out.println(alrt);
		//driver.switchTo().alert().accept();
		

	}

}
