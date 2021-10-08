package com.utiliti;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestBase_Base {

	public static WebDriver driver;
	public static Properties proo;
	
	public TestBase_Base() {
		
		try {
			FileInputStream files = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\configg\\configgg");
			
			proo = new Properties();
			proo.load(files);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void intz() {
		String browser1 = "Chrome";
		String browser2 = "FF";
		if(browser1.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\Webdriver\\chromedriver.exe" );
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(utilityy.page_Load_Timeout, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(utilityy.implicitly_Wait, TimeUnit.SECONDS);
			}
		else if(browser2.equalsIgnoreCase("FF"));
		}
	public static void launchURL(String URLURL) {
		
		driver.get(proo.getProperty("QA"));
	}

}
