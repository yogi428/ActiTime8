package pkg1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupTooltip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//.get("https://www.gsmarena.com/samsung-phones-9.php");
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		//driver.findElement(By.xpath("//input[@type='checkbox']")).
		//driver.manage().timeouts().implicitlyWait(seconds)
		//tool tip image of value
//		String char[] toolTipVal = driver.findElement(By.xpath("//img[contains(@src,'m56-5g')]")).getDomAttribute("title");
//		System.out.println(toolTipVal);

	}

}
