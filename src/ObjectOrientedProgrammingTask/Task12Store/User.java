package ObjectOrientedProgrammingTask.Task12Store;

//Создать класс User, содержащий логин, пароль и объект класса Basket.
// Создать объект класса User.
public class User {
    private String login;
    private String password;
    private  Basket basket;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }
}
