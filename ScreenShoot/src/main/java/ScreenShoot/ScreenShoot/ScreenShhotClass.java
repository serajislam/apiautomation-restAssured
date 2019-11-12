package ScreenShoot.ScreenShoot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ScreenShhotClass {

	@Test
	 public void TestJavaS1()
	{
	// Open Firefox
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mislam18\\2.41\\Source\\Media\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 
	// Maximize the window
	driver.manage().window().maximize();
	 
	// Pass the url
	driver.get("http://www.google.com");
	 
	// Take screenshot and store as a file format
	File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
	 // now copy the  screenshot to desired location using copyFile //method
	FileUtils.copyFile(src, new File("C:\\Users\\mislam18\\Desktop\\APIAutomation\\ScreenShoot\\screenshhot.png"));
	}
	 
	catch (IOException e)
	 {
	  System.out.println(e.getMessage());
	 
	 }
	 }


}
