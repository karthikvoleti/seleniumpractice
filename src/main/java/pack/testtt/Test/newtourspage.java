package pack.testtt.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class newtourspage {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("hello");

		System.setProperty("webdriver.chrome.driver","/Users/karthikvoleti/Documents/jars/chromedriver");
		ChromeOptions options= new ChromeOptions();
		options.addArguments("disable-infobars");
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		Thread.sleep(5000);
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("katty");
		driver.findElement(By.name("lastName")).sendKeys("katty");
		driver.findElement(By.name("phone")).sendKeys("9885374850");
		driver.findElement(By.name("userName")).sendKeys("kattysecure@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("addressline 1");
		driver.findElement(By.name("address2")).sendKeys("address line 2");
		driver.findElement(By.name("city")).sendKeys("city");
		driver.findElement(By.name("state")).sendKeys("state");
		driver.findElement(By.name("postalCode")).sendKeys("500026");
		Select s= new Select(driver.findElement(By.name("country")));
		s.selectByVisibleText("INDIA");
		driver.findElement(By.name("email")).sendKeys("katty");
		driver.findElement(By.name("password")).sendKeys("katty");
		driver.findElement(By.name("confirmPassword")).sendKeys("katty");
		driver.findElement(By.name("register")).click();
		
		
	}

}
