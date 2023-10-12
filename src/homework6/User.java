package homework6;

public class User {

    public String userName;
    private int age;
    public String email;
    private String password;
    public boolean isActive;
    public double amountSpentMoney;

    public User() {
    }

    public User(String userName) {
        this.userName = userName;
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 18) {
            this.age = age;
        } else {
            System.out.println("Error: user must be 18 or older");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() >= 8 && password.length() < 21) {
            this.password = password;
        } else {
            System.out.println("Password must contain at least 8 characters and at most 20 characters");
        }
    }

    public void email(String email) {
        this.email = email;
    }

    public void makePurchase(double purchasePrice) {
        this.amountSpentMoney += purchasePrice;
    }

    public void printTotalAmountOfSpentMoney() {
        System.out.println("Total spent: " + this.amountSpentMoney + "$");
    }

    public boolean isActive() {
        return age >= 18;
    }
}