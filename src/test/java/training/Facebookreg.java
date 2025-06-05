package training;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebookreg {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("abcd",Keys.ENTER);
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("efgh");
		Select day = new Select(driver.findElement(By.xpath("//select[@id=\"day\"]")));
		day.selectByValue("7");
		Select month = new Select(driver.findElement(By.xpath("//select[@id=\"month\"]")));
		month.selectByValue("8");
		Select year = new Select(driver.findElement(By.xpath("//select[@id=\"year\"]")));
		year.selectByValue("2003");
		driver.findElement(By.xpath("//input[@id=\"sex\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("abcd@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]")).sendKeys("abcdefgh");
		//driver.navigate().back();
		driver.findElement(By.xpath("//button[@name=\"websubmit\"]")).click();
		System.out.println("creating account.");
	}

}
