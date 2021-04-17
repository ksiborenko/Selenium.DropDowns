package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FromTo {

    private WebDriver driver;

    public FromTo(WebDriver driver) {
        this.driver = driver;
    }
    public void test () {
        this.driver.get("https://www.spicejet.com/");
        this.driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();

    }
}
