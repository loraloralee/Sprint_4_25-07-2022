package home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;

public class HomePage {
    public static final String URL="https://qa-scooter.praktikum-services.ru/";
    private final WebDriver driver ;

    //Уведомление о куках
    private final By cookeMessageButton = By.className("App_CookieButton__3cvqF");

    //кнопка Заказать маленькая
    protected final By orderSmallButton = By.xpath(".//div[@class='Header_Nav__AGCXC']/button[text()='Заказать']");
    //кнопка Заказать большая
    protected final By orderBigButton =By.xpath(".//div[@class='Home_FinishButton__1_cWm']/button[text()='Заказать']");
    private final By questionOne = By.id("accordion__heading-0");
    private final By questionTwo = By.id("accordion__heading-1");
    private final By questionThree = By.id("accordion__heading-2");
    private final By questionFour = By.id("accordion__heading-3");
    private final By questionFive = By.id("accordion__heading-4");
    private final By questionSix = By.id("accordion__heading-5");
    private final By questionSeven = By.id("accordion__heading-6");
    private final By questionEight = By.id("accordion__heading-7");
    private final By answerOne = By.id("accordion__panel-0");
    private final By answerTwo = By.id("accordion__panel-1");
    private final By answerThree = By.id("accordion__panel-2");
    private final By answerFour = By.id("accordion__panel-3");
    private final By answerFive = By.id("accordion__panel-4");
    private final By answerSix = By.id("accordion__panel-5");
    private final By answerSeven = By.id("accordion__panel-6");
    private final By answerEight = By.id("accordion__panel-7");

    public HomePage(WebDriver driver) {

        this.driver = driver;
    }
    public void clickCookeMessageButton() {
        driver.findElement(cookeMessageButton).click();
    }

    public String getAnswerOne(){
        driver.findElement(questionOne).click();
        return driver.findElement(answerOne).getText();
    }
    public String getAnswerTwo(){
        driver.findElement(questionTwo).click();
        return driver.findElement(answerTwo).getText();
    }
    public String getAnswerThree(){
        driver.findElement(questionThree).click();
        return driver.findElement(answerThree).getText();
    }
    public String getAnswerFour(){
        driver.findElement(questionFour).click();
        return driver.findElement(answerFour).getText();
    }
    public String getAnswerFive(){
        driver.findElement(questionFive).click();
        return driver.findElement(answerFive).getText();
    }
    public String getAnswerSix(){
        driver.findElement(questionSix).click();
        return driver.findElement(answerSix).getText();
    }
    public String getAnswerSeven(){
        driver.findElement(questionSeven).click();
        return driver.findElement(answerSeven).getText();
    }
    public String getAnswerEight(){
        driver.findElement(questionEight).click();
        return driver.findElement(answerEight).getText();
    }

    public void clickOrderSmallButton() {

        driver.findElement(orderSmallButton).click();
    }
    public void clickOrderBigButton() {
        WebElement element = driver.findElement(By.xpath(".//div[@class='Header_Nav__AGCXC']/button[text()='Заказать']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);

        driver.findElement(orderBigButton).click();
    }
}


