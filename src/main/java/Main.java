import callendar.Calendar;
import checkbox.CheckBox;
import dropdown.Country;
import dropdown.Currency;
import dropdown.FromTo;
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
    private Country country;
    private FromTo fromTo;
    private CheckBox checkBox;
    private Calendar calendar;

    @Before
    public void setup() {
        WebDriverManager.edgedriver().setup();
        this.driver = new EdgeDriver();
        this.currency = new Currency(this.driver);
        this.passengers = new Passengers(this.driver);
        this.country = new Country(this.driver);
        this.fromTo = new FromTo(this.driver);
        this.checkBox = new CheckBox(this.driver);
        this.calendar = new Calendar(this.driver);
    }

    @Test
    public void currency() {
        this.currency.test();
    }

    @Test
    public void passengers() {
        this.passengers.test();
    }

    @Test
    public void country() throws InterruptedException {
        this.country.test();
    }

    @Test
    public void fromTo() {
        this.fromTo.test();
    }

    @Test
    public void checkbox() throws InterruptedException {
        this.checkBox.test();
    }

    @Test
    public void calendar() {
        this.calendar.test();
    }

    @After
    public void end() {
        //  this.driver.quit();
    }

}
