package pkg1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TooltipQnsmarkText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/samsung-galaxy-f16-5g-bling-black-128-gb/p/itm98473f83de0f1?pid=MOBH9ASGZWYBDPUD&lid=LSTMOBH9ASGZWYBDPUDPEFY5L&marketplace=FLIPKART&fm=neo%2Fmerchandising&iid=M_df5e19ef-5e86-403f-b370-942de6191319_1_1BUWY8OBA8L9_MC.MOBH9ASGZWYBDPUD&ppt=pp&ppn=pp&ssid=37jbw94m6o0000001745398736671&otracker=clp_pmu_v2_Latest%2BSamsung%2Bmobiles%2B_1_1.productCard.PMU_V2_SAMSUNG%2BGalaxy%2BF16%2B5G%2B%2528Bling%2BBlack%252C%2B128%2BGB%2529_samsung-mobile-store_MOBH9ASGZWYBDPUD_neo%2Fmerchandising_0&otracker1=clp_pmu_v2_PINNED_neo%2Fmerchandising_Latest%2BSamsung%2Bmobiles%2B_LIST_productCard_cc_1_NA_view-all&cid=MOBH9ASGZWYBDPUD");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//how to find text of ? attribute
		//String txt=driver.findElement(By.xpath("//span[@class='question']")).click(getText);
		String txt=driver.findElement(By.xpath("//span[@class='question']")).getAttribute("class");
		
		//String txt=driver.findElement(By.xpath("//span[@class='question']")).getText();
		System.out.println(txt);


	}

}
