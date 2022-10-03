package ru.yandex.practikum.pageObjectTests;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.yandex.practikum.pageObject.AboutRent;
import ru.yandex.practikum.pageObject.MainPage;
import ru.yandex.practikum.pageObject.OrderPage;
@RunWith(Parameterized.class)
public class MakeOrderTests extends BaseTest {
    private final String name;
    private final String surname;
    private final String address;
    private final String stationMetro;
    private final String phoneNumber;
    private final String data;

    public MakeOrderTests(String name, String surname, String address, String stationMetro, String phoneNumber, String data) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.stationMetro = stationMetro;
        this.phoneNumber = phoneNumber;
        this.data = data;
    }

    @Parameterized.Parameters
    public static Object[][] getDataCustomer() {
        //Введите тестовые данные
        return new Object[][]{
                {"Андрей", "Сухов", "г.Рыбинск", "Черкизовская", "+79201341452", "18.10.2022"},
                {"Илья", "Ильичев", "г.Ярославль", "Алма-Атинская", "+79022226435", "25.11.2022"},
            };
    }

    @Test
    public void placeOrderUsingButtonOnTheTop() {
        MainPage mainPage = new MainPage(driver);
        mainPage.navigate();
        mainPage.clickOnTheButtonOrderOnTheTop();
        OrderPage orderPage = new OrderPage(driver, name, surname, address, stationMetro, phoneNumber);
        orderPage.customerInformationFields(MakeOrderTests.getDataCustomer());
        orderPage.clickOnTheButtonNext();
        AboutRent aboutRent = new AboutRent(driver, data);
        aboutRent.selectDataDelivery();
        aboutRent.selectPeriodRent();
        aboutRent.clickOnTheCheckBoxBlack();
        aboutRent.inputComment("Скорее пожалуйста");
        aboutRent.clickOnTheOrderButton();
        aboutRent.clickYesButton();
        Assert.assertTrue("Ошибка. Не найдено подтверждение заказа", aboutRent.isDisplay());
    }
    @Test
    public void placeOrderUsingButtonBelow() {
        MainPage mainPage = new MainPage(driver);
        mainPage.navigate();
        mainPage.clickOnTheButtonOrderBelow();
        OrderPage orderPage = new OrderPage(driver, name, surname, address, stationMetro, phoneNumber);
        orderPage.customerInformationFields(MakeOrderTests.getDataCustomer());
        orderPage.clickOnTheButtonNext();
        AboutRent aboutRent = new AboutRent(driver, data);
        aboutRent.selectDataDelivery();
        aboutRent.selectPeriodRent();
        aboutRent.clickOnTheCheckBoxBlack();
        aboutRent.inputComment("Хочу скорее кататься");
        aboutRent.clickOnTheOrderButton();
        aboutRent.clickYesButton();
        Assert.assertTrue("Ошибка. Не найдено подтверждение заказа", aboutRent.isDisplay());
    }
}