package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Country {

    private WebDriver driver;

    public Country(WebDriver driver) {
        this.driver = driver;
    }

    public void test() throws InterruptedException {
        this.driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        this.driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("pol");
        Thread.sleep(1000);
        List<WebElement> options = this.driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
        for (WebElement option : options) {
            if (option.getText().equalsIgnoreCase("poland")) {
                option.click();
                break;
            }
        }
    }
}
