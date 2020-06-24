package org.base;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.FileChooserUI;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseAmazon {
	public static WebDriver driver;


	public static WebDriver getDriver() {

		System.setProperty("webdriver.chrome.driver", "E:\\Amazon\\driver\\chromedriver.exe");
		driver= new ChromeDriver();
		return driver;
	}

	public static void getUrl(String url) {
		driver.get(url);
	}

	public static WebElement type(WebElement element,String type) {
		element.sendKeys(type);
		return element;
	}

	public static void maximize() {

		driver.manage().window().maximize();
	}

	public static void waitimplict() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);

	}

	public static WebElement find(String xpath) {
		return driver.findElement(By.xpath(xpath));

	}

	public static void takescreenshot(String despath) throws IOException {
		TakesScreenshot tk= (TakesScreenshot)driver;
		File source = tk.getScreenshotAs(OutputType.FILE);
		File destination= new File(despath);
		FileUtils.copyFile(source, destination);

	}

}
