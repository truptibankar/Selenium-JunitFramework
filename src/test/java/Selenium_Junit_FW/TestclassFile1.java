package Selenium_Junit_FW;

//import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
//import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestclassFile1 {
	WebDriver driver;
	String Base_url = "https:/amazon.in";
	//int implicit_wait = 20;
	@Before
	public void set_up()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@After
	public void clean()
	{
		driver.quit();
		
	}
	

	}
