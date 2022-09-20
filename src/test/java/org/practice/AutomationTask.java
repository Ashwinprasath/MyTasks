package org.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTask {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ashwin_Prasath\\eclipse-workspace\\Practice\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://material.angular.io/components/table/overview");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement table = driver.findElement(By.xpath("//table[@class= 'mat-table cdk-table mat-elevation-z8']"));
		
		List<WebElement> headersList = table.findElements(By.tagName("th"));
		for (int i = 0; i < headersList.size(); i++) {
			System.out.print(headersList.get(i).getText()+"      ");
		}
		List<WebElement> tableRow = table.findElements(By.tagName("tr"));
		for (int i = 0; i < tableRow.size(); i++) {
			WebElement rows = tableRow.get(i);
			List<WebElement> tableData = rows.findElements(By.tagName("td"));
			for (int j = 0; j < tableData.size(); j++) {
				System.out.print(tableData.get(j).getText()+"      ");
			}System.out.println();
		}
	}
}
