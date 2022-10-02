package ru.yandex.practikum.pageObject;
import org.openqa.selenium.By;
<<<<<<< HEAD
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class AboutRent extends BasePage {
    public final String data;
    public AboutRent(WebDriver driver, String data){
        super(driver);
        this.data = data;

=======
import org.openqa.selenium.WebDriver;

public class AboutRent extends BasePage {
    public AboutRent(WebDriver driver){
        super(driver);
>>>>>>> origin/develop
    }
    //локатор для поля открытия календаря
    private final By dateField = By.xpath("//input[@placeholder='* Когда привезти самокат']");
    //локатор для выбора даты календаря
<<<<<<< HEAD
    private final By selectDateDelivery = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
=======
    private final By selectDateDelivery = By.xpath("//div[@class='react-datepicker__day react-datepicker__day--030 react-datepicker__day--keyboard-selected react-datepicker__day--today']");
>>>>>>> origin/develop
    //локатор поля выбора срока аренды
    private final By rentPeriodField = By.xpath("//div[@class='Dropdown-placeholder']");
    //локатор выбора срока аренды из списка
    private final By selectPeriodDay = By.xpath("//div[text()='семеро суток']");
    //локатор checkbox выбор черного самоката
    private final By checkBoxBlack = By.id("black");
    //локатор поля комментарий курьеру
    private final By commentField = By.xpath("//input[@placeholder='Комментарий для курьера']");
    //локатор кнопки Заказать
    private final By orderButton = By.xpath("//*[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    //локатор подтверждения заказа
    private final By buttonYes = By.xpath("//button[text()='Да']");
    //локатор проверки принят ли заказ
    private final By locatorForAssert = By.xpath("//div[@class='Order_ModalHeader__3FDaJ'][text()='Заказ оформлен']");
    //выбираем дату доставки
    public void selectDataDelivery() {
        driver.findElement(dateField).click();
<<<<<<< HEAD
        driver.findElement(selectDateDelivery).sendKeys(data + Keys.ENTER);
=======
        driver.findElement(selectDateDelivery).click();
>>>>>>> origin/develop
    }
    //выбираем период аренды
    public void selectPeriodRent() {
        driver.findElement(rentPeriodField).click();
        driver.findElement(selectPeriodDay).click();
    }
    //выбираем черный самокат
    public void clickOnTheCheckBoxBlack() {
        driver.findElement(checkBoxBlack).click();
    }
    //вводим комментарий
    public void inputComment(String comment) {
        driver.findElement(commentField).sendKeys(comment);
    }
    //жмем кнопку Заказать
    public void clickOnTheOrderButton() {
        driver.findElement(orderButton).click();
    }
    //жмем ДА в подтверждении заказа
    public void clickYesButton() {
        driver.findElement(buttonYes).click();
    }
    //проверка принят ли заказ
    public boolean isDisplay() {
        return driver.findElement(locatorForAssert).isDisplayed();
    }
}
