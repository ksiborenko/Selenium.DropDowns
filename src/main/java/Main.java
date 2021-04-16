import dropdown.Currency;
import dropdown.Passengers;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Main {

    private WebDriver driver;
    private Currency currency;
    private Passengers passengers;

    @Before
    public void setup() {
        WebDriverManager.edgedriver().setup();
        this.driver = new EdgeDriver();
        this.currency = new Currency(this.driver);
        this.passengers = new Passengers(this.driver);
    }

    @Test
    public void currency() {
        this.currency.test();
    }

    @Test
    public void passengers() {
        this.passengers.test();

    }

    @After
    public void end() {
      //  this.driver.quit();
    }

}
