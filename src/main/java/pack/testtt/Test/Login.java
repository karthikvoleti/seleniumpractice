package pack.testtt.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Login {
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Register.driverOpen();
		Register.Signin();
		System.out.println("done with login");
		//Global.driver.quit();

	}

}
