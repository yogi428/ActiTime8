package pkg1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeValue {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.krninformatix.com/sample");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	//Finding attribute value of any element, example for below element
		//<a class="myclass" href="https://www.google.com">Google</a>
		String AttValue=driver.findElement(By.xpath("//a[text()='Google']")).getAttribute("href");
		String AttValue2=driver.findElement(By.xpath("//a[text()='Google']")).getAttribute("class");
		String AttValue2=driver.findElement(By.xpath("//a[text()='Google']")).getAttribute("Class");
		@SuppressWarnings("deprecation")
		String atvl=driver.findElement(By.xpath("//input[@value='Login']")).getAttribute("id");
		System.out.println(AttValue);
		System.out.println(atvl);
	}

}
