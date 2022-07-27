package test;

import home.*;
import home.data.Order;
import home.data.Rent;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.hamcrest.CoreMatchers.containsString;
import org.hamcrest.MatcherAssert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.concurrent.TimeUnit;

@RunWith(Parameterized.class)
public class CheckOrderTest {
    private WebDriver driver;
    private final String name;
    private final String surname;
    private final String address;
    private final String station;
    private final String phone;
    private final String date;
    private final String period;
    private final String color;
    private final String comment;

    public CheckOrderTest(String name, String surname, String address, String station, String phone, String date, String period, String color, String comment) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.station = station;
        this.phone = phone;
        this.date = date;
        this.period = period;
        this.color = color;
        this.comment = comment;
    }
    @Parameterized.Parameters
    public static Object[][] getDate () {
        return new Object[][] {
                {"Лариса","Ли","город Ташкент","Бульвар Рокосовского","+99899999999","27.07.2022", "двое суток", "black", "хочу бургер"},
                {"Володя","Кит","город Псков","Черкизовская","+7688999999","27.07.2022", "двое суток", "black", "хочу колы]"}
        };
    }

    @Before
    public void setPropAndStartBrowser() {
        /*WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver/WebDriver/bin/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(HomePage.URL);*/
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(HomePage.URL);
    }

    @After
    public void teardown() {
        driver.quit(); // Закрыть браузер
    }
    @Test
    public void checkOrderSmallButtonTest() {
        HomePage homePage = new HomePage(driver);
        homePage.clickCookeMessageButton();
        homePage.clickOrderSmallButton();

        OrderPage orderPage=new OrderPage(driver);
        Order order=new Order(name,surname,address,station,phone );
        orderPage.fillOrderForm(order);
        orderPage.clickButtonNext();

        RentPage rentPage=new RentPage(driver);
        Rent rent=new Rent(date,period,color,comment);
        rentPage.fillRentPage(rent);
        rentPage.clickButtonOrder();
        rentPage.clickButtonOrderYes();
        String orderCompleted="Заказ оформлен";
        MatcherAssert.assertThat(rentPage.getOrderCompleted(), containsString(orderCompleted));

    }
    @Test
    public void checkOrderBigButtonTest() {
        HomePage homePage = new HomePage(driver);
        homePage.clickCookeMessageButton();
        homePage.clickOrderBigButton();

        OrderPage orderPage=new OrderPage(driver);
        Order order=new Order(name,surname,address,station,phone );
        orderPage.fillOrderForm(order);
        orderPage.clickButtonNext();

        RentPage rentPage=new RentPage(driver);
        Rent rent=new Rent(date,period,color,comment);
        rentPage.fillRentPage(rent);
        rentPage.clickButtonOrder();
        rentPage.clickButtonOrderYes();
        String orderCompleted="Заказ оформлен";
        MatcherAssert.assertThat(rentPage.getOrderCompleted(), containsString(orderCompleted));

    }
}




