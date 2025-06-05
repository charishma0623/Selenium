package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frametest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tiny.cloud/docs/tinymce/latest/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.switchTo().frame("default-editor_ifr");
		String text = driver.findElement(By.xpath("//body[@id=\"tinymce\"]")).getText();
		System.out.println(text);
		}

}
