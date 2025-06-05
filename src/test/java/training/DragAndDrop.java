package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.switchTo().frame(0);
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.dragAndDrop(driver.findElement(By.xpath("//div[@id=\"draggable\"]")), driver.findElement(By.xpath("//div[@id=\"droppable\"]"))).perform();
		
		
	}

}
