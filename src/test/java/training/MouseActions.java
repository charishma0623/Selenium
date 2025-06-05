package training;


import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/selectmenu/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//Thread.sleep(5000);
		Actions act = new Actions(driver);
		//Thread.sleep(5000);
		act.moveToElement(driver.findElement(By.linkText("Contribute"))).build().perform();
		System.out.println("clicked on point me.");
		//Thread.sleep(7000);
		driver.findElement(By.linkText("CLA")).click();
		System.out.println("clicked on mobiles.");
		System.out.println("Page title: " + driver.getTitle());
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // Keep browser open until user presses Enter
        new Scanner(System.in).nextLine();
				
		
	}
	
}
