package training;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PopupTest {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/");

        // Switch to iframe
        WebElement frame = driver.findElement(By.cssSelector("iframe.demo-frame"));
        driver.switchTo().frame(frame);

        // Click the "Click Here" link
        driver.findElement(By.linkText("Click Here")).click();

        // Switch back to default content BEFORE handling windows
        driver.switchTo().defaultContent();

        // Store current window ID
        String parentWindowId = driver.getWindowHandle();

        // ✅ Wait for new window to open (window handles > 1)
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(d -> d.getWindowHandles().size() > 1);

        // Get all window handles
        Set<String> windowHandles = driver.getWindowHandles();

        // Find the child window ID
        String childWindowId = "";
        for (String windowId : windowHandles) {
            if (!windowId.equals(parentWindowId)) {
                childWindowId = windowId;
                break;
            }
        }

        // Switch to child window and perform actions
        driver.switchTo().window(childWindowId);
        System.out.println("Child window title: " + driver.getTitle());
        driver.close();

        // Switch back to parent
        driver.switchTo().window(parentWindowId);
        System.out.println("Parent window title: " + driver.getTitle());

        driver.quit();
    }
}
