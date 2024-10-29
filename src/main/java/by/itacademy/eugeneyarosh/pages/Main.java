package by.itacademy.eugeneyarosh.pages;

public class Main {
    public static void main(String[] args) {
        HomePage homePage = new HomePage();
        homePage.open();
        System.out.println("Заголовок домашней страницы: " + homePage.getTitle());
        homePage.clickLogin();

        LoginPage loginPage = new LoginPage();
        loginPage.open();
        System.out.println("Заголовок страницы логина: " + loginPage.getTitle());
    }
}
