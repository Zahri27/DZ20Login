public class User {
    private String login;
    private Account account;

    public User(String login, String password) {
        this.login = login;
        this.account = new Account(password);
    }

    public void displayAccount() {
        System.out.println("Account Login successful! Login: " + login + ", Password: " + account.getPassword());
    }

    public Account getAccount() {
        return account;
    }

    public class Account {
        private String password;

        public Account(String password) {
            this.password = password;
        }

        public String getPassword() {
            return password;
        }
    }
}