package org.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automate_A_Site {
	public void stringProgram() {
		String s = "Ashwina is a tester";
		String rev = "";
		
//		String[] split = s.split(" ");
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
	}

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Automate_A_Site a = new Automate_A_Site();
		a.stringProgram();

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashwin_Prasath\\eclipse-workspace\\Maven\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://dev.to/mikotian");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		List<WebElement> headersList = driver.findElements(By.xpath("//h2[@class='crayons-story__title']/child::a"));
		for (int i = 0; i < headersList.size(); i++) {
			String headersText = headersList.get(i).getText();
//			System.out.println(headersText);
			
			if (headersText.equals("Resiliency")) {
				headersList.get(i).click();
			}else if (headersText.equals("ChaosToolkit Basics")) {
				headersList.get(i).click();
			}else if (headersText.equals("To need a MockingBird")) {
				headersList.get(i).click();
			}
		}
	}
}
