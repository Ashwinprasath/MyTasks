package org.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashwin_Prasath\\eclipse-workspace\\Maven\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://material.angular.io/components/select/overview");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//div[@id='mat-select-value-1']")).click();
		driver.findElement(By.xpath("//span[text()=' Pizza ']")).click();
		
		WebElement selectCar = driver.findElement(By.xpath("//select[@id='mat-input-0']"));
		Select s = new Select(selectCar);
		s.selectByValue("mercedes");
		
	}
}
