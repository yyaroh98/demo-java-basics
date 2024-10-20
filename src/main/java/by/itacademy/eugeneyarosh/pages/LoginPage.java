package by.itacademy.eugeneyarosh.pages;

public class LoginPage extends BasePage {

    protected String LOGIN_PAGE = getBASE_URL() + "/форма логина";
    String title = "Форма логина";

    public String getLOGIN_PAGE() {
        return LOGIN_PAGE;
    }

    public void setLOGIN_PAGE(String LOGIN_PAGE) {
        this.LOGIN_PAGE = LOGIN_PAGE;
    }

    public void open() {
        System.out.println("Пользователь открыл страницу " + getLOGIN_PAGE());
    }


}
