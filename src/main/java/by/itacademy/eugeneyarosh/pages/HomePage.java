package by.itacademy.eugeneyarosh.pages;

public class HomePage extends BasePage {

    protected String HOME_URL = getBASE_URL() + "/домашняя страница";

    protected String title = "Домашняя страница";

    public String getHOME_URL() {
        return HOME_URL;
    }

    public void setHOME_URL(String HOME_URL) {
        this.HOME_URL = HOME_URL;
    }

    public void open() {
        System.out.println("Пользователь открыл страницу " + getHOME_URL());
    }

    public String getTitle() {
        return title;
    }



}
