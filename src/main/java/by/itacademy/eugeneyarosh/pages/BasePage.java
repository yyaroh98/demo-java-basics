package by.itacademy.eugeneyarosh.pages;

public class BasePage {

    protected String BASE_URL = "BASE URL";

    public void open() {
        System.out.println("Пользователь открыл страницу " + BASE_URL);
    }
}
