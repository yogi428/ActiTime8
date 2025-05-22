package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(null)
		driver.get("https://www.krninformatix.com/");
		
		
		//mouse over on element
		WebElement Branches=driver.findElement(By.xpath("//a[text()='Branches']"));
		
		//Actions class has methods of move to element and perform and sendkeys
		Actions act=new Actions(driver);
		act.moveToElement(Branches).perform();
		WebElement Marthli=driver.findElement(By.xpath("//a[text()='Marathahalli']"));
		act.moveToElement(Marthli).perform();
		//act.contextClick(Branches).perform();
		
		
	
		
	}

} class c2{
	
}