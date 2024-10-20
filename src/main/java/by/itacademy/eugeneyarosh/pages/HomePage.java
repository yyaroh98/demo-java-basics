package by.itacademy.eugeneyarosh.pages;

public class HomePage extends BasePage {

    protected String HOME_URL = getBASE_URL() + "/домашняя страница";

    protected String title = "Домашняя страница";


    public void open() {
        System.out.println("Пользователь открыл страницу " + HOME_URL);

    }
}
