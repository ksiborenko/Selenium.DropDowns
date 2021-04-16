import dropdown.Currency;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Main {

    private WebDriver driver;
    private Currency currency;

    @Before
    public void setup() {
        WebDriverManager.edgedriver().setup();
        this.driver = new EdgeDriver();
        this.currency = new Currency(this.driver);
    }

    @Test
    public void test() {
        this.currency.test();
    }
    @After
    public void end () {
        this.driver.quit();
    }

}
