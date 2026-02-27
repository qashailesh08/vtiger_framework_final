package com.eva.my.tng.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Flipkart {
	@Test
	public static void flipkartAutomation() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		WebElement weSearchBox = driver.findElement(By.xpath("//input[@name='q']"));
		weSearchBox.sendKeys("Redmi 5G Phone", Keys.ENTER);
		// Phone Name
		List<WebElement> listPhoneName = driver.findElements(By.xpath("//div[@class='RG5Slk']"));
		// Phone Price
		List<WebElement> listPhonePrice = driver.findElements(By.xpath("//div[@class='hZ3P6w DeU9vF']"));
		for (int i = 0; i <= listPhoneName.size() - 1; i++) {
			listPhoneName = driver.findElements(By.xpath("//div[@class='RG5Slk']"));
			WebElement wePHName = listPhoneName.get(i);
			String strName = wePHName.getText();
			System.out.println("Name:- " + strName);
			for (int j = 0; j <= listPhonePrice.size() - 1; j++) {
				listPhonePrice = driver.findElements(By.xpath("//div[@class='hZ3P6w DeU9vF']"));
				WebElement wePrice = listPhonePrice.get(j);
				String strPrice = wePrice.getText();
				System.err.println("Price:- " + strPrice);
				break;
			}

		}

		driver.findElement(By.xpath("(//div[text()='REDMI 13 5G (Orchid Pink, 128 GB)'])[1]")).click();
	}
}
