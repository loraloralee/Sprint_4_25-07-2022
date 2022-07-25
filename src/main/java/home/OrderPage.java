package home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class OrderPage {
    private final WebDriver driver;
    private final By inputName = By.xpath(".//input[@placeholder='* Имя']");
    private final By inputSurname = By.xpath(".//input[@placeholder='* Фамилия']");
    private final By inputAddress = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    private final By inputStation = By.xpath(".//input[@placeholder='* Станция метро']");
    private final By inputPhone = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    private final By inputNameStation = By.xpath(".//ul[contains(@class,'select-search__options')]/li");
    private final By inputNameStation_2 = By.xpath(".//div[@class='Order_Circle__3uWFr']");
    private final By buttonNext = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");


    public OrderPage(WebDriver driver) {

        this.driver = driver;
    }
    public void fillOrderForm(String name,String surname,String address, String station,String phone ){
        fillName(name);
        fillSurname(surname);
        fillAddress(address);
        fillStation(station);
        fillPhone(phone);
    }
    private void fillName(String name) {
        driver.findElement(inputName).sendKeys(name);
    }
    private void fillSurname(String surname) {
        driver.findElement(inputSurname).sendKeys(surname);
    }
    private void fillAddress(String address) {
        driver.findElement(inputAddress).sendKeys(address);
    }
    private void fillStation(String station) {
        driver.findElement(inputStation).click();
        driver.findElement(inputNameStation).click();
    }

    private void fillPhone(String phone) {
        driver.findElement(inputPhone).sendKeys(phone);
    }
    public void clickButtonNext() {
        driver.findElement(buttonNext).click();
    }
}
