package jyoti.slelnuim.addressbook.addressbook;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

public class AddressBook {
	@Test
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/home/edureka/geckodriver");
		FirefoxOptions options = new FirefoxOptions();
		WebDriver driver = new FirefoxDriver(options);
		//WebDriver driver = new ChromeDriver(chromeOptions);
		System.out.println("Hi, Welcome to Edureka's YouTube Live session on Selenium WebDriver");
		driver.get("http://kmaster:8090/addressbook/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.className("v-button")).click();
		driver.findElement(By.id("gwt-uid-5")).sendKeys("Edureka");
		driver.findElement(By.id("gwt-uid-7")).sendKeys("DevOps");
		driver.findElement(By.id("gwt-uid-9")).sendKeys("9834562709");
		driver.findElement(By.id("gwt-uid-11")).sendKeys("Devops@edureka.co");
		driver.findElement(By.id("gwt-uid-13")).sendKeys("01/01/2015");
		driver.findElement(By.className("v-button-primary")).click(); // Thread.sleep(5000); driver.quit(); } }
	}
}