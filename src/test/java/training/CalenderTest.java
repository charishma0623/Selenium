package training;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CalenderTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/date-picker");
		WebElement element = driver.findElement(By.id("datePickerMonthYearInput"));
		String date = "04-13-2026";
		pickDateByJS(driver,element,date);
	}

	public static void pickDateByJS(WebDriver driver,WebElement element,String date) {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value=arguments[1]",element,date);
		js.executeScript("var event = new Event('change', { bubbles: true });" +"arguments[0].dispatchEvent(event);", element);
		}
}
