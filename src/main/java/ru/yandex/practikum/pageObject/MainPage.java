package ru.yandex.practikum.pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class MainPage extends BasePage {
    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
    public MainPage(WebDriver driver){
        super(driver);
    }
    //открываем страницу сайта и нажимает кнопку cookie
    public void navigate(){
        driver.get("https://qa-scooter.praktikum-services.ru/");
        driver.findElement(buttonCookie).click();
    }
    //локатор для кнопки Заказать наверху страницы
    protected final By buttonOrderOnTheTop = By.xpath("//*[@class='Button_Button__ra12g']");
    //локатор для кнопки Заказать внизу страницы
    protected final By buttonOrderOnTheDown = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    //локатор для закрытия панели cookie
    protected final By buttonCookie = By.id("rcc-confirm-button");

    //метод для теста клика по пунктам меню
    public WebElement clickOnTheMenuItem(int numberItem){
        numberItem = numberItem - 1;
        List<WebElement> elementList = driver.findElements(By.className("accordion__button"));
        WebElement element = elementList.get(numberItem);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        return elementList.get(numberItem);
    }
    //метод для проверки открылось ли меню
    public String getCheckTextFromDropdownField(int numberItem){
        numberItem = numberItem - 1;
        List<WebElement> elementList = driver.findElements(By.className("accordion__panel"));
        wait.until(ExpectedConditions.visibilityOf(elementList.get(numberItem)));
        return elementList.get(numberItem).getText();
    }
    //метод для нажатия верхней кнопки Заказать
    public void clickOnTheButtonOrderOnTheTop() {
        driver.findElement(buttonOrderOnTheTop).click();
    }
    //метод для нажатия нижней кнопки Заказать
    public void clickOnTheButtonOrderBelow() {
        WebElement element = driver.findElement(buttonOrderOnTheDown);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(buttonOrderOnTheDown).click();
    }
}
