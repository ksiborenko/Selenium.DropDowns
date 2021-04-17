package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;

public class Currency {

    private WebDriver driver;

    public Currency(WebDriver driver) {
        this.driver = driver;
    }

    public void test() {
        this.driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        WebElement dropList = this.driver.findElement(By.xpath("//select[@name='ctl00$mainContent$DropDownListCurrency']"));
        Select list = new Select(dropList);
        list.selectByIndex(3);
        String fourth = list.getFirstSelectedOption().getText();
        assertEquals("USD", fourth);
        list.selectByIndex(2);
        String third = list.getFirstSelectedOption().getText();
        assertEquals("AED", third);
        list.selectByIndex(1);
        String second = list.getFirstSelectedOption().getText();
        assertEquals("INR", second);
        list.selectByIndex(0);
        String first = list.getFirstSelectedOption().getText();
        assertEquals("Select", first);
    }
}
