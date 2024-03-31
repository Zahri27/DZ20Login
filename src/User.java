public class User {
    private String login;
    private Account account;

    public User(String login, String password) {
        this.login = login;
        this.account = new Account(password, this);
    }

    public Account getAccount() {
        return account;
    }

    String getLogin() {
        return login;
    }
}

class Account {
    private String password;
    private User user;

    public Account(String password, User user) {
        this.password = password;
        this.user = user;
    }

    public void displayAccount() {
        System.out.println("Account Login successful! Login: " + user.getLogin() + ", Password: " + password);
    }
}
