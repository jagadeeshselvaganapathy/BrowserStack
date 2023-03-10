package com.demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileBrowserType;
import io.appium.java_client.remote.MobileCapabilityType;

public class BrowserStack {

	WebDriver driver;
	
	public static final String UserName = "jagadeesh_fKpl7b";
	
	public static final String AutomateKey= "JybmMjv9aYXwps7TMbpC";

	public static final String URL = "http://" + UserName + ":" + AutomateKey + "@hub-cloud.browserstack.com/wd/hub";
	
	
	
	
	@BeforeTest
	private void setup() throws MalformedURLException {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("os_version", "16");
		caps.setCapability("device", "iPhone 14");
		caps.setCapability("build", "chrome Browser Script");
		caps.setCapability("name", "Run chrome in device");
		caps.setCapability("browserstack.local", "false");
		caps.setCapability("browserstack.debug", "true");

	
		
	//	driver = new RemoteWebDriver(new URL(URL),caps);
		
		
	}
	
	
	@Test
	private void LanchBrowser() throws InterruptedException {
		Thread.sleep(7000);
		driver.get("https://www.facebook.com/");
//		boolean contains = driver.getCurrentUrl().contains("xyz");
//		Assert.assertTrue(contains);
	
		Thread.sleep(7000);
		WebElement element = driver.findElement(By.name("email"));
		
		element.sendKeys("jagadeesh");
		Thread.sleep(7000);
		boolean contains = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).getText().contains("xyz");
		
		
		 driver.findElement(By.name("pass")).sendKeys("012345");
		 Thread.sleep(7000);
		 
		
		
	}
	@AfterTest
	private void taerDown() {
    
		driver.quit();

		
		
	}
	
 
		
		
	}
	
}
