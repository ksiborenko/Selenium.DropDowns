package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FromTo {

    private final WebDriver driver;

    public FromTo(WebDriver driver) {
        this.driver = driver;
    }

    public void test() throws InterruptedException {
        this.driver.get("https://www.spicejet.com/");
        this.driver.manage().window().fullscreen();
        WebElement list = this.driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']"));
        Actions actions = new Actions(this.driver);
        actions.moveToElement(list).click().perform();
        Thread.sleep(1000);
        this.driver.findElement(By.linkText("Bathinda (BUP)")).click();
        Thread.sleep(1000);
        this.driver.findElement(By.linkText("Delhi (DEL)")).click();
    }
}
