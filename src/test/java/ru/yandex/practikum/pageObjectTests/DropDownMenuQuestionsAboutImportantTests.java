package ru.yandex.practikum.pageObjectTests;
import org.junit.Assert;
import org.junit.Test;
import ru.yandex.practikum.pageObject.MainPage;

public class DropDownMenuQuestionsAboutImportantTests extends BaseTest {
    @Test
    public void dropDownMenu1ShouldBeClickableTest(){
        //вводим номер пункта меню
        int numberItemMenu = 1;
        MainPage mainPage = new MainPage(driver);
        mainPage.clickOnTheMenuItem(numberItemMenu).click();
        String actual = mainPage.getCheckTextFromDropdownField(numberItemMenu);
        String expected = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        Assert.assertEquals("Текст должен соответствовать " +
                "ожидаемому. ",expected, actual);
    }
    @Test
    public void dropDownMenu2ShouldBeClickableTest(){
        //вводим номер пункта меню
        int numberItemMenu = 2;
        MainPage mainPage = new MainPage(driver);
        mainPage.clickOnTheMenuItem(numberItemMenu).click();
        String actual = mainPage.getCheckTextFromDropdownField(numberItemMenu);
        String expected = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете " +
                "просто сделать несколько заказов — один за другим.";
        Assert.assertEquals("Текст должен соответствовать " +
                "ожидаемому. ",expected, actual);
    }
    @Test
    public void dropDownMenu3ShouldBeClickableTest(){
        //вводим номер пункта меню
        int numberItemMenu = 3;
        MainPage mainPage = new MainPage(driver);
        mainPage.clickOnTheMenuItem(numberItemMenu).click();
        String actual = mainPage.getCheckTextFromDropdownField(numberItemMenu);
        String expected = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт" +
                " времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли" +
                " самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        Assert.assertEquals("Текст должен соответствовать " +
                "ожидаемому. ",expected, actual);
    }
    @Test
    public void dropDownMenu4ShouldBeClickableTest(){
        //вводим номер пункта меню
        int numberItemMenu = 4;
        MainPage mainPage = new MainPage(driver);
        mainPage.clickOnTheMenuItem(numberItemMenu).click();
        String actual = mainPage.getCheckTextFromDropdownField(numberItemMenu);
        String expected = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        Assert.assertEquals("Текст должен соответствовать " +
                "ожидаемому. ",expected, actual);
    }
    @Test
    public void dropDownMenu5ShouldBeClickableTest(){
        //вводим номер пункта меню
        int numberItemMenu = 5;
        MainPage mainPage = new MainPage(driver);
        mainPage.clickOnTheMenuItem(numberItemMenu).click();
        String actual = mainPage.getCheckTextFromDropdownField(numberItemMenu);
        String expected = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку " +
                "по красивому номеру 1010.";
        Assert.assertEquals("Текст должен соответствовать " +
                "ожидаемому. ",expected, actual);
    }
    @Test
    public void dropDownMenu6ShouldBeClickableTest(){
        //вводим номер пункта меню
        int numberItemMenu = 6;
        MainPage mainPage = new MainPage(driver);
        mainPage.clickOnTheMenuItem(numberItemMenu).click();
        String actual = mainPage.getCheckTextFromDropdownField(numberItemMenu);
        String expected = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если " +
                "будете кататься без передышек и во сне. Зарядка не понадобится.";
        Assert.assertEquals("Текст должен соответствовать " +
                "ожидаемому. ",expected, actual);
    }
    @Test
    public void dropDownMenu7ShouldBeClickableTest(){
        //вводим номер пункта меню
        int numberItemMenu = 7;
        MainPage mainPage = new MainPage(driver);
        mainPage.clickOnTheMenuItem(numberItemMenu).click();
        String actual = mainPage.getCheckTextFromDropdownField(numberItemMenu);
        String expected = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже " +
                "не попросим. Все же свои.";
        Assert.assertEquals("Текст должен соответствовать " +
                "ожидаемому. ",expected, actual);
    }
    @Test
    public void dropDownMenu8ShouldBeClickableTest() {
        //вводим номер пункта меню
        int numberItemMenu = 8;
        MainPage mainPage = new MainPage(driver);
        mainPage.clickOnTheMenuItem(numberItemMenu).click();
        String actual = mainPage.getCheckTextFromDropdownField(numberItemMenu);
        String expected = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        Assert.assertEquals("Текст должен соответствовать " +
                "ожидаемому. ",expected, actual);
    }
}
