package checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class CheckBox {

    private final WebDriver driver;

    public CheckBox(WebDriver driver) {
        this.driver = driver;
    }

    public void test() throws InterruptedException {
        this.driver.get("https://www.spicejet.com/");
        this.driver.manage().window().fullscreen();
        List<WebElement> checkBoxes = this.driver.findElements(By.cssSelector("input[type='checkbox']"));
        for (int checkBoxIndex = 1; checkBoxIndex < checkBoxes.size(); checkBoxIndex++) {
            Thread.sleep(1000);
            checkBoxes.get(checkBoxIndex).click();
            assertTrue(checkBoxes.get(checkBoxIndex).isSelected());
        }
    }
}

