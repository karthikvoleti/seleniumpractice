package pack.testtt.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;



public class Register {

	static void Signin() throws InterruptedException
	{
	
	
	//Global.driver.get("http://newtours.demoaut.com/");
	//Global.driver.manage().window().maximize();
	Thread.sleep(10000);
	Global.driver.findElement(By.linkText("REGISTER")).click();
	Global.driver.findElement(By.name("firstName")).sendKeys("katty");
	Global.driver.findElement(By.name("lastName")).sendKeys("katty");
	Global.driver.findElement(By.name("phone")).sendKeys("9885374850");
	Global.driver.findElement(By.name("userName")).sendKeys("kattysecure@gmail.com");
	Global.driver.findElement(By.name("address1")).sendKeys("addressline 1");
	Global.driver.findElement(By.name("address2")).sendKeys("address line 2");
	Global.driver.findElement(By.name("city")).sendKeys("city");
	Global.driver.findElement(By.name("state")).sendKeys("state");
	Global.driver.findElement(By.name("postalCode")).sendKeys("500026");
	Select s= new Select(Global.driver.findElement(By.name("country")));
	s.selectByVisibleText("INDIA");
	Global.driver.findElement(By.name("email")).sendKeys("katty");
	Global.driver.findElement(By.name("password")).sendKeys("katty");
	Global.driver.findElement(By.name("confirmPassword")).sendKeys("katty");
	Global.driver.findElement(By.name("register")).click();
	System.out.println("hi");
	}
	static void driverOpen() throws InterruptedException
	{

	System.setProperty("webdriver.chrome.driver","/Users/karthikvoleti/Documents/jars/chromedriver");
	ChromeOptions options= new ChromeOptions();
	options.addArguments("disable-infobars");
	options.addArguments("--disable-notifications");
	Global.driver=new ChromeDriver(options);
	Thread.sleep(5000);
	Global.driver.get("http://newtours.demoaut.com/");
	Global.driver.manage().window().maximize();
	Thread.sleep(10000);

	}
	}


