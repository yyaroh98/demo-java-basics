package by.itacademy.eugeneyarosh.pages;

public class BasePage {

    protected String BASE_URL = "BASE URL";

    public String getBASE_URL() {
        return BASE_URL;
    }

    public void setBASE_URL(String BASE_URL) {
        this.BASE_URL = BASE_URL;
    }

    public void open() {
        System.out.println("Пользователь открыл страницу " + getBASE_URL());
    }
}
