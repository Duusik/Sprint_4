package ru.yandex.practikum.pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage extends BasePage {
    //переменные для тестовых данных
    private final String name;
    private final String surname;
    private final String address;
    private final String stationMetro;
    private final String phoneNumber;
    //метод для ввода тестовых данных(надеюсь правильный коммент)
    public OrderPage(WebDriver driver, String name, String surname, String address, String stationMetro, String phoneNumber){
        super(driver);
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.stationMetro = stationMetro;
        this.phoneNumber = phoneNumber;
    }
    //локатор поля для ввода имени заказчика
    private final By nameCustomerField = By.xpath("//input[@placeholder='* Имя']");
    //локатор поля для ввода фамилии заказчика
    private final By surnameCustomerField = By.xpath("//input[@placeholder='* Фамилия']");
    //локатор поля для ввода адреса
    private final By addressCustomerField = By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']");
    //локатор поля для ввода номера телефона заказчика
    private final By phoneNumberField = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']");
    //локатор кнопки далее
    private final By buttonNext = By.xpath("//*[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    //
    public void customerInformationFields(Object[][] dataCustomer) {
        inputName(name);
        inputSurname(surname);
        inputAddress(address);
        inputStationMetro(stationMetro);
        inputPhoneNumber(phoneNumber);
    }
    //метод выбора метро в списке
    public void inputStationMetro(String stationMetro) {
        driver.findElement(By.xpath("//*[@placeholder= '* Станция метро']")).click();
        driver.findElement(By.xpath("//*[@placeholder= '* Станция метро']")).sendKeys(stationMetro);
        driver.findElement(By.xpath("//div[@class='select-search__select']//*[text()='"+stationMetro+"']")).click();
    }
    //метод для поля телефон
    public void inputPhoneNumber(String inputPhoneNumber) {
        driver.findElement(phoneNumberField).sendKeys(inputPhoneNumber);
    }
    //метод для кнопки далее
    public void clickOnTheButtonNext() {
        driver.findElement(buttonNext).click();
    }
    //метод для ввода имени
    public void inputName(String name) {
        driver.findElement(nameCustomerField).sendKeys(name);
    }
    //метод для ввода фамилии
    public void inputSurname(String surname) {
        driver.findElement(surnameCustomerField).sendKeys(surname);
    }
    //метод для ввода адреса
    public void inputAddress(String address) {
        driver.findElement(addressCustomerField).sendKeys(address);
    }


}
