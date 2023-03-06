package com.demo;

import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.remote.MobileBrowserType;
import io.appium.java_client.remote.MobileCapabilityType;

public class BrowserStackTwo {
	WebDriver driver;
	String username = System.getenv("BROWSERSTACK_USERNAME");
	String accessKey = System.getenv("BROWSERSTACK_ACCESS_KEY");
	String buildName = System.getenv("BROWSERSTACK_BUILD_NAME");
	
	private void inpet() throws MalformedURLException {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("os", "Windows");
		caps.setCapability("os_version", "10");
		caps.setCapability("browser", "Chrome");
		caps.setCapability("browser_version", "109.0");
		caps.setCapability("browserstack.local", "false");
		caps.setCapability("browserstack.selenium_version", "3.14.0");

		caps.setCapability("name", "BStack-[Java] Sample Test"); // test buildName
		caps.setCapability("build", buildName); // CI/CD job name using BROWSERSTACK_BUILD_NAME env variable
		  
		driver = new RemoteWebDriver(new URL("https://" + username + ":" + accessKey + "@hub.browserstack.com/wd/hub"), caps);
		
		driver.get("https://www.facebook.com/");
//		boolean contains = driver.getCurrentUrl().contains("xyz");
//		Assert.assertTrue(contains);
	
		
		WebElement element = driver.findElement(By.name("email"));
		
		element.sendKeys("jagadeesh");
		
	
		
		
	}
	public static void main(String[] args) throws MalformedURLException {
		
		BrowserStackTwo b = new BrowserStackTwo();
		b.inpet();
		
		
		
		
	}
	

	
	
	


}
