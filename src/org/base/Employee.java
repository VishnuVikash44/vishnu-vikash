package org.base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Employee {
public static void main(String[] args) throws IOException  {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\KEERTHURAMYA\\eclipse-workspace\\Screenshot\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	TakesScreenshot ts = (TakesScreenshot) driver;
	File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
	System.out.println(screenshotAs);
	//to move to the desired loction
	File file = new File("E:\\viiuhiuhg\\filename.png");
	FileUtils.copyFile(screenshotAs, file);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
