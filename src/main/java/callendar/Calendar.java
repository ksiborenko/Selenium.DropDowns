package callendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class Calendar {

    private WebDriver driver;

    public Calendar(WebDriver driver) {
        this.driver = driver;
    }

    public void test() {
        this.driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        this.driver.findElement(By.id("alertbtn")).click();
        String text = this.driver.switchTo().alert().getText();
        assertEquals("Hello , share this practice page and share your knowledge", text);
        this.driver.switchTo().alert().accept();
    }

}
