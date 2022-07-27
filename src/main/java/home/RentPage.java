package home;
import home.data.Rent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RentPage {
    private final WebDriver driver;
    private final By inputDate = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    private final By chooseDate = By.xpath(".//div[@class='react-datepicker__month']//div[contains(@class,'react-datepicker__day')]");
    private final By inputPeriod = By.xpath(".//div[@class='Dropdown-placeholder']");
    private final By choosePeriod = By.xpath(".//div[text()='двое суток']");
    private final By choosePeriod_2 = By.xpath(".//div[text()='четверо суток']");
    private final By chooseColor = By.id("black");
    private final By chooseColor_2 = By.id("grey");

    private final By inputComment = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    private final By buttonOrder = By.xpath(".//div[@class='Order_Buttons__1xGrp']/button[text()='Заказать']");
    private final By buttonOrderYes = By.xpath(".//div[@class='Order_Buttons__1xGrp']/button[text()='Да']");
    private final By orderCompleted = By.xpath(".//div[@class='Order_ModalHeader__3FDaJ'][text()='Заказ оформлен']");

    public RentPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillRentPage(Rent rent){
        fillDate(rent.getDate());
        fillPeriod(rent.getPeriod());
        fillColor(rent.getColor());
        fillComment(rent.getComment());
    }
    public void fillDate (String date){
        driver.findElement(inputDate).click();
        driver.findElement(chooseDate).click();
    }

    public void  fillPeriod (String period){
        driver.findElement(inputPeriod).click();
        driver.findElement(choosePeriod).click();
    }

    public void fillColor (String color) {
        driver.findElement(chooseColor).click();
    }
    public void fillComment (String comment) {
        driver.findElement(inputComment).sendKeys(comment);
    }
    public void clickButtonOrder () {
        driver.findElement(buttonOrder).click();
    }
    public void clickButtonOrderYes () {
        driver.findElement(buttonOrderYes).click();
    }
    public String getOrderCompleted () {
        return driver.findElement(orderCompleted).getText();
    }

}



