package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(null)
		driver.get("https://www.krninformatix.com/");
		
		
		//mouse over on element
		WebElement CoursesOffered=driver.findElement(By.xpath("//a[text()='Courses Offered']"));
		Actions act=new Actions(driver);
		act.moveToElement(CoursesOffered).perform();
		act.contextClick(CoursesOffered).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		
		//	COMBINATION KEYS EX; ALT+CTL+DELETE  use build between and finally perform
		act.sendKeys(Keys.ALT).build();
		act.sendKeys(Keys.CONTROL).build();
		act.sendKeys(Keys.DELETE).perform();
		
	}

}
