package testSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testclass {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.navigate().to("manager");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(39, TimeUnit.SECONDS);
		/*
		 * driver.navigate().refresh(); System.out.println("----"); String
		 * c=driver.getCurrentUrl(); System.out.println(c); String s=driver.getTitle();
		 * System.out.println(s);
		 */
		WebElement web=driver.findElement(By.className("//*[@class=\"secondary\"]"));
		Select sel=new Select(web);
		List<WebElement> ele=sel.getOptions();
		System.out.println(ele.size());
		for(int i=0;i<ele.size();i++)
		{
			String str=ele.get(i).getText();
			System.out.println(str);
		}
		
	    
		
		
		driver.findElement(By.xpath("//*[@id=\"header-navbar\"]/ul[1]/li[1]/div/div[1]/div[1]/div/div[1]/p[1]/a")).click();
				//*[@id="header-navbar"]/ul[1]/li[1]/div/div[1]/div[1]/div/div[1]/p[1]/a
				
		
	}

}
