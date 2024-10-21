package by.itacademy.eugeneyarosh.pages;

public class HomePage extends BasePage {

    protected String HOME_URL = BASE_URL + "/домашняя страница";
    String title = "Домашняя страница";

    public String getTitle() {
        return title;
    }

    public void clickLogin() {
        System.out.println("Пользователь кликнул по кнопке Войти");
    }

    public void open() {
        System.out.println("Пользователь открыл страницу " + HOME_URL);
    }
}

