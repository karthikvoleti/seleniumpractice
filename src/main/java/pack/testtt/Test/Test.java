package pack.testtt.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");

		System.setProperty("webdriver.chrome.driver","/Users/karthikvoleti/Documents/jars/chromedriver");
		ChromeOptions options= new ChromeOptions();
		options.addArguments("disable-infobars");
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.outlook.com");
		driver.manage().window().maximize();
		
		
	}

}
