package pkg1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class PopupDownloads {

	public static void main(String[] args) {
		//create empty profile setup for downloading zip file
		//mime type application/zip from google site point
		//to get preference type firefox url > about:config >i will be careful type saveTO copy
		
		FirefoxProfile prof=new FirefoxProfile();
		//prof.setPreference("browser.helperApps.neverAsk.saveToDisk","application/zip");
		//prof.setPreference("browser.download.folderList",0);
		//below for downloads to specific folder
		
		prof.setPreference("browser.download.folderList",2);
		prof.setPreference("browser.download.dir","D:\\yg\\y1");
		
		WebDriver driver=new FirefoxDriver(prof);
		driver.manage().window().maximize();
		driver.get("https://www.krninformatix.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//span[text()='Downloads']")).click();
		driver.findElement(By.xpath("//a[text()='Downloads']")).click();
		driver.findElement(By.xpath("//a[@href='https://goo.gl/uJJ5Sc']")).click();
		//system terminology this popup will call as save to Disk popup file 
		

	}

}
