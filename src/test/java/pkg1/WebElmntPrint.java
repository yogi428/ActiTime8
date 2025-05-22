package pkg1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElmntPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(null)
		driver.get("https://www.krninformatix.com/");
		//driver.findElement(By.xpath("//a[text()='Services']")
		//WebElement link= driver.findElement(By.xpath("//a"));
		List<WebElement> list=driver.findElements(By.tagName("a"));
		for(WebElement li:list ) {
			
			System.out.println(li.getText() +" -"+li.getDomAttribute("href"));
			
		}
	
		

	}

}
