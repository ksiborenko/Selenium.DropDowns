package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class Passengers {

    private WebDriver driver;

    public Passengers(WebDriver driver) {
        this.driver = driver;
    }

    public void test() {
        this.driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        this.driver.findElement(By.cssSelector("#divpaxinfo")).click();
        WebDriverWait wait = new WebDriverWait(this.driver, 2);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@id='hrefIncAdt']"))).click();
        for (int x = 0; x < 4; x++) {
            this.driver.findElement(By.id("hrefIncAdt")).click();
        }
        this.driver.findElement(By.xpath("//span[@id='hrefIncChd']")).click();
        this.driver.findElement(By.xpath("//span[@id='hrefIncInf']")).click();
        this.driver.findElement(By.cssSelector("#btnclosepaxoption")).click();
        String passengersList = this.driver.findElement(By.cssSelector("#divpaxinfo")).getText();
        assertEquals("6 Adult, 1 Child, 1 Infant", passengersList);
    }
}
